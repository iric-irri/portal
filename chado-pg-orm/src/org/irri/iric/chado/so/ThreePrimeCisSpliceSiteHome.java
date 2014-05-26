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
 * Home object for domain model class ThreePrimeCisSpliceSite.
 * @see org.irri.iric.chado.so.ThreePrimeCisSpliceSite
 * @author Hibernate Tools
 */
public class ThreePrimeCisSpliceSiteHome {

	private static final Log log = LogFactory
			.getLog(ThreePrimeCisSpliceSiteHome.class);

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

	public void persist(ThreePrimeCisSpliceSite transientInstance) {
		log.debug("persisting ThreePrimeCisSpliceSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ThreePrimeCisSpliceSite instance) {
		log.debug("attaching dirty ThreePrimeCisSpliceSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ThreePrimeCisSpliceSite instance) {
		log.debug("attaching clean ThreePrimeCisSpliceSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ThreePrimeCisSpliceSite persistentInstance) {
		log.debug("deleting ThreePrimeCisSpliceSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ThreePrimeCisSpliceSite merge(
			ThreePrimeCisSpliceSite detachedInstance) {
		log.debug("merging ThreePrimeCisSpliceSite instance");
		try {
			ThreePrimeCisSpliceSite result = (ThreePrimeCisSpliceSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ThreePrimeCisSpliceSite findById(
			org.irri.iric.chado.so.ThreePrimeCisSpliceSiteId id) {
		log.debug("getting ThreePrimeCisSpliceSite instance with id: " + id);
		try {
			ThreePrimeCisSpliceSite instance = (ThreePrimeCisSpliceSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ThreePrimeCisSpliceSite",
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

	public List findByExample(ThreePrimeCisSpliceSite instance) {
		log.debug("finding ThreePrimeCisSpliceSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ThreePrimeCisSpliceSite")
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
