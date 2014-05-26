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
 * Home object for domain model class GeneWithTransSplicedTranscript.
 * @see org.irri.iric.chado.so.GeneWithTransSplicedTranscript
 * @author Hibernate Tools
 */
public class GeneWithTransSplicedTranscriptHome {

	private static final Log log = LogFactory
			.getLog(GeneWithTransSplicedTranscriptHome.class);

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

	public void persist(GeneWithTransSplicedTranscript transientInstance) {
		log.debug("persisting GeneWithTransSplicedTranscript instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GeneWithTransSplicedTranscript instance) {
		log.debug("attaching dirty GeneWithTransSplicedTranscript instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GeneWithTransSplicedTranscript instance) {
		log.debug("attaching clean GeneWithTransSplicedTranscript instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GeneWithTransSplicedTranscript persistentInstance) {
		log.debug("deleting GeneWithTransSplicedTranscript instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GeneWithTransSplicedTranscript merge(
			GeneWithTransSplicedTranscript detachedInstance) {
		log.debug("merging GeneWithTransSplicedTranscript instance");
		try {
			GeneWithTransSplicedTranscript result = (GeneWithTransSplicedTranscript) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GeneWithTransSplicedTranscript findById(
			org.irri.iric.chado.so.GeneWithTransSplicedTranscriptId id) {
		log.debug("getting GeneWithTransSplicedTranscript instance with id: "
				+ id);
		try {
			GeneWithTransSplicedTranscript instance = (GeneWithTransSplicedTranscript) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.GeneWithTransSplicedTranscript",
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

	public List findByExample(GeneWithTransSplicedTranscript instance) {
		log.debug("finding GeneWithTransSplicedTranscript instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.GeneWithTransSplicedTranscript")
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
