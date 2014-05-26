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
 * Home object for domain model class CommonAncestorCvterm.
 * @see org.irri.iric.chado.CommonAncestorCvterm
 * @author Hibernate Tools
 */
public class CommonAncestorCvtermHome {

	private static final Log log = LogFactory
			.getLog(CommonAncestorCvtermHome.class);

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

	public void persist(CommonAncestorCvterm transientInstance) {
		log.debug("persisting CommonAncestorCvterm instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CommonAncestorCvterm instance) {
		log.debug("attaching dirty CommonAncestorCvterm instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CommonAncestorCvterm instance) {
		log.debug("attaching clean CommonAncestorCvterm instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CommonAncestorCvterm persistentInstance) {
		log.debug("deleting CommonAncestorCvterm instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CommonAncestorCvterm merge(CommonAncestorCvterm detachedInstance) {
		log.debug("merging CommonAncestorCvterm instance");
		try {
			CommonAncestorCvterm result = (CommonAncestorCvterm) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CommonAncestorCvterm findById(
			org.irri.iric.chado.CommonAncestorCvtermId id) {
		log.debug("getting CommonAncestorCvterm instance with id: " + id);
		try {
			CommonAncestorCvterm instance = (CommonAncestorCvterm) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.CommonAncestorCvterm", id);
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

	public List findByExample(CommonAncestorCvterm instance) {
		log.debug("finding CommonAncestorCvterm instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.CommonAncestorCvterm")
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
