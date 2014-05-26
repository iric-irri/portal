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
 * Home object for domain model class RnapolIiCorePromoter.
 * @see org.irri.iric.chado.so.RnapolIiCorePromoter
 * @author Hibernate Tools
 */
public class RnapolIiCorePromoterHome {

	private static final Log log = LogFactory
			.getLog(RnapolIiCorePromoterHome.class);

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

	public void persist(RnapolIiCorePromoter transientInstance) {
		log.debug("persisting RnapolIiCorePromoter instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RnapolIiCorePromoter instance) {
		log.debug("attaching dirty RnapolIiCorePromoter instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RnapolIiCorePromoter instance) {
		log.debug("attaching clean RnapolIiCorePromoter instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RnapolIiCorePromoter persistentInstance) {
		log.debug("deleting RnapolIiCorePromoter instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RnapolIiCorePromoter merge(RnapolIiCorePromoter detachedInstance) {
		log.debug("merging RnapolIiCorePromoter instance");
		try {
			RnapolIiCorePromoter result = (RnapolIiCorePromoter) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RnapolIiCorePromoter findById(
			org.irri.iric.chado.so.RnapolIiCorePromoterId id) {
		log.debug("getting RnapolIiCorePromoter instance with id: " + id);
		try {
			RnapolIiCorePromoter instance = (RnapolIiCorePromoter) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.RnapolIiCorePromoter", id);
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

	public List findByExample(RnapolIiCorePromoter instance) {
		log.debug("finding RnapolIiCorePromoter instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.RnapolIiCorePromoter")
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
