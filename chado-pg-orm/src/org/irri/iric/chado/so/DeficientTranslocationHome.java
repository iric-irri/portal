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
 * Home object for domain model class DeficientTranslocation.
 * @see org.irri.iric.chado.so.DeficientTranslocation
 * @author Hibernate Tools
 */
public class DeficientTranslocationHome {

	private static final Log log = LogFactory
			.getLog(DeficientTranslocationHome.class);

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

	public void persist(DeficientTranslocation transientInstance) {
		log.debug("persisting DeficientTranslocation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(DeficientTranslocation instance) {
		log.debug("attaching dirty DeficientTranslocation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DeficientTranslocation instance) {
		log.debug("attaching clean DeficientTranslocation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(DeficientTranslocation persistentInstance) {
		log.debug("deleting DeficientTranslocation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DeficientTranslocation merge(DeficientTranslocation detachedInstance) {
		log.debug("merging DeficientTranslocation instance");
		try {
			DeficientTranslocation result = (DeficientTranslocation) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DeficientTranslocation findById(
			org.irri.iric.chado.so.DeficientTranslocationId id) {
		log.debug("getting DeficientTranslocation instance with id: " + id);
		try {
			DeficientTranslocation instance = (DeficientTranslocation) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.DeficientTranslocation", id);
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

	public List findByExample(DeficientTranslocation instance) {
		log.debug("finding DeficientTranslocation instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.DeficientTranslocation")
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
