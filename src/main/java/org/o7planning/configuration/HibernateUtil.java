package org.o7planning.configuration;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil {

@PersistenceContext EntityManager entityManager;

/*private SessionFactory sessionFactory;*/

public <T> void  create(final T entity)
{

	entityManager.persist(entity);
}

public <T> T update(final T entity)
{
	entityManager.merge(entity);
	return entity;
}
public <T> void  delete(final T entity)
{
	entityManager.remove(entity);
}




/*public <T> Serializable create(final T entity) {
	entityManager.persist(entity);
return sessionFactory.getCurrentSession().save(entity); 
}

public <T> T update(final T entity) {
sessionFactory.getCurrentSession().update(entity); 
return entity;
}

public <T> void delete(final T entity) {
sessionFactory.getCurrentSession().delete(entity);
}

public <T> void delete(Serializable id, Class<T> entityClass) {
T entity = fetchById(id, entityClass);
delete(entity);
}*/

@SuppressWarnings("unchecked") 
public <T> List<T> fetchAll(Class<T> entityClass) { 

	Query query =entityManager.createQuery("FROM "+entityClass.getName());
	System.out.print(query);
return query.getResultList(); 
}

@SuppressWarnings("rawtypes")
public <T> List fetchAll(String query) { 
return entityManager.createQuery(query).getResultList(); 
}


public <T> T fetchById(Serializable id, Class<T> entityClass) {
return (T) entityManager.find(entityClass, id);
} 
}