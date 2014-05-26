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
 * Home object for domain model class PedigreeSpecificVariant.
 * @see org.irri.iric.chado.so.PedigreeSpecificVariant
 * @author Hibernate Tools
 */
public class PedigreeSpecificVariantHome {

	private static final Log log = LogFactory
			.getLog(PedigreeSpecificVariantHome.class);

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

	public void persist(PedigreeSpecificVariant transientInstance) {
		log.debug("persisting PedigreeSpecificVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PedigreeSpecificVariant instance) {
		log.debug("attaching dirty PedigreeSpecificVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PedigreeSpecificVariant instance) {
		log.debug("attaching clean PedigreeSpecificVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PedigreeSpecificVariant persistentInstance) {
		log.debug("deleting PedigreeSpecificVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PedigreeSpecificVariant merge(
			PedigreeSpecificVariant detachedInstance) {
		log.debug("merging PedigreeSpecificVariant instance");
		try {
			PedigreeSpecificVariant result = (PedigreeSpecificVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PedigreeSpecificVariant findById(
			org.irri.iric.chado.so.PedigreeSpecificVariantId id) {
		log.debug("getting PedigreeSpecificVariant instance with id: " + id);
		try {
			PedigreeSpecificVariant instance = (PedigreeSpecificVariant) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PedigreeSpecificVariant",
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

	public List findByExample(PedigreeSpecificVariant instance) {
		log.debug("finding PedigreeSpecificVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PedigreeSpecificVariant")
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
