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
 * Home object for domain model class EncodesAlternateTranscriptionStartSites.
 * @see org.irri.iric.chado.so.EncodesAlternateTranscriptionStartSites
 * @author Hibernate Tools
 */
public class EncodesAlternateTranscriptionStartSitesHome {

	private static final Log log = LogFactory
			.getLog(EncodesAlternateTranscriptionStartSitesHome.class);

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
			EncodesAlternateTranscriptionStartSites transientInstance) {
		log.debug("persisting EncodesAlternateTranscriptionStartSites instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(EncodesAlternateTranscriptionStartSites instance) {
		log.debug("attaching dirty EncodesAlternateTranscriptionStartSites instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EncodesAlternateTranscriptionStartSites instance) {
		log.debug("attaching clean EncodesAlternateTranscriptionStartSites instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			EncodesAlternateTranscriptionStartSites persistentInstance) {
		log.debug("deleting EncodesAlternateTranscriptionStartSites instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EncodesAlternateTranscriptionStartSites merge(
			EncodesAlternateTranscriptionStartSites detachedInstance) {
		log.debug("merging EncodesAlternateTranscriptionStartSites instance");
		try {
			EncodesAlternateTranscriptionStartSites result = (EncodesAlternateTranscriptionStartSites) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EncodesAlternateTranscriptionStartSites findById(
			org.irri.iric.chado.so.EncodesAlternateTranscriptionStartSitesId id) {
		log.debug("getting EncodesAlternateTranscriptionStartSites instance with id: "
				+ id);
		try {
			EncodesAlternateTranscriptionStartSites instance = (EncodesAlternateTranscriptionStartSites) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.EncodesAlternateTranscriptionStartSites",
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

	public List findByExample(EncodesAlternateTranscriptionStartSites instance) {
		log.debug("finding EncodesAlternateTranscriptionStartSites instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.EncodesAlternateTranscriptionStartSites")
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
