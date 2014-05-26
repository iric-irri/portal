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
 * Home object for domain model class Plus1TranslationalFrameshift.
 * @see org.irri.iric.chado.so.Plus1TranslationalFrameshift
 * @author Hibernate Tools
 */
public class Plus1TranslationalFrameshiftHome {

	private static final Log log = LogFactory
			.getLog(Plus1TranslationalFrameshiftHome.class);

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

	public void persist(Plus1TranslationalFrameshift transientInstance) {
		log.debug("persisting Plus1TranslationalFrameshift instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Plus1TranslationalFrameshift instance) {
		log.debug("attaching dirty Plus1TranslationalFrameshift instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Plus1TranslationalFrameshift instance) {
		log.debug("attaching clean Plus1TranslationalFrameshift instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Plus1TranslationalFrameshift persistentInstance) {
		log.debug("deleting Plus1TranslationalFrameshift instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Plus1TranslationalFrameshift merge(
			Plus1TranslationalFrameshift detachedInstance) {
		log.debug("merging Plus1TranslationalFrameshift instance");
		try {
			Plus1TranslationalFrameshift result = (Plus1TranslationalFrameshift) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Plus1TranslationalFrameshift findById(
			org.irri.iric.chado.so.Plus1TranslationalFrameshiftId id) {
		log.debug("getting Plus1TranslationalFrameshift instance with id: "
				+ id);
		try {
			Plus1TranslationalFrameshift instance = (Plus1TranslationalFrameshift) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.Plus1TranslationalFrameshift",
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

	public List findByExample(Plus1TranslationalFrameshift instance) {
		log.debug("finding Plus1TranslationalFrameshift instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Plus1TranslationalFrameshift")
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
