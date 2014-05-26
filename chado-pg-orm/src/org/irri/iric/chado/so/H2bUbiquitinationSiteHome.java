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
 * Home object for domain model class H2bUbiquitinationSite.
 * @see org.irri.iric.chado.so.H2bUbiquitinationSite
 * @author Hibernate Tools
 */
public class H2bUbiquitinationSiteHome {

	private static final Log log = LogFactory
			.getLog(H2bUbiquitinationSiteHome.class);

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

	public void persist(H2bUbiquitinationSite transientInstance) {
		log.debug("persisting H2bUbiquitinationSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(H2bUbiquitinationSite instance) {
		log.debug("attaching dirty H2bUbiquitinationSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(H2bUbiquitinationSite instance) {
		log.debug("attaching clean H2bUbiquitinationSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(H2bUbiquitinationSite persistentInstance) {
		log.debug("deleting H2bUbiquitinationSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public H2bUbiquitinationSite merge(H2bUbiquitinationSite detachedInstance) {
		log.debug("merging H2bUbiquitinationSite instance");
		try {
			H2bUbiquitinationSite result = (H2bUbiquitinationSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public H2bUbiquitinationSite findById(
			org.irri.iric.chado.so.H2bUbiquitinationSiteId id) {
		log.debug("getting H2bUbiquitinationSite instance with id: " + id);
		try {
			H2bUbiquitinationSite instance = (H2bUbiquitinationSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.H2bUbiquitinationSite", id);
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

	public List findByExample(H2bUbiquitinationSite instance) {
		log.debug("finding H2bUbiquitinationSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.H2bUbiquitinationSite")
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
