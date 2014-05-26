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
 * Home object for domain model class PositiveSenseSsrnaViralSequence.
 * @see org.irri.iric.chado.so.PositiveSenseSsrnaViralSequence
 * @author Hibernate Tools
 */
public class PositiveSenseSsrnaViralSequenceHome {

	private static final Log log = LogFactory
			.getLog(PositiveSenseSsrnaViralSequenceHome.class);

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

	public void persist(PositiveSenseSsrnaViralSequence transientInstance) {
		log.debug("persisting PositiveSenseSsrnaViralSequence instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PositiveSenseSsrnaViralSequence instance) {
		log.debug("attaching dirty PositiveSenseSsrnaViralSequence instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PositiveSenseSsrnaViralSequence instance) {
		log.debug("attaching clean PositiveSenseSsrnaViralSequence instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PositiveSenseSsrnaViralSequence persistentInstance) {
		log.debug("deleting PositiveSenseSsrnaViralSequence instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PositiveSenseSsrnaViralSequence merge(
			PositiveSenseSsrnaViralSequence detachedInstance) {
		log.debug("merging PositiveSenseSsrnaViralSequence instance");
		try {
			PositiveSenseSsrnaViralSequence result = (PositiveSenseSsrnaViralSequence) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PositiveSenseSsrnaViralSequence findById(
			org.irri.iric.chado.so.PositiveSenseSsrnaViralSequenceId id) {
		log.debug("getting PositiveSenseSsrnaViralSequence instance with id: "
				+ id);
		try {
			PositiveSenseSsrnaViralSequence instance = (PositiveSenseSsrnaViralSequence) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.PositiveSenseSsrnaViralSequence",
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

	public List findByExample(PositiveSenseSsrnaViralSequence instance) {
		log.debug("finding PositiveSenseSsrnaViralSequence instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PositiveSenseSsrnaViralSequence")
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
