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
 * Home object for domain model class StTurnRightHandedTypeTwo.
 * @see org.irri.iric.chado.so.StTurnRightHandedTypeTwo
 * @author Hibernate Tools
 */
public class StTurnRightHandedTypeTwoHome {

	private static final Log log = LogFactory
			.getLog(StTurnRightHandedTypeTwoHome.class);

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

	public void persist(StTurnRightHandedTypeTwo transientInstance) {
		log.debug("persisting StTurnRightHandedTypeTwo instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StTurnRightHandedTypeTwo instance) {
		log.debug("attaching dirty StTurnRightHandedTypeTwo instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StTurnRightHandedTypeTwo instance) {
		log.debug("attaching clean StTurnRightHandedTypeTwo instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StTurnRightHandedTypeTwo persistentInstance) {
		log.debug("deleting StTurnRightHandedTypeTwo instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StTurnRightHandedTypeTwo merge(
			StTurnRightHandedTypeTwo detachedInstance) {
		log.debug("merging StTurnRightHandedTypeTwo instance");
		try {
			StTurnRightHandedTypeTwo result = (StTurnRightHandedTypeTwo) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StTurnRightHandedTypeTwo findById(
			org.irri.iric.chado.so.StTurnRightHandedTypeTwoId id) {
		log.debug("getting StTurnRightHandedTypeTwo instance with id: " + id);
		try {
			StTurnRightHandedTypeTwo instance = (StTurnRightHandedTypeTwo) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.StTurnRightHandedTypeTwo",
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

	public List findByExample(StTurnRightHandedTypeTwo instance) {
		log.debug("finding StTurnRightHandedTypeTwo instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.StTurnRightHandedTypeTwo")
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
