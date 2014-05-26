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
 * Home object for domain model class AssortmentDerivedDeficiency.
 * @see org.irri.iric.chado.so.AssortmentDerivedDeficiency
 * @author Hibernate Tools
 */
public class AssortmentDerivedDeficiencyHome {

	private static final Log log = LogFactory
			.getLog(AssortmentDerivedDeficiencyHome.class);

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

	public void persist(AssortmentDerivedDeficiency transientInstance) {
		log.debug("persisting AssortmentDerivedDeficiency instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(AssortmentDerivedDeficiency instance) {
		log.debug("attaching dirty AssortmentDerivedDeficiency instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AssortmentDerivedDeficiency instance) {
		log.debug("attaching clean AssortmentDerivedDeficiency instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(AssortmentDerivedDeficiency persistentInstance) {
		log.debug("deleting AssortmentDerivedDeficiency instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AssortmentDerivedDeficiency merge(
			AssortmentDerivedDeficiency detachedInstance) {
		log.debug("merging AssortmentDerivedDeficiency instance");
		try {
			AssortmentDerivedDeficiency result = (AssortmentDerivedDeficiency) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AssortmentDerivedDeficiency findById(
			org.irri.iric.chado.so.AssortmentDerivedDeficiencyId id) {
		log.debug("getting AssortmentDerivedDeficiency instance with id: " + id);
		try {
			AssortmentDerivedDeficiency instance = (AssortmentDerivedDeficiency) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.AssortmentDerivedDeficiency",
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

	public List findByExample(AssortmentDerivedDeficiency instance) {
		log.debug("finding AssortmentDerivedDeficiency instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.AssortmentDerivedDeficiency")
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
