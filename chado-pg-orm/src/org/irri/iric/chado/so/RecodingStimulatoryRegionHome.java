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
 * Home object for domain model class RecodingStimulatoryRegion.
 * @see org.irri.iric.chado.so.RecodingStimulatoryRegion
 * @author Hibernate Tools
 */
public class RecodingStimulatoryRegionHome {

	private static final Log log = LogFactory
			.getLog(RecodingStimulatoryRegionHome.class);

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

	public void persist(RecodingStimulatoryRegion transientInstance) {
		log.debug("persisting RecodingStimulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RecodingStimulatoryRegion instance) {
		log.debug("attaching dirty RecodingStimulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RecodingStimulatoryRegion instance) {
		log.debug("attaching clean RecodingStimulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RecodingStimulatoryRegion persistentInstance) {
		log.debug("deleting RecodingStimulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RecodingStimulatoryRegion merge(
			RecodingStimulatoryRegion detachedInstance) {
		log.debug("merging RecodingStimulatoryRegion instance");
		try {
			RecodingStimulatoryRegion result = (RecodingStimulatoryRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RecodingStimulatoryRegion findById(
			org.irri.iric.chado.so.RecodingStimulatoryRegionId id) {
		log.debug("getting RecodingStimulatoryRegion instance with id: " + id);
		try {
			RecodingStimulatoryRegion instance = (RecodingStimulatoryRegion) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.RecodingStimulatoryRegion",
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

	public List findByExample(RecodingStimulatoryRegion instance) {
		log.debug("finding RecodingStimulatoryRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.RecodingStimulatoryRegion")
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
