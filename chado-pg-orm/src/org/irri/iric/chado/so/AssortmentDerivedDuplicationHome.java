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
 * Home object for domain model class AssortmentDerivedDuplication.
 * @see org.irri.iric.chado.so.AssortmentDerivedDuplication
 * @author Hibernate Tools
 */
public class AssortmentDerivedDuplicationHome {

	private static final Log log = LogFactory
			.getLog(AssortmentDerivedDuplicationHome.class);

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

	public void persist(AssortmentDerivedDuplication transientInstance) {
		log.debug("persisting AssortmentDerivedDuplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(AssortmentDerivedDuplication instance) {
		log.debug("attaching dirty AssortmentDerivedDuplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AssortmentDerivedDuplication instance) {
		log.debug("attaching clean AssortmentDerivedDuplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(AssortmentDerivedDuplication persistentInstance) {
		log.debug("deleting AssortmentDerivedDuplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AssortmentDerivedDuplication merge(
			AssortmentDerivedDuplication detachedInstance) {
		log.debug("merging AssortmentDerivedDuplication instance");
		try {
			AssortmentDerivedDuplication result = (AssortmentDerivedDuplication) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AssortmentDerivedDuplication findById(
			org.irri.iric.chado.so.AssortmentDerivedDuplicationId id) {
		log.debug("getting AssortmentDerivedDuplication instance with id: "
				+ id);
		try {
			AssortmentDerivedDuplication instance = (AssortmentDerivedDuplication) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.AssortmentDerivedDuplication",
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

	public List findByExample(AssortmentDerivedDuplication instance) {
		log.debug("finding AssortmentDerivedDuplication instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.AssortmentDerivedDuplication")
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
