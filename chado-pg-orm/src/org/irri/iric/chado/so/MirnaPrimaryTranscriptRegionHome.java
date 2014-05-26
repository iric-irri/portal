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
 * Home object for domain model class MirnaPrimaryTranscriptRegion.
 * @see org.irri.iric.chado.so.MirnaPrimaryTranscriptRegion
 * @author Hibernate Tools
 */
public class MirnaPrimaryTranscriptRegionHome {

	private static final Log log = LogFactory
			.getLog(MirnaPrimaryTranscriptRegionHome.class);

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

	public void persist(MirnaPrimaryTranscriptRegion transientInstance) {
		log.debug("persisting MirnaPrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MirnaPrimaryTranscriptRegion instance) {
		log.debug("attaching dirty MirnaPrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MirnaPrimaryTranscriptRegion instance) {
		log.debug("attaching clean MirnaPrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MirnaPrimaryTranscriptRegion persistentInstance) {
		log.debug("deleting MirnaPrimaryTranscriptRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MirnaPrimaryTranscriptRegion merge(
			MirnaPrimaryTranscriptRegion detachedInstance) {
		log.debug("merging MirnaPrimaryTranscriptRegion instance");
		try {
			MirnaPrimaryTranscriptRegion result = (MirnaPrimaryTranscriptRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MirnaPrimaryTranscriptRegion findById(
			org.irri.iric.chado.so.MirnaPrimaryTranscriptRegionId id) {
		log.debug("getting MirnaPrimaryTranscriptRegion instance with id: "
				+ id);
		try {
			MirnaPrimaryTranscriptRegion instance = (MirnaPrimaryTranscriptRegion) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.MirnaPrimaryTranscriptRegion",
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

	public List findByExample(MirnaPrimaryTranscriptRegion instance) {
		log.debug("finding MirnaPrimaryTranscriptRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.MirnaPrimaryTranscriptRegion")
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
