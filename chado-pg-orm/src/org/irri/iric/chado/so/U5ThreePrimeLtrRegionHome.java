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
 * Home object for domain model class U5ThreePrimeLtrRegion.
 * @see org.irri.iric.chado.so.U5ThreePrimeLtrRegion
 * @author Hibernate Tools
 */
public class U5ThreePrimeLtrRegionHome {

	private static final Log log = LogFactory
			.getLog(U5ThreePrimeLtrRegionHome.class);

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

	public void persist(U5ThreePrimeLtrRegion transientInstance) {
		log.debug("persisting U5ThreePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(U5ThreePrimeLtrRegion instance) {
		log.debug("attaching dirty U5ThreePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(U5ThreePrimeLtrRegion instance) {
		log.debug("attaching clean U5ThreePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(U5ThreePrimeLtrRegion persistentInstance) {
		log.debug("deleting U5ThreePrimeLtrRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public U5ThreePrimeLtrRegion merge(U5ThreePrimeLtrRegion detachedInstance) {
		log.debug("merging U5ThreePrimeLtrRegion instance");
		try {
			U5ThreePrimeLtrRegion result = (U5ThreePrimeLtrRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public U5ThreePrimeLtrRegion findById(
			org.irri.iric.chado.so.U5ThreePrimeLtrRegionId id) {
		log.debug("getting U5ThreePrimeLtrRegion instance with id: " + id);
		try {
			U5ThreePrimeLtrRegion instance = (U5ThreePrimeLtrRegion) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.U5ThreePrimeLtrRegion", id);
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

	public List findByExample(U5ThreePrimeLtrRegion instance) {
		log.debug("finding U5ThreePrimeLtrRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.U5ThreePrimeLtrRegion")
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
