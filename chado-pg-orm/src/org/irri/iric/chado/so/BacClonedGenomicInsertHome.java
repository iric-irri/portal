package org.irri.iric.chado.so;

// Generated 05 26, 14 1:32:32 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class BacClonedGenomicInsert.
 * @see org.irri.iric.chado.so.BacClonedGenomicInsert
 * @author Hibernate Tools
 */
public class BacClonedGenomicInsertHome {

	private static final Log log = LogFactory
			.getLog(BacClonedGenomicInsertHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(BacClonedGenomicInsert transientInstance) {
		log.debug("persisting BacClonedGenomicInsert instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BacClonedGenomicInsert instance) {
		log.debug("attaching dirty BacClonedGenomicInsert instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BacClonedGenomicInsert instance) {
		log.debug("attaching clean BacClonedGenomicInsert instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BacClonedGenomicInsert persistentInstance) {
		log.debug("deleting BacClonedGenomicInsert instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BacClonedGenomicInsert merge(BacClonedGenomicInsert detachedInstance) {
		log.debug("merging BacClonedGenomicInsert instance");
		try {
			BacClonedGenomicInsert result = (BacClonedGenomicInsert) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BacClonedGenomicInsert findById(
			org.irri.iric.chado.so.BacClonedGenomicInsertId id) {
		log.debug("getting BacClonedGenomicInsert instance with id: " + id);
		try {
			BacClonedGenomicInsert instance = (BacClonedGenomicInsert) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.BacClonedGenomicInsert", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BacClonedGenomicInsert instance) {
		log.debug("finding BacClonedGenomicInsert instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.BacClonedGenomicInsert")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
