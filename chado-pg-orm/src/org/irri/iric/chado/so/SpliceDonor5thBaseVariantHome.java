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
 * Home object for domain model class SpliceDonor5thBaseVariant.
 * @see org.irri.iric.chado.so.SpliceDonor5thBaseVariant
 * @author Hibernate Tools
 */
public class SpliceDonor5thBaseVariantHome {

	private static final Log log = LogFactory
			.getLog(SpliceDonor5thBaseVariantHome.class);

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

	public void persist(SpliceDonor5thBaseVariant transientInstance) {
		log.debug("persisting SpliceDonor5thBaseVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SpliceDonor5thBaseVariant instance) {
		log.debug("attaching dirty SpliceDonor5thBaseVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SpliceDonor5thBaseVariant instance) {
		log.debug("attaching clean SpliceDonor5thBaseVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SpliceDonor5thBaseVariant persistentInstance) {
		log.debug("deleting SpliceDonor5thBaseVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SpliceDonor5thBaseVariant merge(
			SpliceDonor5thBaseVariant detachedInstance) {
		log.debug("merging SpliceDonor5thBaseVariant instance");
		try {
			SpliceDonor5thBaseVariant result = (SpliceDonor5thBaseVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpliceDonor5thBaseVariant findById(
			org.irri.iric.chado.so.SpliceDonor5thBaseVariantId id) {
		log.debug("getting SpliceDonor5thBaseVariant instance with id: " + id);
		try {
			SpliceDonor5thBaseVariant instance = (SpliceDonor5thBaseVariant) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.SpliceDonor5thBaseVariant",
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

	public List findByExample(SpliceDonor5thBaseVariant instance) {
		log.debug("finding SpliceDonor5thBaseVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.SpliceDonor5thBaseVariant")
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
