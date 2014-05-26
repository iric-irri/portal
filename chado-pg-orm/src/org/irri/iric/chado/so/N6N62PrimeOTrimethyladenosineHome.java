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
 * Home object for domain model class N6N62PrimeOTrimethyladenosine.
 * @see org.irri.iric.chado.so.N6N62PrimeOTrimethyladenosine
 * @author Hibernate Tools
 */
public class N6N62PrimeOTrimethyladenosineHome {

	private static final Log log = LogFactory
			.getLog(N6N62PrimeOTrimethyladenosineHome.class);

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

	public void persist(N6N62PrimeOTrimethyladenosine transientInstance) {
		log.debug("persisting N6N62PrimeOTrimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N6N62PrimeOTrimethyladenosine instance) {
		log.debug("attaching dirty N6N62PrimeOTrimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N6N62PrimeOTrimethyladenosine instance) {
		log.debug("attaching clean N6N62PrimeOTrimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N6N62PrimeOTrimethyladenosine persistentInstance) {
		log.debug("deleting N6N62PrimeOTrimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N6N62PrimeOTrimethyladenosine merge(
			N6N62PrimeOTrimethyladenosine detachedInstance) {
		log.debug("merging N6N62PrimeOTrimethyladenosine instance");
		try {
			N6N62PrimeOTrimethyladenosine result = (N6N62PrimeOTrimethyladenosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N6N62PrimeOTrimethyladenosine findById(
			org.irri.iric.chado.so.N6N62PrimeOTrimethyladenosineId id) {
		log.debug("getting N6N62PrimeOTrimethyladenosine instance with id: "
				+ id);
		try {
			N6N62PrimeOTrimethyladenosine instance = (N6N62PrimeOTrimethyladenosine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.N6N62PrimeOTrimethyladenosine",
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

	public List findByExample(N6N62PrimeOTrimethyladenosine instance) {
		log.debug("finding N6N62PrimeOTrimethyladenosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N6N62PrimeOTrimethyladenosine")
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
