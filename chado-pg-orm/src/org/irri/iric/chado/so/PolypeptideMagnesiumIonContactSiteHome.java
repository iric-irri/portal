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
 * Home object for domain model class PolypeptideMagnesiumIonContactSite.
 * @see org.irri.iric.chado.so.PolypeptideMagnesiumIonContactSite
 * @author Hibernate Tools
 */
public class PolypeptideMagnesiumIonContactSiteHome {

	private static final Log log = LogFactory
			.getLog(PolypeptideMagnesiumIonContactSiteHome.class);

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

	public void persist(PolypeptideMagnesiumIonContactSite transientInstance) {
		log.debug("persisting PolypeptideMagnesiumIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PolypeptideMagnesiumIonContactSite instance) {
		log.debug("attaching dirty PolypeptideMagnesiumIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PolypeptideMagnesiumIonContactSite instance) {
		log.debug("attaching clean PolypeptideMagnesiumIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PolypeptideMagnesiumIonContactSite persistentInstance) {
		log.debug("deleting PolypeptideMagnesiumIonContactSite instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PolypeptideMagnesiumIonContactSite merge(
			PolypeptideMagnesiumIonContactSite detachedInstance) {
		log.debug("merging PolypeptideMagnesiumIonContactSite instance");
		try {
			PolypeptideMagnesiumIonContactSite result = (PolypeptideMagnesiumIonContactSite) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PolypeptideMagnesiumIonContactSite findById(
			org.irri.iric.chado.so.PolypeptideMagnesiumIonContactSiteId id) {
		log.debug("getting PolypeptideMagnesiumIonContactSite instance with id: "
				+ id);
		try {
			PolypeptideMagnesiumIonContactSite instance = (PolypeptideMagnesiumIonContactSite) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.PolypeptideMagnesiumIonContactSite",
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

	public List findByExample(PolypeptideMagnesiumIonContactSite instance) {
		log.debug("finding PolypeptideMagnesiumIonContactSite instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PolypeptideMagnesiumIonContactSite")
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
