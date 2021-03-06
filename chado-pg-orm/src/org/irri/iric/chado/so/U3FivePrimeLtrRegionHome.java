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
 * Home object for domain model class U3FivePrimeLtrRegion.
 * @see org.irri.iric.chado.so.U3FivePrimeLtrRegion
 * @author Hibernate Tools
 */
public class U3FivePrimeLtrRegionHome {

	private static final Log log = LogFactory
			.getLog(U3FivePrimeLtrRegionHome.class);

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

	public void persist(U3FivePrimeLtrRegion transientInstance) {
		log.debug("persisting U3FivePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(U3FivePrimeLtrRegion instance) {
		log.debug("attaching dirty U3FivePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(U3FivePrimeLtrRegion instance) {
		log.debug("attaching clean U3FivePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(U3FivePrimeLtrRegion persistentInstance) {
		log.debug("deleting U3FivePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public U3FivePrimeLtrRegion merge(U3FivePrimeLtrRegion detachedInstance) {
		log.debug("merging U3FivePrimeLtrRegion instance");
		try {
			U3FivePrimeLtrRegion result = (U3FivePrimeLtrRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public U3FivePrimeLtrRegion findById(
			org.irri.iric.chado.so.U3FivePrimeLtrRegionId id) {
		log.debug("getting U3FivePrimeLtrRegion instance with id: " + id);
		try {
			U3FivePrimeLtrRegion instance = (U3FivePrimeLtrRegion) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.U3FivePrimeLtrRegion", id);
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

	public List findByExample(U3FivePrimeLtrRegion instance) {
		log.debug("finding U3FivePrimeLtrRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.U3FivePrimeLtrRegion")
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
