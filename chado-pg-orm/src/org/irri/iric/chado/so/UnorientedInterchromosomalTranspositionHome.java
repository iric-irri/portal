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
 * Home object for domain model class UnorientedInterchromosomalTransposition.
 * @see org.irri.iric.chado.so.UnorientedInterchromosomalTransposition
 * @author Hibernate Tools
 */
public class UnorientedInterchromosomalTranspositionHome {

	private static final Log log = LogFactory
			.getLog(UnorientedInterchromosomalTranspositionHome.class);

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

	public void persist(
			UnorientedInterchromosomalTransposition transientInstance) {
		log.debug("persisting UnorientedInterchromosomalTransposition instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(UnorientedInterchromosomalTransposition instance) {
		log.debug("attaching dirty UnorientedInterchromosomalTransposition instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UnorientedInterchromosomalTransposition instance) {
		log.debug("attaching clean UnorientedInterchromosomalTransposition instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			UnorientedInterchromosomalTransposition persistentInstance) {
		log.debug("deleting UnorientedInterchromosomalTransposition instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UnorientedInterchromosomalTransposition merge(
			UnorientedInterchromosomalTransposition detachedInstance) {
		log.debug("merging UnorientedInterchromosomalTransposition instance");
		try {
			UnorientedInterchromosomalTransposition result = (UnorientedInterchromosomalTransposition) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UnorientedInterchromosomalTransposition findById(
			org.irri.iric.chado.so.UnorientedInterchromosomalTranspositionId id) {
		log.debug("getting UnorientedInterchromosomalTransposition instance with id: "
				+ id);
		try {
			UnorientedInterchromosomalTransposition instance = (UnorientedInterchromosomalTransposition) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.UnorientedInterchromosomalTransposition",
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

	public List findByExample(UnorientedInterchromosomalTransposition instance) {
		log.debug("finding UnorientedInterchromosomalTransposition instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.UnorientedInterchromosomalTransposition")
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
