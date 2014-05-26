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
 * Home object for domain model class SequenceLengthVariation.
 * @see org.irri.iric.chado.so.SequenceLengthVariation
 * @author Hibernate Tools
 */
public class SequenceLengthVariationHome {

	private static final Log log = LogFactory
			.getLog(SequenceLengthVariationHome.class);

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

	public void persist(SequenceLengthVariation transientInstance) {
		log.debug("persisting SequenceLengthVariation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SequenceLengthVariation instance) {
		log.debug("attaching dirty SequenceLengthVariation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SequenceLengthVariation instance) {
		log.debug("attaching clean SequenceLengthVariation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SequenceLengthVariation persistentInstance) {
		log.debug("deleting SequenceLengthVariation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SequenceLengthVariation merge(
			SequenceLengthVariation detachedInstance) {
		log.debug("merging SequenceLengthVariation instance");
		try {
			SequenceLengthVariation result = (SequenceLengthVariation) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SequenceLengthVariation findById(
			org.irri.iric.chado.so.SequenceLengthVariationId id) {
		log.debug("getting SequenceLengthVariation instance with id: " + id);
		try {
			SequenceLengthVariation instance = (SequenceLengthVariation) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.SequenceLengthVariation",
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

	public List findByExample(SequenceLengthVariation instance) {
		log.debug("finding SequenceLengthVariation instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.SequenceLengthVariation")
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
