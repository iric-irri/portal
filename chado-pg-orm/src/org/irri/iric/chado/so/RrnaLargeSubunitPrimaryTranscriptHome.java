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
 * Home object for domain model class RrnaLargeSubunitPrimaryTranscript.
 * @see org.irri.iric.chado.so.RrnaLargeSubunitPrimaryTranscript
 * @author Hibernate Tools
 */
public class RrnaLargeSubunitPrimaryTranscriptHome {

	private static final Log log = LogFactory
			.getLog(RrnaLargeSubunitPrimaryTranscriptHome.class);

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

	public void persist(RrnaLargeSubunitPrimaryTranscript transientInstance) {
		log.debug("persisting RrnaLargeSubunitPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RrnaLargeSubunitPrimaryTranscript instance) {
		log.debug("attaching dirty RrnaLargeSubunitPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RrnaLargeSubunitPrimaryTranscript instance) {
		log.debug("attaching clean RrnaLargeSubunitPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RrnaLargeSubunitPrimaryTranscript persistentInstance) {
		log.debug("deleting RrnaLargeSubunitPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RrnaLargeSubunitPrimaryTranscript merge(
			RrnaLargeSubunitPrimaryTranscript detachedInstance) {
		log.debug("merging RrnaLargeSubunitPrimaryTranscript instance");
		try {
			RrnaLargeSubunitPrimaryTranscript result = (RrnaLargeSubunitPrimaryTranscript) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RrnaLargeSubunitPrimaryTranscript findById(
			org.irri.iric.chado.so.RrnaLargeSubunitPrimaryTranscriptId id) {
		log.debug("getting RrnaLargeSubunitPrimaryTranscript instance with id: "
				+ id);
		try {
			RrnaLargeSubunitPrimaryTranscript instance = (RrnaLargeSubunitPrimaryTranscript) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.RrnaLargeSubunitPrimaryTranscript",
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

	public List findByExample(RrnaLargeSubunitPrimaryTranscript instance) {
		log.debug("finding RrnaLargeSubunitPrimaryTranscript instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.RrnaLargeSubunitPrimaryTranscript")
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
