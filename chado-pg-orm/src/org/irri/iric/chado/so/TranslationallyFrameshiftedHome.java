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
 * Home object for domain model class TranslationallyFrameshifted.
 * @see org.irri.iric.chado.so.TranslationallyFrameshifted
 * @author Hibernate Tools
 */
public class TranslationallyFrameshiftedHome {

	private static final Log log = LogFactory
			.getLog(TranslationallyFrameshiftedHome.class);

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

	public void persist(TranslationallyFrameshifted transientInstance) {
		log.debug("persisting TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TranslationallyFrameshifted instance) {
		log.debug("attaching dirty TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TranslationallyFrameshifted instance) {
		log.debug("attaching clean TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TranslationallyFrameshifted persistentInstance) {
		log.debug("deleting TranslationallyFrameshifted instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TranslationallyFrameshifted merge(
			TranslationallyFrameshifted detachedInstance) {
		log.debug("merging TranslationallyFrameshifted instance");
		try {
			TranslationallyFrameshifted result = (TranslationallyFrameshifted) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TranslationallyFrameshifted findById(
			org.irri.iric.chado.so.TranslationallyFrameshiftedId id) {
		log.debug("getting TranslationallyFrameshifted instance with id: " + id);
		try {
			TranslationallyFrameshifted instance = (TranslationallyFrameshifted) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.TranslationallyFrameshifted",
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

	public List findByExample(TranslationallyFrameshifted instance) {
		log.debug("finding TranslationallyFrameshifted instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.TranslationallyFrameshifted")
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
