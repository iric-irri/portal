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
 * Home object for domain model class FivePrimeDNonamer.
 * @see org.irri.iric.chado.so.FivePrimeDNonamer
 * @author Hibernate Tools
 */
public class FivePrimeDNonamerHome {

	private static final Log log = LogFactory
			.getLog(FivePrimeDNonamerHome.class);

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

	public void persist(FivePrimeDNonamer transientInstance) {
		log.debug("persisting FivePrimeDNonamer instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(FivePrimeDNonamer instance) {
		log.debug("attaching dirty FivePrimeDNonamer instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FivePrimeDNonamer instance) {
		log.debug("attaching clean FivePrimeDNonamer instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(FivePrimeDNonamer persistentInstance) {
		log.debug("deleting FivePrimeDNonamer instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FivePrimeDNonamer merge(FivePrimeDNonamer detachedInstance) {
		log.debug("merging FivePrimeDNonamer instance");
		try {
			FivePrimeDNonamer result = (FivePrimeDNonamer) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FivePrimeDNonamer findById(
			org.irri.iric.chado.so.FivePrimeDNonamerId id) {
		log.debug("getting FivePrimeDNonamer instance with id: " + id);
		try {
			FivePrimeDNonamer instance = (FivePrimeDNonamer) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.FivePrimeDNonamer", id);
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

	public List findByExample(FivePrimeDNonamer instance) {
		log.debug("finding FivePrimeDNonamer instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.FivePrimeDNonamer")
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
