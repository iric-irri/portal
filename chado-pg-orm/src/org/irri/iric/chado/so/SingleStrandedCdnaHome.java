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
 * Home object for domain model class SingleStrandedCdna.
 * @see org.irri.iric.chado.so.SingleStrandedCdna
 * @author Hibernate Tools
 */
public class SingleStrandedCdnaHome {

	private static final Log log = LogFactory
			.getLog(SingleStrandedCdnaHome.class);

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

	public void persist(SingleStrandedCdna transientInstance) {
		log.debug("persisting SingleStrandedCdna instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SingleStrandedCdna instance) {
		log.debug("attaching dirty SingleStrandedCdna instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SingleStrandedCdna instance) {
		log.debug("attaching clean SingleStrandedCdna instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SingleStrandedCdna persistentInstance) {
		log.debug("deleting SingleStrandedCdna instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SingleStrandedCdna merge(SingleStrandedCdna detachedInstance) {
		log.debug("merging SingleStrandedCdna instance");
		try {
			SingleStrandedCdna result = (SingleStrandedCdna) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SingleStrandedCdna findById(
			org.irri.iric.chado.so.SingleStrandedCdnaId id) {
		log.debug("getting SingleStrandedCdna instance with id: " + id);
		try {
			SingleStrandedCdna instance = (SingleStrandedCdna) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.SingleStrandedCdna", id);
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

	public List findByExample(SingleStrandedCdna instance) {
		log.debug("finding SingleStrandedCdna instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.SingleStrandedCdna")
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
