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
 * Home object for domain model class EndogenousRetroviralSequence.
 * @see org.irri.iric.chado.so.EndogenousRetroviralSequence
 * @author Hibernate Tools
 */
public class EndogenousRetroviralSequenceHome {

	private static final Log log = LogFactory
			.getLog(EndogenousRetroviralSequenceHome.class);

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

	public void persist(EndogenousRetroviralSequence transientInstance) {
		log.debug("persisting EndogenousRetroviralSequence instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(EndogenousRetroviralSequence instance) {
		log.debug("attaching dirty EndogenousRetroviralSequence instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EndogenousRetroviralSequence instance) {
		log.debug("attaching clean EndogenousRetroviralSequence instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(EndogenousRetroviralSequence persistentInstance) {
		log.debug("deleting EndogenousRetroviralSequence instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EndogenousRetroviralSequence merge(
			EndogenousRetroviralSequence detachedInstance) {
		log.debug("merging EndogenousRetroviralSequence instance");
		try {
			EndogenousRetroviralSequence result = (EndogenousRetroviralSequence) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EndogenousRetroviralSequence findById(
			org.irri.iric.chado.so.EndogenousRetroviralSequenceId id) {
		log.debug("getting EndogenousRetroviralSequence instance with id: "
				+ id);
		try {
			EndogenousRetroviralSequence instance = (EndogenousRetroviralSequence) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.EndogenousRetroviralSequence",
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

	public List findByExample(EndogenousRetroviralSequence instance) {
		log.debug("finding EndogenousRetroviralSequence instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.EndogenousRetroviralSequence")
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
