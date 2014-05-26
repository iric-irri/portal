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
 * Home object for domain model class PolypeptideCopperIonContactSite.
 * @see org.irri.iric.chado.so.PolypeptideCopperIonContactSite
 * @author Hibernate Tools
 */
public class PolypeptideCopperIonContactSiteHome {

	private static final Log log = LogFactory
			.getLog(PolypeptideCopperIonContactSiteHome.class);

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

	public void persist(PolypeptideCopperIonContactSite transientInstance) {
		log.debug("persisting PolypeptideCopperIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PolypeptideCopperIonContactSite instance) {
		log.debug("attaching dirty PolypeptideCopperIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PolypeptideCopperIonContactSite instance) {
		log.debug("attaching clean PolypeptideCopperIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PolypeptideCopperIonContactSite persistentInstance) {
		log.debug("deleting PolypeptideCopperIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PolypeptideCopperIonContactSite merge(
			PolypeptideCopperIonContactSite detachedInstance) {
		log.debug("merging PolypeptideCopperIonContactSite instance");
		try {
			PolypeptideCopperIonContactSite result = (PolypeptideCopperIonContactSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PolypeptideCopperIonContactSite findById(
			org.irri.iric.chado.so.PolypeptideCopperIonContactSiteId id) {
		log.debug("getting PolypeptideCopperIonContactSite instance with id: "
				+ id);
		try {
			PolypeptideCopperIonContactSite instance = (PolypeptideCopperIonContactSite) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.PolypeptideCopperIonContactSite",
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

	public List findByExample(PolypeptideCopperIonContactSite instance) {
		log.debug("finding PolypeptideCopperIonContactSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PolypeptideCopperIonContactSite")
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
