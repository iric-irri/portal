package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class FeatureCvtermDbxref.
 * @see org.irri.iric.chado.FeatureCvtermDbxref
 * @author Hibernate Tools
 */
public class FeatureCvtermDbxrefHome {

	private static final Log log = LogFactory
			.getLog(FeatureCvtermDbxrefHome.class);

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

	public void persist(FeatureCvtermDbxref transientInstance) {
		log.debug("persisting FeatureCvtermDbxref instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(FeatureCvtermDbxref instance) {
		log.debug("attaching dirty FeatureCvtermDbxref instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FeatureCvtermDbxref instance) {
		log.debug("attaching clean FeatureCvtermDbxref instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(FeatureCvtermDbxref persistentInstance) {
		log.debug("deleting FeatureCvtermDbxref instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FeatureCvtermDbxref merge(FeatureCvtermDbxref detachedInstance) {
		log.debug("merging FeatureCvtermDbxref instance");
		try {
			FeatureCvtermDbxref result = (FeatureCvtermDbxref) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FeatureCvtermDbxref findById(int id) {
		log.debug("getting FeatureCvtermDbxref instance with id: " + id);
		try {
			FeatureCvtermDbxref instance = (FeatureCvtermDbxref) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.FeatureCvtermDbxref", id);
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

	public List findByExample(FeatureCvtermDbxref instance) {
		log.debug("finding FeatureCvtermDbxref instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.FeatureCvtermDbxref")
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
