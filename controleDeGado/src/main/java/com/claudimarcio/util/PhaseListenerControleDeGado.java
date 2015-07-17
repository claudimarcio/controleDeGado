package com.claudimarcio.util;

import com.claudimarcio.model.dao.FacesContextUtil;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.hibernate.Session;

/**
 *
 * @author claudimarcio
 */
public class PhaseListenerControleDeGado implements PhaseListener {

    // Antes  da fase
    @Override
    public void afterPhase(PhaseEvent phase) {
        System.out.println("Depois da Fasse. " + getPhaseId());
        if (phase.getPhaseId().equals(PhaseId.RESTORE_VIEW)) {
            System.out.println("Antes da Fasse. " + getPhaseId());
            Session session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            FacesContextUtil.setREQUEST_SESSION(session);

        }
    }

    //Depois da fase
    @Override
    public void beforePhase(PhaseEvent phase) {

        if (phase.getPhaseId().equals(PhaseId.RENDER_RESPONSE)) {

            Session session = FacesContextUtil.getREQUEST_SESSION();
            try {

                session.getTransaction().commit();
            } catch (Exception e) {
                if (session.getTransaction().isActive()) {

                    session.getTransaction().rollback();

                }

            } finally {

                session.close();
            }

        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
