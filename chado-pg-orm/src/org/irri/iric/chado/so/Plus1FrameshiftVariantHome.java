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
 * Home object for domain model class Plus1FrameshiftVariant.
 * @see org.irri.iric.chado.so.Plus1FrameshiftVariant
 * @author Hibernate Tools
 */
public class Plus1FrameshiftVariantHome {

	private static final Log log = LogFactory
			.getLog(Plus1FrameshiftVariantHome.class);

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

	public void persist(Plus1FrameshiftVariant transientInstance) {
		log.debug("persisting Plus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Plus1FrameshiftVariant instance) {
		log.debug("attaching dirty Plus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Plus1FrameshiftVariant instance) {
		log.debug("attaching clean Plus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Plus1FrameshiftVariant persistentInstance) {
		log.debug("deleting Plus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Plus1FrameshiftVariant merge(Plus1FrameshiftVariant detachedInstance) {
		log.debug("merging Plus1FrameshiftVariant instance");
		try {
			Plus1FrameshiftVariant result = (Plus1FrameshiftVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Plus1FrameshiftVariant findById(
			org.irri.iric.chado.so.Plus1FrameshiftVariantId id) {
		log.debug("getting Plus1FrameshiftVariant instance with id: " + id);
		try {
			Plus1FrameshiftVariant instance = (Plus1FrameshiftVariant) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.Plus1FrameshiftVariant", id);
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

	public List findByExample(Plus1FrameshiftVariant instance) {
		log.debug("finding Plus1FrameshiftVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Plus1FrameshiftVariant")
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
