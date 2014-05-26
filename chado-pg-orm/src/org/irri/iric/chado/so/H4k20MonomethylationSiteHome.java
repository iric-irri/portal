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
 * Home object for domain model class H4k20MonomethylationSite.
 * @see org.irri.iric.chado.so.H4k20MonomethylationSite
 * @author Hibernate Tools
 */
public class H4k20MonomethylationSiteHome {

	private static final Log log = LogFactory
			.getLog(H4k20MonomethylationSiteHome.class);

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

	public void persist(H4k20MonomethylationSite transientInstance) {
		log.debug("persisting H4k20MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(H4k20MonomethylationSite instance) {
		log.debug("attaching dirty H4k20MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(H4k20MonomethylationSite instance) {
		log.debug("attaching clean H4k20MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(H4k20MonomethylationSite persistentInstance) {
		log.debug("deleting H4k20MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public H4k20MonomethylationSite merge(
			H4k20MonomethylationSite detachedInstance) {
		log.debug("merging H4k20MonomethylationSite instance");
		try {
			H4k20MonomethylationSite result = (H4k20MonomethylationSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public H4k20MonomethylationSite findById(
			org.irri.iric.chado.so.H4k20MonomethylationSiteId id) {
		log.debug("getting H4k20MonomethylationSite instance with id: " + id);
		try {
			H4k20MonomethylationSite instance = (H4k20MonomethylationSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.H4k20MonomethylationSite",
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

	public List findByExample(H4k20MonomethylationSite instance) {
		log.debug("finding H4k20MonomethylationSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.H4k20MonomethylationSite")
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
