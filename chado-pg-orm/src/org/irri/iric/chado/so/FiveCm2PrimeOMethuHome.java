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
 * Home object for domain model class FiveCm2PrimeOMethu.
 * @see org.irri.iric.chado.so.FiveCm2PrimeOMethu
 * @author Hibernate Tools
 */
public class FiveCm2PrimeOMethuHome {

	private static final Log log = LogFactory
			.getLog(FiveCm2PrimeOMethuHome.class);

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

	public void persist(FiveCm2PrimeOMethu transientInstance) {
		log.debug("persisting FiveCm2PrimeOMethu instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(FiveCm2PrimeOMethu instance) {
		log.debug("attaching dirty FiveCm2PrimeOMethu instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FiveCm2PrimeOMethu instance) {
		log.debug("attaching clean FiveCm2PrimeOMethu instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(FiveCm2PrimeOMethu persistentInstance) {
		log.debug("deleting FiveCm2PrimeOMethu instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FiveCm2PrimeOMethu merge(FiveCm2PrimeOMethu detachedInstance) {
		log.debug("merging FiveCm2PrimeOMethu instance");
		try {
			FiveCm2PrimeOMethu result = (FiveCm2PrimeOMethu) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FiveCm2PrimeOMethu findById(
			org.irri.iric.chado.so.FiveCm2PrimeOMethuId id) {
		log.debug("getting FiveCm2PrimeOMethu instance with id: " + id);
		try {
			FiveCm2PrimeOMethu instance = (FiveCm2PrimeOMethu) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.FiveCm2PrimeOMethu", id);
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

	public List findByExample(FiveCm2PrimeOMethu instance) {
		log.debug("finding FiveCm2PrimeOMethu instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.FiveCm2PrimeOMethu")
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
