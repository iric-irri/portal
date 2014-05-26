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
 * Home object for domain model class PrimaryTranscript.
 * @see org.irri.iric.chado.so.PrimaryTranscript
 * @author Hibernate Tools
 */
public class PrimaryTranscriptHome {

	private static final Log log = LogFactory
			.getLog(PrimaryTranscriptHome.class);

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

	public void persist(PrimaryTranscript transientInstance) {
		log.debug("persisting PrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PrimaryTranscript instance) {
		log.debug("attaching dirty PrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PrimaryTranscript instance) {
		log.debug("attaching clean PrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PrimaryTranscript persistentInstance) {
		log.debug("deleting PrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PrimaryTranscript merge(PrimaryTranscript detachedInstance) {
		log.debug("merging PrimaryTranscript instance");
		try {
			PrimaryTranscript result = (PrimaryTranscript) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PrimaryTranscript findById(
			org.irri.iric.chado.so.PrimaryTranscriptId id) {
		log.debug("getting PrimaryTranscript instance with id: " + id);
		try {
			PrimaryTranscript instance = (PrimaryTranscript) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PrimaryTranscript", id);
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

	public List findByExample(PrimaryTranscript instance) {
		log.debug("finding PrimaryTranscript instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.PrimaryTranscript")
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
