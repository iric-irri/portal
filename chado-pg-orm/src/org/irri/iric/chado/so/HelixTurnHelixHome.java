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
 * Home object for domain model class HelixTurnHelix.
 * @see org.irri.iric.chado.so.HelixTurnHelix
 * @author Hibernate Tools
 */
public class HelixTurnHelixHome {

	private static final Log log = LogFactory.getLog(HelixTurnHelixHome.class);

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

	public void persist(HelixTurnHelix transientInstance) {
		log.debug("persisting HelixTurnHelix instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(HelixTurnHelix instance) {
		log.debug("attaching dirty HelixTurnHelix instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HelixTurnHelix instance) {
		log.debug("attaching clean HelixTurnHelix instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(HelixTurnHelix persistentInstance) {
		log.debug("deleting HelixTurnHelix instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HelixTurnHelix merge(HelixTurnHelix detachedInstance) {
		log.debug("merging HelixTurnHelix instance");
		try {
			HelixTurnHelix result = (HelixTurnHelix) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public HelixTurnHelix findById(org.irri.iric.chado.so.HelixTurnHelixId id) {
		log.debug("getting HelixTurnHelix instance with id: " + id);
		try {
			HelixTurnHelix instance = (HelixTurnHelix) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.HelixTurnHelix", id);
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

	public List findByExample(HelixTurnHelix instance) {
		log.debug("finding HelixTurnHelix instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.HelixTurnHelix")
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
