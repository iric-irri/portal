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
 * Home object for domain model class ReplicationRegulatoryRegion.
 * @see org.irri.iric.chado.so.ReplicationRegulatoryRegion
 * @author Hibernate Tools
 */
public class ReplicationRegulatoryRegionHome {

	private static final Log log = LogFactory
			.getLog(ReplicationRegulatoryRegionHome.class);

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

	public void persist(ReplicationRegulatoryRegion transientInstance) {
		log.debug("persisting ReplicationRegulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ReplicationRegulatoryRegion instance) {
		log.debug("attaching dirty ReplicationRegulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReplicationRegulatoryRegion instance) {
		log.debug("attaching clean ReplicationRegulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ReplicationRegulatoryRegion persistentInstance) {
		log.debug("deleting ReplicationRegulatoryRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReplicationRegulatoryRegion merge(
			ReplicationRegulatoryRegion detachedInstance) {
		log.debug("merging ReplicationRegulatoryRegion instance");
		try {
			ReplicationRegulatoryRegion result = (ReplicationRegulatoryRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReplicationRegulatoryRegion findById(
			org.irri.iric.chado.so.ReplicationRegulatoryRegionId id) {
		log.debug("getting ReplicationRegulatoryRegion instance with id: " + id);
		try {
			ReplicationRegulatoryRegion instance = (ReplicationRegulatoryRegion) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.ReplicationRegulatoryRegion",
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

	public List findByExample(ReplicationRegulatoryRegion instance) {
		log.debug("finding ReplicationRegulatoryRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ReplicationRegulatoryRegion")
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
