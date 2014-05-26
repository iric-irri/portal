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
 * Home object for domain model class T3RnaPolymerasePromoter.
 * @see org.irri.iric.chado.so.T3RnaPolymerasePromoter
 * @author Hibernate Tools
 */
public class T3RnaPolymerasePromoterHome {

	private static final Log log = LogFactory
			.getLog(T3RnaPolymerasePromoterHome.class);

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

	public void persist(T3RnaPolymerasePromoter transientInstance) {
		log.debug("persisting T3RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(T3RnaPolymerasePromoter instance) {
		log.debug("attaching dirty T3RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(T3RnaPolymerasePromoter instance) {
		log.debug("attaching clean T3RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(T3RnaPolymerasePromoter persistentInstance) {
		log.debug("deleting T3RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public T3RnaPolymerasePromoter merge(
			T3RnaPolymerasePromoter detachedInstance) {
		log.debug("merging T3RnaPolymerasePromoter instance");
		try {
			T3RnaPolymerasePromoter result = (T3RnaPolymerasePromoter) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public T3RnaPolymerasePromoter findById(
			org.irri.iric.chado.so.T3RnaPolymerasePromoterId id) {
		log.debug("getting T3RnaPolymerasePromoter instance with id: " + id);
		try {
			T3RnaPolymerasePromoter instance = (T3RnaPolymerasePromoter) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.T3RnaPolymerasePromoter",
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

	public List findByExample(T3RnaPolymerasePromoter instance) {
		log.debug("finding T3RnaPolymerasePromoter instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.T3RnaPolymerasePromoter")
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
