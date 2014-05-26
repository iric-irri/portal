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
 * Home object for domain model class Minus1FrameshiftVariant.
 * @see org.irri.iric.chado.so.Minus1FrameshiftVariant
 * @author Hibernate Tools
 */
public class Minus1FrameshiftVariantHome {

	private static final Log log = LogFactory
			.getLog(Minus1FrameshiftVariantHome.class);

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

	public void persist(Minus1FrameshiftVariant transientInstance) {
		log.debug("persisting Minus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Minus1FrameshiftVariant instance) {
		log.debug("attaching dirty Minus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Minus1FrameshiftVariant instance) {
		log.debug("attaching clean Minus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Minus1FrameshiftVariant persistentInstance) {
		log.debug("deleting Minus1FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Minus1FrameshiftVariant merge(
			Minus1FrameshiftVariant detachedInstance) {
		log.debug("merging Minus1FrameshiftVariant instance");
		try {
			Minus1FrameshiftVariant result = (Minus1FrameshiftVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Minus1FrameshiftVariant findById(
			org.irri.iric.chado.so.Minus1FrameshiftVariantId id) {
		log.debug("getting Minus1FrameshiftVariant instance with id: " + id);
		try {
			Minus1FrameshiftVariant instance = (Minus1FrameshiftVariant) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Minus1FrameshiftVariant",
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

	public List findByExample(Minus1FrameshiftVariant instance) {
		log.debug("finding Minus1FrameshiftVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Minus1FrameshiftVariant")
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
