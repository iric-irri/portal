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
 * Home object for domain model class Sl10AccceptorSite.
 * @see org.irri.iric.chado.so.Sl10AccceptorSite
 * @author Hibernate Tools
 */
public class Sl10AccceptorSiteHome {

	private static final Log log = LogFactory
			.getLog(Sl10AccceptorSiteHome.class);

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

	public void persist(Sl10AccceptorSite transientInstance) {
		log.debug("persisting Sl10AccceptorSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Sl10AccceptorSite instance) {
		log.debug("attaching dirty Sl10AccceptorSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sl10AccceptorSite instance) {
		log.debug("attaching clean Sl10AccceptorSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Sl10AccceptorSite persistentInstance) {
		log.debug("deleting Sl10AccceptorSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sl10AccceptorSite merge(Sl10AccceptorSite detachedInstance) {
		log.debug("merging Sl10AccceptorSite instance");
		try {
			Sl10AccceptorSite result = (Sl10AccceptorSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Sl10AccceptorSite findById(
			org.irri.iric.chado.so.Sl10AccceptorSiteId id) {
		log.debug("getting Sl10AccceptorSite instance with id: " + id);
		try {
			Sl10AccceptorSite instance = (Sl10AccceptorSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Sl10AccceptorSite", id);
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

	public List findByExample(Sl10AccceptorSite instance) {
		log.debug("finding Sl10AccceptorSite instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.Sl10AccceptorSite")
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
