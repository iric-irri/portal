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
 * Home object for domain model class RnapolIiiPromoterType3.
 * @see org.irri.iric.chado.so.RnapolIiiPromoterType3
 * @author Hibernate Tools
 */
public class RnapolIiiPromoterType3Home {

	private static final Log log = LogFactory
			.getLog(RnapolIiiPromoterType3Home.class);

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

	public void persist(RnapolIiiPromoterType3 transientInstance) {
		log.debug("persisting RnapolIiiPromoterType3 instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RnapolIiiPromoterType3 instance) {
		log.debug("attaching dirty RnapolIiiPromoterType3 instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RnapolIiiPromoterType3 instance) {
		log.debug("attaching clean RnapolIiiPromoterType3 instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RnapolIiiPromoterType3 persistentInstance) {
		log.debug("deleting RnapolIiiPromoterType3 instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RnapolIiiPromoterType3 merge(RnapolIiiPromoterType3 detachedInstance) {
		log.debug("merging RnapolIiiPromoterType3 instance");
		try {
			RnapolIiiPromoterType3 result = (RnapolIiiPromoterType3) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RnapolIiiPromoterType3 findById(
			org.irri.iric.chado.so.RnapolIiiPromoterType3Id id) {
		log.debug("getting RnapolIiiPromoterType3 instance with id: " + id);
		try {
			RnapolIiiPromoterType3 instance = (RnapolIiiPromoterType3) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.RnapolIiiPromoterType3", id);
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

	public List findByExample(RnapolIiiPromoterType3 instance) {
		log.debug("finding RnapolIiiPromoterType3 instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.RnapolIiiPromoterType3")
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
