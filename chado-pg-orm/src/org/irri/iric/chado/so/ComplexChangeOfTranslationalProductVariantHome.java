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
 * Home object for domain model class ComplexChangeOfTranslationalProductVariant.
 * @see org.irri.iric.chado.so.ComplexChangeOfTranslationalProductVariant
 * @author Hibernate Tools
 */
public class ComplexChangeOfTranslationalProductVariantHome {

	private static final Log log = LogFactory
			.getLog(ComplexChangeOfTranslationalProductVariantHome.class);

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
			ComplexChangeOfTranslationalProductVariant transientInstance) {
		log.debug("persisting ComplexChangeOfTranslationalProductVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ComplexChangeOfTranslationalProductVariant instance) {
		log.debug("attaching dirty ComplexChangeOfTranslationalProductVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComplexChangeOfTranslationalProductVariant instance) {
		log.debug("attaching clean ComplexChangeOfTranslationalProductVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			ComplexChangeOfTranslationalProductVariant persistentInstance) {
		log.debug("deleting ComplexChangeOfTranslationalProductVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComplexChangeOfTranslationalProductVariant merge(
			ComplexChangeOfTranslationalProductVariant detachedInstance) {
		log.debug("merging ComplexChangeOfTranslationalProductVariant instance");
		try {
			ComplexChangeOfTranslationalProductVariant result = (ComplexChangeOfTranslationalProductVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ComplexChangeOfTranslationalProductVariant findById(
			org.irri.iric.chado.so.ComplexChangeOfTranslationalProductVariantId id) {
		log.debug("getting ComplexChangeOfTranslationalProductVariant instance with id: "
				+ id);
		try {
			ComplexChangeOfTranslationalProductVariant instance = (ComplexChangeOfTranslationalProductVariant) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.ComplexChangeOfTranslationalProductVariant",
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
			ComplexChangeOfTranslationalProductVariant instance) {
		log.debug("finding ComplexChangeOfTranslationalProductVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ComplexChangeOfTranslationalProductVariant")
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
