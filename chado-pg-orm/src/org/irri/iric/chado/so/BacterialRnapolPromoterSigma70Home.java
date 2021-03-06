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
 * Home object for domain model class BacterialRnapolPromoterSigma70.
 * @see org.irri.iric.chado.so.BacterialRnapolPromoterSigma70
 * @author Hibernate Tools
 */
public class BacterialRnapolPromoterSigma70Home {

	private static final Log log = LogFactory
			.getLog(BacterialRnapolPromoterSigma70Home.class);

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

	public void persist(BacterialRnapolPromoterSigma70 transientInstance) {
		log.debug("persisting BacterialRnapolPromoterSigma70 instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BacterialRnapolPromoterSigma70 instance) {
		log.debug("attaching dirty BacterialRnapolPromoterSigma70 instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BacterialRnapolPromoterSigma70 instance) {
		log.debug("attaching clean BacterialRnapolPromoterSigma70 instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BacterialRnapolPromoterSigma70 persistentInstance) {
		log.debug("deleting BacterialRnapolPromoterSigma70 instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BacterialRnapolPromoterSigma70 merge(
			BacterialRnapolPromoterSigma70 detachedInstance) {
		log.debug("merging BacterialRnapolPromoterSigma70 instance");
		try {
			BacterialRnapolPromoterSigma70 result = (BacterialRnapolPromoterSigma70) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BacterialRnapolPromoterSigma70 findById(
			org.irri.iric.chado.so.BacterialRnapolPromoterSigma70Id id) {
		log.debug("getting BacterialRnapolPromoterSigma70 instance with id: "
				+ id);
		try {
			BacterialRnapolPromoterSigma70 instance = (BacterialRnapolPromoterSigma70) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.BacterialRnapolPromoterSigma70",
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

	public List findByExample(BacterialRnapolPromoterSigma70 instance) {
		log.debug("finding BacterialRnapolPromoterSigma70 instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.BacterialRnapolPromoterSigma70")
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
