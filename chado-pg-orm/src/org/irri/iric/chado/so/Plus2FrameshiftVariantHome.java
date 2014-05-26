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
 * Home object for domain model class Plus2FrameshiftVariant.
 * @see org.irri.iric.chado.so.Plus2FrameshiftVariant
 * @author Hibernate Tools
 */
public class Plus2FrameshiftVariantHome {

	private static final Log log = LogFactory
			.getLog(Plus2FrameshiftVariantHome.class);

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

	public void persist(Plus2FrameshiftVariant transientInstance) {
		log.debug("persisting Plus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Plus2FrameshiftVariant instance) {
		log.debug("attaching dirty Plus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Plus2FrameshiftVariant instance) {
		log.debug("attaching clean Plus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Plus2FrameshiftVariant persistentInstance) {
		log.debug("deleting Plus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Plus2FrameshiftVariant merge(Plus2FrameshiftVariant detachedInstance) {
		log.debug("merging Plus2FrameshiftVariant instance");
		try {
			Plus2FrameshiftVariant result = (Plus2FrameshiftVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Plus2FrameshiftVariant findById(
			org.irri.iric.chado.so.Plus2FrameshiftVariantId id) {
		log.debug("getting Plus2FrameshiftVariant instance with id: " + id);
		try {
			Plus2FrameshiftVariant instance = (Plus2FrameshiftVariant) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.Plus2FrameshiftVariant", id);
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

	public List findByExample(Plus2FrameshiftVariant instance) {
		log.debug("finding Plus2FrameshiftVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Plus2FrameshiftVariant")
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
