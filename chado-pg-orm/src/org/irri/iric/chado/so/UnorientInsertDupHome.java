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
 * Home object for domain model class UnorientInsertDup.
 * @see org.irri.iric.chado.so.UnorientInsertDup
 * @author Hibernate Tools
 */
public class UnorientInsertDupHome {

	private static final Log log = LogFactory
			.getLog(UnorientInsertDupHome.class);

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

	public void persist(UnorientInsertDup transientInstance) {
		log.debug("persisting UnorientInsertDup instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(UnorientInsertDup instance) {
		log.debug("attaching dirty UnorientInsertDup instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UnorientInsertDup instance) {
		log.debug("attaching clean UnorientInsertDup instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(UnorientInsertDup persistentInstance) {
		log.debug("deleting UnorientInsertDup instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UnorientInsertDup merge(UnorientInsertDup detachedInstance) {
		log.debug("merging UnorientInsertDup instance");
		try {
			UnorientInsertDup result = (UnorientInsertDup) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UnorientInsertDup findById(
			org.irri.iric.chado.so.UnorientInsertDupId id) {
		log.debug("getting UnorientInsertDup instance with id: " + id);
		try {
			UnorientInsertDup instance = (UnorientInsertDup) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.UnorientInsertDup", id);
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

	public List findByExample(UnorientInsertDup instance) {
		log.debug("finding UnorientInsertDup instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.UnorientInsertDup")
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
