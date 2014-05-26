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
 * Home object for domain model class Minus2FrameshiftVariant.
 * @see org.irri.iric.chado.so.Minus2FrameshiftVariant
 * @author Hibernate Tools
 */
public class Minus2FrameshiftVariantHome {

	private static final Log log = LogFactory
			.getLog(Minus2FrameshiftVariantHome.class);

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

	public void persist(Minus2FrameshiftVariant transientInstance) {
		log.debug("persisting Minus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Minus2FrameshiftVariant instance) {
		log.debug("attaching dirty Minus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Minus2FrameshiftVariant instance) {
		log.debug("attaching clean Minus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Minus2FrameshiftVariant persistentInstance) {
		log.debug("deleting Minus2FrameshiftVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Minus2FrameshiftVariant merge(
			Minus2FrameshiftVariant detachedInstance) {
		log.debug("merging Minus2FrameshiftVariant instance");
		try {
			Minus2FrameshiftVariant result = (Minus2FrameshiftVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Minus2FrameshiftVariant findById(
			org.irri.iric.chado.so.Minus2FrameshiftVariantId id) {
		log.debug("getting Minus2FrameshiftVariant instance with id: " + id);
		try {
			Minus2FrameshiftVariant instance = (Minus2FrameshiftVariant) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Minus2FrameshiftVariant",
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

	public List findByExample(Minus2FrameshiftVariant instance) {
		log.debug("finding Minus2FrameshiftVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Minus2FrameshiftVariant")
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
