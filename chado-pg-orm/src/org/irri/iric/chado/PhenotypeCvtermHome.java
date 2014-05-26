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
 * Home object for domain model class PhenotypeCvterm.
 * @see org.irri.iric.chado.PhenotypeCvterm
 * @author Hibernate Tools
 */
public class PhenotypeCvtermHome {

	private static final Log log = LogFactory.getLog(PhenotypeCvtermHome.class);

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

	public void persist(PhenotypeCvterm transientInstance) {
		log.debug("persisting PhenotypeCvterm instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PhenotypeCvterm instance) {
		log.debug("attaching dirty PhenotypeCvterm instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PhenotypeCvterm instance) {
		log.debug("attaching clean PhenotypeCvterm instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PhenotypeCvterm persistentInstance) {
		log.debug("deleting PhenotypeCvterm instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PhenotypeCvterm merge(PhenotypeCvterm detachedInstance) {
		log.debug("merging PhenotypeCvterm instance");
		try {
			PhenotypeCvterm result = (PhenotypeCvterm) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PhenotypeCvterm findById(int id) {
		log.debug("getting PhenotypeCvterm instance with id: " + id);
		try {
			PhenotypeCvterm instance = (PhenotypeCvterm) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.PhenotypeCvterm", id);
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

	public List findByExample(PhenotypeCvterm instance) {
		log.debug("finding PhenotypeCvterm instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.PhenotypeCvterm")
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
