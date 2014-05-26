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
 * Home object for domain model class BetaTurnLeftHandedTypeOne.
 * @see org.irri.iric.chado.so.BetaTurnLeftHandedTypeOne
 * @author Hibernate Tools
 */
public class BetaTurnLeftHandedTypeOneHome {

	private static final Log log = LogFactory
			.getLog(BetaTurnLeftHandedTypeOneHome.class);

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

	public void persist(BetaTurnLeftHandedTypeOne transientInstance) {
		log.debug("persisting BetaTurnLeftHandedTypeOne instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BetaTurnLeftHandedTypeOne instance) {
		log.debug("attaching dirty BetaTurnLeftHandedTypeOne instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BetaTurnLeftHandedTypeOne instance) {
		log.debug("attaching clean BetaTurnLeftHandedTypeOne instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BetaTurnLeftHandedTypeOne persistentInstance) {
		log.debug("deleting BetaTurnLeftHandedTypeOne instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BetaTurnLeftHandedTypeOne merge(
			BetaTurnLeftHandedTypeOne detachedInstance) {
		log.debug("merging BetaTurnLeftHandedTypeOne instance");
		try {
			BetaTurnLeftHandedTypeOne result = (BetaTurnLeftHandedTypeOne) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BetaTurnLeftHandedTypeOne findById(
			org.irri.iric.chado.so.BetaTurnLeftHandedTypeOneId id) {
		log.debug("getting BetaTurnLeftHandedTypeOne instance with id: " + id);
		try {
			BetaTurnLeftHandedTypeOne instance = (BetaTurnLeftHandedTypeOne) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.BetaTurnLeftHandedTypeOne",
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

	public List findByExample(BetaTurnLeftHandedTypeOne instance) {
		log.debug("finding BetaTurnLeftHandedTypeOne instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.BetaTurnLeftHandedTypeOne")
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
