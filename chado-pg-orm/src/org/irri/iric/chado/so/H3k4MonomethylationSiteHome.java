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
 * Home object for domain model class H3k4MonomethylationSite.
 * @see org.irri.iric.chado.so.H3k4MonomethylationSite
 * @author Hibernate Tools
 */
public class H3k4MonomethylationSiteHome {

	private static final Log log = LogFactory
			.getLog(H3k4MonomethylationSiteHome.class);

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

	public void persist(H3k4MonomethylationSite transientInstance) {
		log.debug("persisting H3k4MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(H3k4MonomethylationSite instance) {
		log.debug("attaching dirty H3k4MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(H3k4MonomethylationSite instance) {
		log.debug("attaching clean H3k4MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(H3k4MonomethylationSite persistentInstance) {
		log.debug("deleting H3k4MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public H3k4MonomethylationSite merge(
			H3k4MonomethylationSite detachedInstance) {
		log.debug("merging H3k4MonomethylationSite instance");
		try {
			H3k4MonomethylationSite result = (H3k4MonomethylationSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public H3k4MonomethylationSite findById(
			org.irri.iric.chado.so.H3k4MonomethylationSiteId id) {
		log.debug("getting H3k4MonomethylationSite instance with id: " + id);
		try {
			H3k4MonomethylationSite instance = (H3k4MonomethylationSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.H3k4MonomethylationSite",
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

	public List findByExample(H3k4MonomethylationSite instance) {
		log.debug("finding H3k4MonomethylationSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.H3k4MonomethylationSite")
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
