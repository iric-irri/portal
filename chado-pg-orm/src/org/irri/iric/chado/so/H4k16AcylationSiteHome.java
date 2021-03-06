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
 * Home object for domain model class H4k16AcylationSite.
 * @see org.irri.iric.chado.so.H4k16AcylationSite
 * @author Hibernate Tools
 */
public class H4k16AcylationSiteHome {

	private static final Log log = LogFactory
			.getLog(H4k16AcylationSiteHome.class);

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

	public void persist(H4k16AcylationSite transientInstance) {
		log.debug("persisting H4k16AcylationSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(H4k16AcylationSite instance) {
		log.debug("attaching dirty H4k16AcylationSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(H4k16AcylationSite instance) {
		log.debug("attaching clean H4k16AcylationSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(H4k16AcylationSite persistentInstance) {
		log.debug("deleting H4k16AcylationSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public H4k16AcylationSite merge(H4k16AcylationSite detachedInstance) {
		log.debug("merging H4k16AcylationSite instance");
		try {
			H4k16AcylationSite result = (H4k16AcylationSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public H4k16AcylationSite findById(
			org.irri.iric.chado.so.H4k16AcylationSiteId id) {
		log.debug("getting H4k16AcylationSite instance with id: " + id);
		try {
			H4k16AcylationSite instance = (H4k16AcylationSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.H4k16AcylationSite", id);
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

	public List findByExample(H4k16AcylationSite instance) {
		log.debug("finding H4k16AcylationSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.H4k16AcylationSite")
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
