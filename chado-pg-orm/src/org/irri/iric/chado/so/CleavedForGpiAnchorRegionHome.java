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
 * Home object for domain model class CleavedForGpiAnchorRegion.
 * @see org.irri.iric.chado.so.CleavedForGpiAnchorRegion
 * @author Hibernate Tools
 */
public class CleavedForGpiAnchorRegionHome {

	private static final Log log = LogFactory
			.getLog(CleavedForGpiAnchorRegionHome.class);

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

	public void persist(CleavedForGpiAnchorRegion transientInstance) {
		log.debug("persisting CleavedForGpiAnchorRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CleavedForGpiAnchorRegion instance) {
		log.debug("attaching dirty CleavedForGpiAnchorRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CleavedForGpiAnchorRegion instance) {
		log.debug("attaching clean CleavedForGpiAnchorRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CleavedForGpiAnchorRegion persistentInstance) {
		log.debug("deleting CleavedForGpiAnchorRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CleavedForGpiAnchorRegion merge(
			CleavedForGpiAnchorRegion detachedInstance) {
		log.debug("merging CleavedForGpiAnchorRegion instance");
		try {
			CleavedForGpiAnchorRegion result = (CleavedForGpiAnchorRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CleavedForGpiAnchorRegion findById(
			org.irri.iric.chado.so.CleavedForGpiAnchorRegionId id) {
		log.debug("getting CleavedForGpiAnchorRegion instance with id: " + id);
		try {
			CleavedForGpiAnchorRegion instance = (CleavedForGpiAnchorRegion) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.CleavedForGpiAnchorRegion",
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

	public List findByExample(CleavedForGpiAnchorRegion instance) {
		log.debug("finding CleavedForGpiAnchorRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.CleavedForGpiAnchorRegion")
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
