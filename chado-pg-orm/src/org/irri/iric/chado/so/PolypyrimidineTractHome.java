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
 * Home object for domain model class PolypyrimidineTract.
 * @see org.irri.iric.chado.so.PolypyrimidineTract
 * @author Hibernate Tools
 */
public class PolypyrimidineTractHome {

	private static final Log log = LogFactory
			.getLog(PolypyrimidineTractHome.class);

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

	public void persist(PolypyrimidineTract transientInstance) {
		log.debug("persisting PolypyrimidineTract instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PolypyrimidineTract instance) {
		log.debug("attaching dirty PolypyrimidineTract instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PolypyrimidineTract instance) {
		log.debug("attaching clean PolypyrimidineTract instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PolypyrimidineTract persistentInstance) {
		log.debug("deleting PolypyrimidineTract instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PolypyrimidineTract merge(PolypyrimidineTract detachedInstance) {
		log.debug("merging PolypyrimidineTract instance");
		try {
			PolypyrimidineTract result = (PolypyrimidineTract) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PolypyrimidineTract findById(
			org.irri.iric.chado.so.PolypyrimidineTractId id) {
		log.debug("getting PolypyrimidineTract instance with id: " + id);
		try {
			PolypyrimidineTract instance = (PolypyrimidineTract) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PolypyrimidineTract", id);
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

	public List findByExample(PolypyrimidineTract instance) {
		log.debug("finding PolypyrimidineTract instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PolypyrimidineTract")
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
