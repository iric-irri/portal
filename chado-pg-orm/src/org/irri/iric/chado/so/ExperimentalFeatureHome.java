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
 * Home object for domain model class ExperimentalFeature.
 * @see org.irri.iric.chado.so.ExperimentalFeature
 * @author Hibernate Tools
 */
public class ExperimentalFeatureHome {

	private static final Log log = LogFactory
			.getLog(ExperimentalFeatureHome.class);

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

	public void persist(ExperimentalFeature transientInstance) {
		log.debug("persisting ExperimentalFeature instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ExperimentalFeature instance) {
		log.debug("attaching dirty ExperimentalFeature instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExperimentalFeature instance) {
		log.debug("attaching clean ExperimentalFeature instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ExperimentalFeature persistentInstance) {
		log.debug("deleting ExperimentalFeature instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExperimentalFeature merge(ExperimentalFeature detachedInstance) {
		log.debug("merging ExperimentalFeature instance");
		try {
			ExperimentalFeature result = (ExperimentalFeature) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExperimentalFeature findById(
			org.irri.iric.chado.so.ExperimentalFeatureId id) {
		log.debug("getting ExperimentalFeature instance with id: " + id);
		try {
			ExperimentalFeature instance = (ExperimentalFeature) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ExperimentalFeature", id);
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

	public List findByExample(ExperimentalFeature instance) {
		log.debug("finding ExperimentalFeature instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ExperimentalFeature")
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
