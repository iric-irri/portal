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
 * Home object for domain model class TranslationalProductStructureVariant.
 * @see org.irri.iric.chado.so.TranslationalProductStructureVariant
 * @author Hibernate Tools
 */
public class TranslationalProductStructureVariantHome {

	private static final Log log = LogFactory
			.getLog(TranslationalProductStructureVariantHome.class);

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

	public void persist(TranslationalProductStructureVariant transientInstance) {
		log.debug("persisting TranslationalProductStructureVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TranslationalProductStructureVariant instance) {
		log.debug("attaching dirty TranslationalProductStructureVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TranslationalProductStructureVariant instance) {
		log.debug("attaching clean TranslationalProductStructureVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TranslationalProductStructureVariant persistentInstance) {
		log.debug("deleting TranslationalProductStructureVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TranslationalProductStructureVariant merge(
			TranslationalProductStructureVariant detachedInstance) {
		log.debug("merging TranslationalProductStructureVariant instance");
		try {
			TranslationalProductStructureVariant result = (TranslationalProductStructureVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TranslationalProductStructureVariant findById(
			org.irri.iric.chado.so.TranslationalProductStructureVariantId id) {
		log.debug("getting TranslationalProductStructureVariant instance with id: "
				+ id);
		try {
			TranslationalProductStructureVariant instance = (TranslationalProductStructureVariant) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.TranslationalProductStructureVariant",
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

	public List findByExample(TranslationalProductStructureVariant instance) {
		log.debug("finding TranslationalProductStructureVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.TranslationalProductStructureVariant")
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
