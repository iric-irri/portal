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
 * Home object for domain model class N62PrimeODimethyladenosine.
 * @see org.irri.iric.chado.so.N62PrimeODimethyladenosine
 * @author Hibernate Tools
 */
public class N62PrimeODimethyladenosineHome {

	private static final Log log = LogFactory
			.getLog(N62PrimeODimethyladenosineHome.class);

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

	public void persist(N62PrimeODimethyladenosine transientInstance) {
		log.debug("persisting N62PrimeODimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N62PrimeODimethyladenosine instance) {
		log.debug("attaching dirty N62PrimeODimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N62PrimeODimethyladenosine instance) {
		log.debug("attaching clean N62PrimeODimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N62PrimeODimethyladenosine persistentInstance) {
		log.debug("deleting N62PrimeODimethyladenosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N62PrimeODimethyladenosine merge(
			N62PrimeODimethyladenosine detachedInstance) {
		log.debug("merging N62PrimeODimethyladenosine instance");
		try {
			N62PrimeODimethyladenosine result = (N62PrimeODimethyladenosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N62PrimeODimethyladenosine findById(
			org.irri.iric.chado.so.N62PrimeODimethyladenosineId id) {
		log.debug("getting N62PrimeODimethyladenosine instance with id: " + id);
		try {
			N62PrimeODimethyladenosine instance = (N62PrimeODimethyladenosine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.N62PrimeODimethyladenosine",
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

	public List findByExample(N62PrimeODimethyladenosine instance) {
		log.debug("finding N62PrimeODimethyladenosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N62PrimeODimethyladenosine")
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
