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
 * Home object for domain model class PhenylalanylTrna.
 * @see org.irri.iric.chado.so.PhenylalanylTrna
 * @author Hibernate Tools
 */
public class PhenylalanylTrnaHome {

	private static final Log log = LogFactory
			.getLog(PhenylalanylTrnaHome.class);

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

	public void persist(PhenylalanylTrna transientInstance) {
		log.debug("persisting PhenylalanylTrna instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PhenylalanylTrna instance) {
		log.debug("attaching dirty PhenylalanylTrna instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PhenylalanylTrna instance) {
		log.debug("attaching clean PhenylalanylTrna instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PhenylalanylTrna persistentInstance) {
		log.debug("deleting PhenylalanylTrna instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PhenylalanylTrna merge(PhenylalanylTrna detachedInstance) {
		log.debug("merging PhenylalanylTrna instance");
		try {
			PhenylalanylTrna result = (PhenylalanylTrna) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PhenylalanylTrna findById(
			org.irri.iric.chado.so.PhenylalanylTrnaId id) {
		log.debug("getting PhenylalanylTrna instance with id: " + id);
		try {
			PhenylalanylTrna instance = (PhenylalanylTrna) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PhenylalanylTrna", id);
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

	public List findByExample(PhenylalanylTrna instance) {
		log.debug("finding PhenylalanylTrna instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.PhenylalanylTrna")
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
