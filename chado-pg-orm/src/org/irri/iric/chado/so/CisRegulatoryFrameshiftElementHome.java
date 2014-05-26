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
 * Home object for domain model class CisRegulatoryFrameshiftElement.
 * @see org.irri.iric.chado.so.CisRegulatoryFrameshiftElement
 * @author Hibernate Tools
 */
public class CisRegulatoryFrameshiftElementHome {

	private static final Log log = LogFactory
			.getLog(CisRegulatoryFrameshiftElementHome.class);

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

	public void persist(CisRegulatoryFrameshiftElement transientInstance) {
		log.debug("persisting CisRegulatoryFrameshiftElement instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CisRegulatoryFrameshiftElement instance) {
		log.debug("attaching dirty CisRegulatoryFrameshiftElement instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CisRegulatoryFrameshiftElement instance) {
		log.debug("attaching clean CisRegulatoryFrameshiftElement instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CisRegulatoryFrameshiftElement persistentInstance) {
		log.debug("deleting CisRegulatoryFrameshiftElement instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CisRegulatoryFrameshiftElement merge(
			CisRegulatoryFrameshiftElement detachedInstance) {
		log.debug("merging CisRegulatoryFrameshiftElement instance");
		try {
			CisRegulatoryFrameshiftElement result = (CisRegulatoryFrameshiftElement) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CisRegulatoryFrameshiftElement findById(
			org.irri.iric.chado.so.CisRegulatoryFrameshiftElementId id) {
		log.debug("getting CisRegulatoryFrameshiftElement instance with id: "
				+ id);
		try {
			CisRegulatoryFrameshiftElement instance = (CisRegulatoryFrameshiftElement) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.CisRegulatoryFrameshiftElement",
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

	public List findByExample(CisRegulatoryFrameshiftElement instance) {
		log.debug("finding CisRegulatoryFrameshiftElement instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.CisRegulatoryFrameshiftElement")
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
