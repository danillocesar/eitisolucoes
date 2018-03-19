package br.com.eiti.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
 
public abstract class AbstractDao<PK extends Serializable, T> {
     
	@PersistenceContext
	private EntityManager entityManager;
    private final Class<T> persistentClass;
     
    @SuppressWarnings("unchecked")
    public AbstractDao(){
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    protected Criteria getCriteria(){
        return entityManager.unwrap(Session.class).createCriteria(persistentClass);
    }
 
    @SuppressWarnings("unchecked")
    public T getById(PK key) {
        return (T) getCriteria().add(Restrictions.eq("id", key)).uniqueResult();
    }
    public T insert(T entity) {
    	entityManager.persist(entity);
    	return entity;
    }
    public void update(T entity) {
    	entityManager.merge(entity);
    }
    
    public void delete(T entity) {
    	entityManager.remove(entity);
    }
    
    public void clear(){
    	entityManager.unwrap(Session.class).clear();
    }
}