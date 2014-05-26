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
 * Home object for domain model class Sl7AcceptorSite.
 * @see org.irri.iric.chado.so.Sl7AcceptorSite
 * @author Hibernate Tools
 */
public class Sl7AcceptorSiteHome {

	private static final Log log = LogFactory.getLog(Sl7AcceptorSiteHome.class);

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

	public void persist(Sl7AcceptorSite transientInstance) {
		log.debug("persisting Sl7AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Sl7AcceptorSite instance) {
		log.debug("attaching dirty Sl7AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sl7AcceptorSite instance) {
		log.debug("attaching clean Sl7AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Sl7AcceptorSite persistentInstance) {
		log.debug("deleting Sl7AcceptorSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sl7AcceptorSite merge(Sl7AcceptorSite detachedInstance) {
		log.debug("merging Sl7AcceptorSite instance");
		try {
			Sl7AcceptorSite result = (Sl7AcceptorSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Sl7AcceptorSite findById(org.irri.iric.chado.so.Sl7AcceptorSiteId id) {
		log.debug("getting Sl7AcceptorSite instance with id: " + id);
		try {
			Sl7AcceptorSite instance = (Sl7AcceptorSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Sl7AcceptorSite", id);
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

	public List findByExample(Sl7AcceptorSite instance) {
		log.debug("finding Sl7AcceptorSite instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.Sl7AcceptorSite")
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
