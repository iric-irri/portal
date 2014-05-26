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
 * Home object for domain model class T7RnaPolymerasePromoter.
 * @see org.irri.iric.chado.so.T7RnaPolymerasePromoter
 * @author Hibernate Tools
 */
public class T7RnaPolymerasePromoterHome {

	private static final Log log = LogFactory
			.getLog(T7RnaPolymerasePromoterHome.class);

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

	public void persist(T7RnaPolymerasePromoter transientInstance) {
		log.debug("persisting T7RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(T7RnaPolymerasePromoter instance) {
		log.debug("attaching dirty T7RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(T7RnaPolymerasePromoter instance) {
		log.debug("attaching clean T7RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(T7RnaPolymerasePromoter persistentInstance) {
		log.debug("deleting T7RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public T7RnaPolymerasePromoter merge(
			T7RnaPolymerasePromoter detachedInstance) {
		log.debug("merging T7RnaPolymerasePromoter instance");
		try {
			T7RnaPolymerasePromoter result = (T7RnaPolymerasePromoter) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public T7RnaPolymerasePromoter findById(
			org.irri.iric.chado.so.T7RnaPolymerasePromoterId id) {
		log.debug("getting T7RnaPolymerasePromoter instance with id: " + id);
		try {
			T7RnaPolymerasePromoter instance = (T7RnaPolymerasePromoter) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.T7RnaPolymerasePromoter",
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

	public List findByExample(T7RnaPolymerasePromoter instance) {
		log.debug("finding T7RnaPolymerasePromoter instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.T7RnaPolymerasePromoter")
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
