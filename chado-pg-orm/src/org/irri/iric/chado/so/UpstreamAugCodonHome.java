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
 * Home object for domain model class UpstreamAugCodon.
 * @see org.irri.iric.chado.so.UpstreamAugCodon
 * @author Hibernate Tools
 */
public class UpstreamAugCodonHome {

	private static final Log log = LogFactory
			.getLog(UpstreamAugCodonHome.class);

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

	public void persist(UpstreamAugCodon transientInstance) {
		log.debug("persisting UpstreamAugCodon instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(UpstreamAugCodon instance) {
		log.debug("attaching dirty UpstreamAugCodon instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UpstreamAugCodon instance) {
		log.debug("attaching clean UpstreamAugCodon instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(UpstreamAugCodon persistentInstance) {
		log.debug("deleting UpstreamAugCodon instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UpstreamAugCodon merge(UpstreamAugCodon detachedInstance) {
		log.debug("merging UpstreamAugCodon instance");
		try {
			UpstreamAugCodon result = (UpstreamAugCodon) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UpstreamAugCodon findById(
			org.irri.iric.chado.so.UpstreamAugCodonId id) {
		log.debug("getting UpstreamAugCodon instance with id: " + id);
		try {
			UpstreamAugCodon instance = (UpstreamAugCodon) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.UpstreamAugCodon", id);
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

	public List findByExample(UpstreamAugCodon instance) {
		log.debug("finding UpstreamAugCodon instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.UpstreamAugCodon")
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
