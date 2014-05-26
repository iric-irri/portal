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
 * Home object for domain model class RnapolIiiPromoterType1.
 * @see org.irri.iric.chado.so.RnapolIiiPromoterType1
 * @author Hibernate Tools
 */
public class RnapolIiiPromoterType1Home {

	private static final Log log = LogFactory
			.getLog(RnapolIiiPromoterType1Home.class);

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

	public void persist(RnapolIiiPromoterType1 transientInstance) {
		log.debug("persisting RnapolIiiPromoterType1 instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RnapolIiiPromoterType1 instance) {
		log.debug("attaching dirty RnapolIiiPromoterType1 instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RnapolIiiPromoterType1 instance) {
		log.debug("attaching clean RnapolIiiPromoterType1 instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RnapolIiiPromoterType1 persistentInstance) {
		log.debug("deleting RnapolIiiPromoterType1 instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RnapolIiiPromoterType1 merge(RnapolIiiPromoterType1 detachedInstance) {
		log.debug("merging RnapolIiiPromoterType1 instance");
		try {
			RnapolIiiPromoterType1 result = (RnapolIiiPromoterType1) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RnapolIiiPromoterType1 findById(
			org.irri.iric.chado.so.RnapolIiiPromoterType1Id id) {
		log.debug("getting RnapolIiiPromoterType1 instance with id: " + id);
		try {
			RnapolIiiPromoterType1 instance = (RnapolIiiPromoterType1) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.RnapolIiiPromoterType1", id);
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

	public List findByExample(RnapolIiiPromoterType1 instance) {
		log.debug("finding RnapolIiiPromoterType1 instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.RnapolIiiPromoterType1")
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
