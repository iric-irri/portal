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
 * Home object for domain model class H2bk5MonomethylationSite.
 * @see org.irri.iric.chado.so.H2bk5MonomethylationSite
 * @author Hibernate Tools
 */
public class H2bk5MonomethylationSiteHome {

	private static final Log log = LogFactory
			.getLog(H2bk5MonomethylationSiteHome.class);

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

	public void persist(H2bk5MonomethylationSite transientInstance) {
		log.debug("persisting H2bk5MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(H2bk5MonomethylationSite instance) {
		log.debug("attaching dirty H2bk5MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(H2bk5MonomethylationSite instance) {
		log.debug("attaching clean H2bk5MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(H2bk5MonomethylationSite persistentInstance) {
		log.debug("deleting H2bk5MonomethylationSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public H2bk5MonomethylationSite merge(
			H2bk5MonomethylationSite detachedInstance) {
		log.debug("merging H2bk5MonomethylationSite instance");
		try {
			H2bk5MonomethylationSite result = (H2bk5MonomethylationSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public H2bk5MonomethylationSite findById(
			org.irri.iric.chado.so.H2bk5MonomethylationSiteId id) {
		log.debug("getting H2bk5MonomethylationSite instance with id: " + id);
		try {
			H2bk5MonomethylationSite instance = (H2bk5MonomethylationSite) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.H2bk5MonomethylationSite",
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

	public List findByExample(H2bk5MonomethylationSite instance) {
		log.debug("finding H2bk5MonomethylationSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.H2bk5MonomethylationSite")
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
