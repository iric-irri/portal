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
 * Home object for domain model class FiveIsopentenylaminomethylTwoThiouridine.
 * @see org.irri.iric.chado.so.FiveIsopentenylaminomethylTwoThiouridine
 * @author Hibernate Tools
 */
public class FiveIsopentenylaminomethylTwoThiouridineHome {

	private static final Log log = LogFactory
			.getLog(FiveIsopentenylaminomethylTwoThiouridineHome.class);

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

	public void persist(
			FiveIsopentenylaminomethylTwoThiouridine transientInstance) {
		log.debug("persisting FiveIsopentenylaminomethylTwoThiouridine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(FiveIsopentenylaminomethylTwoThiouridine instance) {
		log.debug("attaching dirty FiveIsopentenylaminomethylTwoThiouridine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FiveIsopentenylaminomethylTwoThiouridine instance) {
		log.debug("attaching clean FiveIsopentenylaminomethylTwoThiouridine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			FiveIsopentenylaminomethylTwoThiouridine persistentInstance) {
		log.debug("deleting FiveIsopentenylaminomethylTwoThiouridine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FiveIsopentenylaminomethylTwoThiouridine merge(
			FiveIsopentenylaminomethylTwoThiouridine detachedInstance) {
		log.debug("merging FiveIsopentenylaminomethylTwoThiouridine instance");
		try {
			FiveIsopentenylaminomethylTwoThiouridine result = (FiveIsopentenylaminomethylTwoThiouridine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FiveIsopentenylaminomethylTwoThiouridine findById(
			org.irri.iric.chado.so.FiveIsopentenylaminomethylTwoThiouridineId id) {
		log.debug("getting FiveIsopentenylaminomethylTwoThiouridine instance with id: "
				+ id);
		try {
			FiveIsopentenylaminomethylTwoThiouridine instance = (FiveIsopentenylaminomethylTwoThiouridine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.FiveIsopentenylaminomethylTwoThiouridine",
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

	public List findByExample(FiveIsopentenylaminomethylTwoThiouridine instance) {
		log.debug("finding FiveIsopentenylaminomethylTwoThiouridine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.FiveIsopentenylaminomethylTwoThiouridine")
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
