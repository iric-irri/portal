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
 * Home object for domain model class ProximalPromoterElement.
 * @see org.irri.iric.chado.so.ProximalPromoterElement
 * @author Hibernate Tools
 */
public class ProximalPromoterElementHome {

	private static final Log log = LogFactory
			.getLog(ProximalPromoterElementHome.class);

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

	public void persist(ProximalPromoterElement transientInstance) {
		log.debug("persisting ProximalPromoterElement instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProximalPromoterElement instance) {
		log.debug("attaching dirty ProximalPromoterElement instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProximalPromoterElement instance) {
		log.debug("attaching clean ProximalPromoterElement instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProximalPromoterElement persistentInstance) {
		log.debug("deleting ProximalPromoterElement instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProximalPromoterElement merge(
			ProximalPromoterElement detachedInstance) {
		log.debug("merging ProximalPromoterElement instance");
		try {
			ProximalPromoterElement result = (ProximalPromoterElement) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProximalPromoterElement findById(
			org.irri.iric.chado.so.ProximalPromoterElementId id) {
		log.debug("getting ProximalPromoterElement instance with id: " + id);
		try {
			ProximalPromoterElement instance = (ProximalPromoterElement) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ProximalPromoterElement",
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

	public List findByExample(ProximalPromoterElement instance) {
		log.debug("finding ProximalPromoterElement instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ProximalPromoterElement")
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
