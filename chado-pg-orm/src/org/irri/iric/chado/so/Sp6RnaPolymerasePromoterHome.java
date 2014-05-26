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
 * Home object for domain model class Sp6RnaPolymerasePromoter.
 * @see org.irri.iric.chado.so.Sp6RnaPolymerasePromoter
 * @author Hibernate Tools
 */
public class Sp6RnaPolymerasePromoterHome {

	private static final Log log = LogFactory
			.getLog(Sp6RnaPolymerasePromoterHome.class);

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

	public void persist(Sp6RnaPolymerasePromoter transientInstance) {
		log.debug("persisting Sp6RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Sp6RnaPolymerasePromoter instance) {
		log.debug("attaching dirty Sp6RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sp6RnaPolymerasePromoter instance) {
		log.debug("attaching clean Sp6RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Sp6RnaPolymerasePromoter persistentInstance) {
		log.debug("deleting Sp6RnaPolymerasePromoter instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sp6RnaPolymerasePromoter merge(
			Sp6RnaPolymerasePromoter detachedInstance) {
		log.debug("merging Sp6RnaPolymerasePromoter instance");
		try {
			Sp6RnaPolymerasePromoter result = (Sp6RnaPolymerasePromoter) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Sp6RnaPolymerasePromoter findById(
			org.irri.iric.chado.so.Sp6RnaPolymerasePromoterId id) {
		log.debug("getting Sp6RnaPolymerasePromoter instance with id: " + id);
		try {
			Sp6RnaPolymerasePromoter instance = (Sp6RnaPolymerasePromoter) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Sp6RnaPolymerasePromoter",
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

	public List findByExample(Sp6RnaPolymerasePromoter instance) {
		log.debug("finding Sp6RnaPolymerasePromoter instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Sp6RnaPolymerasePromoter")
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
