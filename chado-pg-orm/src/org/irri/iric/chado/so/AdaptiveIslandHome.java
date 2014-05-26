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
 * Home object for domain model class AdaptiveIsland.
 * @see org.irri.iric.chado.so.AdaptiveIsland
 * @author Hibernate Tools
 */
public class AdaptiveIslandHome {

	private static final Log log = LogFactory.getLog(AdaptiveIslandHome.class);

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

	public void persist(AdaptiveIsland transientInstance) {
		log.debug("persisting AdaptiveIsland instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(AdaptiveIsland instance) {
		log.debug("attaching dirty AdaptiveIsland instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AdaptiveIsland instance) {
		log.debug("attaching clean AdaptiveIsland instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(AdaptiveIsland persistentInstance) {
		log.debug("deleting AdaptiveIsland instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AdaptiveIsland merge(AdaptiveIsland detachedInstance) {
		log.debug("merging AdaptiveIsland instance");
		try {
			AdaptiveIsland result = (AdaptiveIsland) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AdaptiveIsland findById(org.irri.iric.chado.so.AdaptiveIslandId id) {
		log.debug("getting AdaptiveIsland instance with id: " + id);
		try {
			AdaptiveIsland instance = (AdaptiveIsland) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.AdaptiveIsland", id);
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

	public List findByExample(AdaptiveIsland instance) {
		log.debug("finding AdaptiveIsland instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.AdaptiveIsland")
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
