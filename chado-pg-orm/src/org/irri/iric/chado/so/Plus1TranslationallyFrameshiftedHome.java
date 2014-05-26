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
 * Home object for domain model class Plus1TranslationallyFrameshifted.
 * @see org.irri.iric.chado.so.Plus1TranslationallyFrameshifted
 * @author Hibernate Tools
 */
public class Plus1TranslationallyFrameshiftedHome {

	private static final Log log = LogFactory
			.getLog(Plus1TranslationallyFrameshiftedHome.class);

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

	public void persist(Plus1TranslationallyFrameshifted transientInstance) {
		log.debug("persisting Plus1TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Plus1TranslationallyFrameshifted instance) {
		log.debug("attaching dirty Plus1TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Plus1TranslationallyFrameshifted instance) {
		log.debug("attaching clean Plus1TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Plus1TranslationallyFrameshifted persistentInstance) {
		log.debug("deleting Plus1TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Plus1TranslationallyFrameshifted merge(
			Plus1TranslationallyFrameshifted detachedInstance) {
		log.debug("merging Plus1TranslationallyFrameshifted instance");
		try {
			Plus1TranslationallyFrameshifted result = (Plus1TranslationallyFrameshifted) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Plus1TranslationallyFrameshifted findById(
			org.irri.iric.chado.so.Plus1TranslationallyFrameshiftedId id) {
		log.debug("getting Plus1TranslationallyFrameshifted instance with id: "
				+ id);
		try {
			Plus1TranslationallyFrameshifted instance = (Plus1TranslationallyFrameshifted) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.Plus1TranslationallyFrameshifted",
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

	public List findByExample(Plus1TranslationallyFrameshifted instance) {
		log.debug("finding Plus1TranslationallyFrameshifted instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Plus1TranslationallyFrameshifted")
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
