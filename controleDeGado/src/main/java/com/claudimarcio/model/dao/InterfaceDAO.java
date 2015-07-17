
package com.claudimarcio.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author claudimarcio
 * @param <T>
 */
public interface InterfaceDAO<T> {
    
    void save(T entity);
    void update(T entity);
    void remove(T entity);
    void merge(T entity);
    T getEntity(Serializable id);

    /**
     *
     * @param criteria
     * @return
     */
    T getEntityByDetachedCriteria(DetachedCriteria criteria);
    List<T>getEntities();

    /**
     *
     * @param criteria
     * @return
     */
    List<T>getListByDetachedCriteria(DetachedCriteria criteria);
    
}
