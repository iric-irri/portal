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
 * Home object for domain model class N4Acetyl2PrimeOMethylcytidine.
 * @see org.irri.iric.chado.so.N4Acetyl2PrimeOMethylcytidine
 * @author Hibernate Tools
 */
public class N4Acetyl2PrimeOMethylcytidineHome {

	private static final Log log = LogFactory
			.getLog(N4Acetyl2PrimeOMethylcytidineHome.class);

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

	public void persist(N4Acetyl2PrimeOMethylcytidine transientInstance) {
		log.debug("persisting N4Acetyl2PrimeOMethylcytidine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N4Acetyl2PrimeOMethylcytidine instance) {
		log.debug("attaching dirty N4Acetyl2PrimeOMethylcytidine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N4Acetyl2PrimeOMethylcytidine instance) {
		log.debug("attaching clean N4Acetyl2PrimeOMethylcytidine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N4Acetyl2PrimeOMethylcytidine persistentInstance) {
		log.debug("deleting N4Acetyl2PrimeOMethylcytidine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N4Acetyl2PrimeOMethylcytidine merge(
			N4Acetyl2PrimeOMethylcytidine detachedInstance) {
		log.debug("merging N4Acetyl2PrimeOMethylcytidine instance");
		try {
			N4Acetyl2PrimeOMethylcytidine result = (N4Acetyl2PrimeOMethylcytidine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N4Acetyl2PrimeOMethylcytidine findById(
			org.irri.iric.chado.so.N4Acetyl2PrimeOMethylcytidineId id) {
		log.debug("getting N4Acetyl2PrimeOMethylcytidine instance with id: "
				+ id);
		try {
			N4Acetyl2PrimeOMethylcytidine instance = (N4Acetyl2PrimeOMethylcytidine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.N4Acetyl2PrimeOMethylcytidine",
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

	public List findByExample(N4Acetyl2PrimeOMethylcytidine instance) {
		log.debug("finding N4Acetyl2PrimeOMethylcytidine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N4Acetyl2PrimeOMethylcytidine")
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
