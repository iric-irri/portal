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
 * Home object for domain model class N22PrimeODimethylguanosine.
 * @see org.irri.iric.chado.so.N22PrimeODimethylguanosine
 * @author Hibernate Tools
 */
public class N22PrimeODimethylguanosineHome {

	private static final Log log = LogFactory
			.getLog(N22PrimeODimethylguanosineHome.class);

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

	public void persist(N22PrimeODimethylguanosine transientInstance) {
		log.debug("persisting N22PrimeODimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N22PrimeODimethylguanosine instance) {
		log.debug("attaching dirty N22PrimeODimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N22PrimeODimethylguanosine instance) {
		log.debug("attaching clean N22PrimeODimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N22PrimeODimethylguanosine persistentInstance) {
		log.debug("deleting N22PrimeODimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N22PrimeODimethylguanosine merge(
			N22PrimeODimethylguanosine detachedInstance) {
		log.debug("merging N22PrimeODimethylguanosine instance");
		try {
			N22PrimeODimethylguanosine result = (N22PrimeODimethylguanosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N22PrimeODimethylguanosine findById(
			org.irri.iric.chado.so.N22PrimeODimethylguanosineId id) {
		log.debug("getting N22PrimeODimethylguanosine instance with id: " + id);
		try {
			N22PrimeODimethylguanosine instance = (N22PrimeODimethylguanosine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.N22PrimeODimethylguanosine",
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

	public List findByExample(N22PrimeODimethylguanosine instance) {
		log.debug("finding N22PrimeODimethylguanosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N22PrimeODimethylguanosine")
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
