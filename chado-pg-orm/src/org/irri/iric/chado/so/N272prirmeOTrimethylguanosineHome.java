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
 * Home object for domain model class N272prirmeOTrimethylguanosine.
 * @see org.irri.iric.chado.so.N272prirmeOTrimethylguanosine
 * @author Hibernate Tools
 */
public class N272prirmeOTrimethylguanosineHome {

	private static final Log log = LogFactory
			.getLog(N272prirmeOTrimethylguanosineHome.class);

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

	public void persist(N272prirmeOTrimethylguanosine transientInstance) {
		log.debug("persisting N272prirmeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N272prirmeOTrimethylguanosine instance) {
		log.debug("attaching dirty N272prirmeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N272prirmeOTrimethylguanosine instance) {
		log.debug("attaching clean N272prirmeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N272prirmeOTrimethylguanosine persistentInstance) {
		log.debug("deleting N272prirmeOTrimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N272prirmeOTrimethylguanosine merge(
			N272prirmeOTrimethylguanosine detachedInstance) {
		log.debug("merging N272prirmeOTrimethylguanosine instance");
		try {
			N272prirmeOTrimethylguanosine result = (N272prirmeOTrimethylguanosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N272prirmeOTrimethylguanosine findById(
			org.irri.iric.chado.so.N272prirmeOTrimethylguanosineId id) {
		log.debug("getting N272prirmeOTrimethylguanosine instance with id: "
				+ id);
		try {
			N272prirmeOTrimethylguanosine instance = (N272prirmeOTrimethylguanosine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.N272prirmeOTrimethylguanosine",
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

	public List findByExample(N272prirmeOTrimethylguanosine instance) {
		log.debug("finding N272prirmeOTrimethylguanosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N272prirmeOTrimethylguanosine")
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
