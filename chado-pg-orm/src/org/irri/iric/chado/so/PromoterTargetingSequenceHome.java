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
 * Home object for domain model class PromoterTargetingSequence.
 * @see org.irri.iric.chado.so.PromoterTargetingSequence
 * @author Hibernate Tools
 */
public class PromoterTargetingSequenceHome {

	private static final Log log = LogFactory
			.getLog(PromoterTargetingSequenceHome.class);

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

	public void persist(PromoterTargetingSequence transientInstance) {
		log.debug("persisting PromoterTargetingSequence instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PromoterTargetingSequence instance) {
		log.debug("attaching dirty PromoterTargetingSequence instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PromoterTargetingSequence instance) {
		log.debug("attaching clean PromoterTargetingSequence instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PromoterTargetingSequence persistentInstance) {
		log.debug("deleting PromoterTargetingSequence instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PromoterTargetingSequence merge(
			PromoterTargetingSequence detachedInstance) {
		log.debug("merging PromoterTargetingSequence instance");
		try {
			PromoterTargetingSequence result = (PromoterTargetingSequence) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PromoterTargetingSequence findById(
			org.irri.iric.chado.so.PromoterTargetingSequenceId id) {
		log.debug("getting PromoterTargetingSequence instance with id: " + id);
		try {
			PromoterTargetingSequence instance = (PromoterTargetingSequence) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PromoterTargetingSequence",
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

	public List findByExample(PromoterTargetingSequence instance) {
		log.debug("finding PromoterTargetingSequence instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PromoterTargetingSequence")
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
