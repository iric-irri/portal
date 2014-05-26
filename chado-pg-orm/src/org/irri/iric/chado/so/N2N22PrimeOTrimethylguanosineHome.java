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
 * Home object for domain model class N2N22PrimeOTrimethylguanosine.
 * @see org.irri.iric.chado.so.N2N22PrimeOTrimethylguanosine
 * @author Hibernate Tools
 */
public class N2N22PrimeOTrimethylguanosineHome {

	private static final Log log = LogFactory
			.getLog(N2N22PrimeOTrimethylguanosineHome.class);

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

	public void persist(N2N22PrimeOTrimethylguanosine transientInstance) {
		log.debug("persisting N2N22PrimeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N2N22PrimeOTrimethylguanosine instance) {
		log.debug("attaching dirty N2N22PrimeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N2N22PrimeOTrimethylguanosine instance) {
		log.debug("attaching clean N2N22PrimeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N2N22PrimeOTrimethylguanosine persistentInstance) {
		log.debug("deleting N2N22PrimeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N2N22PrimeOTrimethylguanosine merge(
			N2N22PrimeOTrimethylguanosine detachedInstance) {
		log.debug("merging N2N22PrimeOTrimethylguanosine instance");
		try {
			N2N22PrimeOTrimethylguanosine result = (N2N22PrimeOTrimethylguanosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N2N22PrimeOTrimethylguanosine findById(
			org.irri.iric.chado.so.N2N22PrimeOTrimethylguanosineId id) {
		log.debug("getting N2N22PrimeOTrimethylguanosine instance with id: "
				+ id);
		try {
			N2N22PrimeOTrimethylguanosine instance = (N2N22PrimeOTrimethylguanosine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.N2N22PrimeOTrimethylguanosine",
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

	public List findByExample(N2N22PrimeOTrimethylguanosine instance) {
		log.debug("finding N2N22PrimeOTrimethylguanosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N2N22PrimeOTrimethylguanosine")
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
