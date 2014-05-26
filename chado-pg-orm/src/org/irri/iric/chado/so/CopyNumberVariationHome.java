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
 * Home object for domain model class CopyNumberVariation.
 * @see org.irri.iric.chado.so.CopyNumberVariation
 * @author Hibernate Tools
 */
public class CopyNumberVariationHome {

	private static final Log log = LogFactory
			.getLog(CopyNumberVariationHome.class);

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

	public void persist(CopyNumberVariation transientInstance) {
		log.debug("persisting CopyNumberVariation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CopyNumberVariation instance) {
		log.debug("attaching dirty CopyNumberVariation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CopyNumberVariation instance) {
		log.debug("attaching clean CopyNumberVariation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CopyNumberVariation persistentInstance) {
		log.debug("deleting CopyNumberVariation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CopyNumberVariation merge(CopyNumberVariation detachedInstance) {
		log.debug("merging CopyNumberVariation instance");
		try {
			CopyNumberVariation result = (CopyNumberVariation) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CopyNumberVariation findById(
			org.irri.iric.chado.so.CopyNumberVariationId id) {
		log.debug("getting CopyNumberVariation instance with id: " + id);
		try {
			CopyNumberVariation instance = (CopyNumberVariation) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.CopyNumberVariation", id);
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

	public List findByExample(CopyNumberVariation instance) {
		log.debug("finding CopyNumberVariation instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.CopyNumberVariation")
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
