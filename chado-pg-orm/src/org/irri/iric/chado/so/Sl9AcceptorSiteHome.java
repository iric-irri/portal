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
 * Home object for domain model class Sl9AcceptorSite.
 * @see org.irri.iric.chado.so.Sl9AcceptorSite
 * @author Hibernate Tools
 */
public class Sl9AcceptorSiteHome {

	private static final Log log = LogFactory.getLog(Sl9AcceptorSiteHome.class);

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

	public void persist(Sl9AcceptorSite transientInstance) {
		log.debug("persisting Sl9AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Sl9AcceptorSite instance) {
		log.debug("attaching dirty Sl9AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sl9AcceptorSite instance) {
		log.debug("attaching clean Sl9AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Sl9AcceptorSite persistentInstance) {
		log.debug("deleting Sl9AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sl9AcceptorSite merge(Sl9AcceptorSite detachedInstance) {
		log.debug("merging Sl9AcceptorSite instance");
		try {
			Sl9AcceptorSite result = (Sl9AcceptorSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Sl9AcceptorSite findById(org.irri.iric.chado.so.Sl9AcceptorSiteId id) {
		log.debug("getting Sl9AcceptorSite instance with id: " + id);
		try {
			Sl9AcceptorSite instance = (Sl9AcceptorSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Sl9AcceptorSite", id);
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

	public List findByExample(Sl9AcceptorSite instance) {
		log.debug("finding Sl9AcceptorSite instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.Sl9AcceptorSite")
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
