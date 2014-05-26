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
 * Home object for domain model class AssortmentDerivedAneuploid.
 * @see org.irri.iric.chado.so.AssortmentDerivedAneuploid
 * @author Hibernate Tools
 */
public class AssortmentDerivedAneuploidHome {

	private static final Log log = LogFactory
			.getLog(AssortmentDerivedAneuploidHome.class);

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

	public void persist(AssortmentDerivedAneuploid transientInstance) {
		log.debug("persisting AssortmentDerivedAneuploid instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(AssortmentDerivedAneuploid instance) {
		log.debug("attaching dirty AssortmentDerivedAneuploid instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AssortmentDerivedAneuploid instance) {
		log.debug("attaching clean AssortmentDerivedAneuploid instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(AssortmentDerivedAneuploid persistentInstance) {
		log.debug("deleting AssortmentDerivedAneuploid instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AssortmentDerivedAneuploid merge(
			AssortmentDerivedAneuploid detachedInstance) {
		log.debug("merging AssortmentDerivedAneuploid instance");
		try {
			AssortmentDerivedAneuploid result = (AssortmentDerivedAneuploid) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AssortmentDerivedAneuploid findById(
			org.irri.iric.chado.so.AssortmentDerivedAneuploidId id) {
		log.debug("getting AssortmentDerivedAneuploid instance with id: " + id);
		try {
			AssortmentDerivedAneuploid instance = (AssortmentDerivedAneuploid) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.AssortmentDerivedAneuploid",
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

	public List findByExample(AssortmentDerivedAneuploid instance) {
		log.debug("finding AssortmentDerivedAneuploid instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.AssortmentDerivedAneuploid")
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
