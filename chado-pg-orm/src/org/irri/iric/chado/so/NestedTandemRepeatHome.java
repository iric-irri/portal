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
 * Home object for domain model class NestedTandemRepeat.
 * @see org.irri.iric.chado.so.NestedTandemRepeat
 * @author Hibernate Tools
 */
public class NestedTandemRepeatHome {

	private static final Log log = LogFactory
			.getLog(NestedTandemRepeatHome.class);

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

	public void persist(NestedTandemRepeat transientInstance) {
		log.debug("persisting NestedTandemRepeat instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(NestedTandemRepeat instance) {
		log.debug("attaching dirty NestedTandemRepeat instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NestedTandemRepeat instance) {
		log.debug("attaching clean NestedTandemRepeat instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(NestedTandemRepeat persistentInstance) {
		log.debug("deleting NestedTandemRepeat instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NestedTandemRepeat merge(NestedTandemRepeat detachedInstance) {
		log.debug("merging NestedTandemRepeat instance");
		try {
			NestedTandemRepeat result = (NestedTandemRepeat) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NestedTandemRepeat findById(
			org.irri.iric.chado.so.NestedTandemRepeatId id) {
		log.debug("getting NestedTandemRepeat instance with id: " + id);
		try {
			NestedTandemRepeat instance = (NestedTandemRepeat) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.NestedTandemRepeat", id);
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

	public List findByExample(NestedTandemRepeat instance) {
		log.debug("finding NestedTandemRepeat instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.NestedTandemRepeat")
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
