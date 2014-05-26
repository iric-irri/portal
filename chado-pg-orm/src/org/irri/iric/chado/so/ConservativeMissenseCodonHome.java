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
 * Home object for domain model class ConservativeMissenseCodon.
 * @see org.irri.iric.chado.so.ConservativeMissenseCodon
 * @author Hibernate Tools
 */
public class ConservativeMissenseCodonHome {

	private static final Log log = LogFactory
			.getLog(ConservativeMissenseCodonHome.class);

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

	public void persist(ConservativeMissenseCodon transientInstance) {
		log.debug("persisting ConservativeMissenseCodon instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ConservativeMissenseCodon instance) {
		log.debug("attaching dirty ConservativeMissenseCodon instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ConservativeMissenseCodon instance) {
		log.debug("attaching clean ConservativeMissenseCodon instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ConservativeMissenseCodon persistentInstance) {
		log.debug("deleting ConservativeMissenseCodon instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ConservativeMissenseCodon merge(
			ConservativeMissenseCodon detachedInstance) {
		log.debug("merging ConservativeMissenseCodon instance");
		try {
			ConservativeMissenseCodon result = (ConservativeMissenseCodon) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ConservativeMissenseCodon findById(
			org.irri.iric.chado.so.ConservativeMissenseCodonId id) {
		log.debug("getting ConservativeMissenseCodon instance with id: " + id);
		try {
			ConservativeMissenseCodon instance = (ConservativeMissenseCodon) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ConservativeMissenseCodon",
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

	public List findByExample(ConservativeMissenseCodon instance) {
		log.debug("finding ConservativeMissenseCodon instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ConservativeMissenseCodon")
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
