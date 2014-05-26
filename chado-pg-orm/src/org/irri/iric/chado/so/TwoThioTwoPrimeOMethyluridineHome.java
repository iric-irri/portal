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
 * Home object for domain model class TwoThioTwoPrimeOMethyluridine.
 * @see org.irri.iric.chado.so.TwoThioTwoPrimeOMethyluridine
 * @author Hibernate Tools
 */
public class TwoThioTwoPrimeOMethyluridineHome {

	private static final Log log = LogFactory
			.getLog(TwoThioTwoPrimeOMethyluridineHome.class);

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

	public void persist(TwoThioTwoPrimeOMethyluridine transientInstance) {
		log.debug("persisting TwoThioTwoPrimeOMethyluridine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TwoThioTwoPrimeOMethyluridine instance) {
		log.debug("attaching dirty TwoThioTwoPrimeOMethyluridine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TwoThioTwoPrimeOMethyluridine instance) {
		log.debug("attaching clean TwoThioTwoPrimeOMethyluridine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TwoThioTwoPrimeOMethyluridine persistentInstance) {
		log.debug("deleting TwoThioTwoPrimeOMethyluridine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TwoThioTwoPrimeOMethyluridine merge(
			TwoThioTwoPrimeOMethyluridine detachedInstance) {
		log.debug("merging TwoThioTwoPrimeOMethyluridine instance");
		try {
			TwoThioTwoPrimeOMethyluridine result = (TwoThioTwoPrimeOMethyluridine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TwoThioTwoPrimeOMethyluridine findById(
			org.irri.iric.chado.so.TwoThioTwoPrimeOMethyluridineId id) {
		log.debug("getting TwoThioTwoPrimeOMethyluridine instance with id: "
				+ id);
		try {
			TwoThioTwoPrimeOMethyluridine instance = (TwoThioTwoPrimeOMethyluridine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.TwoThioTwoPrimeOMethyluridine",
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

	public List findByExample(TwoThioTwoPrimeOMethyluridine instance) {
		log.debug("finding TwoThioTwoPrimeOMethyluridine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.TwoThioTwoPrimeOMethyluridine")
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
