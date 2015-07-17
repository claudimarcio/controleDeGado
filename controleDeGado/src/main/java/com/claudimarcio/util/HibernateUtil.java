package com.claudimarcio.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author claudimarcio
 */
public class HibernateUtil {

    private static final SessionFactory sessionfactory;
    public static final String HIBERANTE_SESSION = "hibernate_session";

    static {

        try {
            System.out.println("Tentando abrir uma session factory");

            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceregistry = new ServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).buildServiceRegistry();

            sessionfactory = configuration.buildSessionFactory(serviceregistry);
            
             System.out.println("Session Factory conectou corretamente");
        } catch (Exception ex) {
            
            System.out.println("Ocorreu um erro ao iniciar a sessionFacture. "+ex);
            throw new ExceptionInInitializerError(ex);
            
                    
                    
        }

    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }

}
