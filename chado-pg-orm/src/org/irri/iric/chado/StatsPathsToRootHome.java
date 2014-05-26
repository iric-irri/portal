package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class StatsPathsToRoot.
 * @see org.irri.iric.chado.StatsPathsToRoot
 * @author Hibernate Tools
 */
public class StatsPathsToRootHome {

	private static final Log log = LogFactory
			.getLog(StatsPathsToRootHome.class);

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

	public void persist(StatsPathsToRoot transientInstance) {
		log.debug("persisting StatsPathsToRoot instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StatsPathsToRoot instance) {
		log.debug("attaching dirty StatsPathsToRoot instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StatsPathsToRoot instance) {
		log.debug("attaching clean StatsPathsToRoot instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StatsPathsToRoot persistentInstance) {
		log.debug("deleting StatsPathsToRoot instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StatsPathsToRoot merge(StatsPathsToRoot detachedInstance) {
		log.debug("merging StatsPathsToRoot instance");
		try {
			StatsPathsToRoot result = (StatsPathsToRoot) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StatsPathsToRoot findById(org.irri.iric.chado.StatsPathsToRootId id) {
		log.debug("getting StatsPathsToRoot instance with id: " + id);
		try {
			StatsPathsToRoot instance = (StatsPathsToRoot) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.StatsPathsToRoot", id);
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

	public List findByExample(StatsPathsToRoot instance) {
		log.debug("finding StatsPathsToRoot instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.StatsPathsToRoot")
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
