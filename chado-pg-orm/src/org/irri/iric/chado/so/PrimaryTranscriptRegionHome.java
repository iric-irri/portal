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
 * Home object for domain model class PrimaryTranscriptRegion.
 * @see org.irri.iric.chado.so.PrimaryTranscriptRegion
 * @author Hibernate Tools
 */
public class PrimaryTranscriptRegionHome {

	private static final Log log = LogFactory
			.getLog(PrimaryTranscriptRegionHome.class);

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

	public void persist(PrimaryTranscriptRegion transientInstance) {
		log.debug("persisting PrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PrimaryTranscriptRegion instance) {
		log.debug("attaching dirty PrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PrimaryTranscriptRegion instance) {
		log.debug("attaching clean PrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PrimaryTranscriptRegion persistentInstance) {
		log.debug("deleting PrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PrimaryTranscriptRegion merge(
			PrimaryTranscriptRegion detachedInstance) {
		log.debug("merging PrimaryTranscriptRegion instance");
		try {
			PrimaryTranscriptRegion result = (PrimaryTranscriptRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PrimaryTranscriptRegion findById(
			org.irri.iric.chado.so.PrimaryTranscriptRegionId id) {
		log.debug("getting PrimaryTranscriptRegion instance with id: " + id);
		try {
			PrimaryTranscriptRegion instance = (PrimaryTranscriptRegion) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PrimaryTranscriptRegion",
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

	public List findByExample(PrimaryTranscriptRegion instance) {
		log.debug("finding PrimaryTranscriptRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PrimaryTranscriptRegion")
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
