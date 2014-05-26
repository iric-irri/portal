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
 * Home object for domain model class Group1IntronHomingEndonucleaseTargetRegion.
 * @see org.irri.iric.chado.so.Group1IntronHomingEndonucleaseTargetRegion
 * @author Hibernate Tools
 */
public class Group1IntronHomingEndonucleaseTargetRegionHome {

	private static final Log log = LogFactory
			.getLog(Group1IntronHomingEndonucleaseTargetRegionHome.class);

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
			Group1IntronHomingEndonucleaseTargetRegion transientInstance) {
		log.debug("persisting Group1IntronHomingEndonucleaseTargetRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Group1IntronHomingEndonucleaseTargetRegion instance) {
		log.debug("attaching dirty Group1IntronHomingEndonucleaseTargetRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Group1IntronHomingEndonucleaseTargetRegion instance) {
		log.debug("attaching clean Group1IntronHomingEndonucleaseTargetRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			Group1IntronHomingEndonucleaseTargetRegion persistentInstance) {
		log.debug("deleting Group1IntronHomingEndonucleaseTargetRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Group1IntronHomingEndonucleaseTargetRegion merge(
			Group1IntronHomingEndonucleaseTargetRegion detachedInstance) {
		log.debug("merging Group1IntronHomingEndonucleaseTargetRegion instance");
		try {
			Group1IntronHomingEndonucleaseTargetRegion result = (Group1IntronHomingEndonucleaseTargetRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Group1IntronHomingEndonucleaseTargetRegion findById(
			org.irri.iric.chado.so.Group1IntronHomingEndonucleaseTargetRegionId id) {
		log.debug("getting Group1IntronHomingEndonucleaseTargetRegion instance with id: "
				+ id);
		try {
			Group1IntronHomingEndonucleaseTargetRegion instance = (Group1IntronHomingEndonucleaseTargetRegion) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.Group1IntronHomingEndonucleaseTargetRegion",
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

	public List findByExample(
			Group1IntronHomingEndonucleaseTargetRegion instance) {
		log.debug("finding Group1IntronHomingEndonucleaseTargetRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Group1IntronHomingEndonucleaseTargetRegion")
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
