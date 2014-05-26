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
 * Home object for domain model class FiveCarboxymethyluridine.
 * @see org.irri.iric.chado.so.FiveCarboxymethyluridine
 * @author Hibernate Tools
 */
public class FiveCarboxymethyluridineHome {

	private static final Log log = LogFactory
			.getLog(FiveCarboxymethyluridineHome.class);

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

	public void persist(FiveCarboxymethyluridine transientInstance) {
		log.debug("persisting FiveCarboxymethyluridine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(FiveCarboxymethyluridine instance) {
		log.debug("attaching dirty FiveCarboxymethyluridine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FiveCarboxymethyluridine instance) {
		log.debug("attaching clean FiveCarboxymethyluridine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(FiveCarboxymethyluridine persistentInstance) {
		log.debug("deleting FiveCarboxymethyluridine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FiveCarboxymethyluridine merge(
			FiveCarboxymethyluridine detachedInstance) {
		log.debug("merging FiveCarboxymethyluridine instance");
		try {
			FiveCarboxymethyluridine result = (FiveCarboxymethyluridine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FiveCarboxymethyluridine findById(
			org.irri.iric.chado.so.FiveCarboxymethyluridineId id) {
		log.debug("getting FiveCarboxymethyluridine instance with id: " + id);
		try {
			FiveCarboxymethyluridine instance = (FiveCarboxymethyluridine) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.FiveCarboxymethyluridine",
							id);
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

	public List findByExample(FiveCarboxymethyluridine instance) {
		log.debug("finding FiveCarboxymethyluridine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.FiveCarboxymethyluridine")
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
