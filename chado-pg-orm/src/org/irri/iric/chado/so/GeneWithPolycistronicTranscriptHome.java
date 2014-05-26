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
 * Home object for domain model class GeneWithPolycistronicTranscript.
 * @see org.irri.iric.chado.so.GeneWithPolycistronicTranscript
 * @author Hibernate Tools
 */
public class GeneWithPolycistronicTranscriptHome {

	private static final Log log = LogFactory
			.getLog(GeneWithPolycistronicTranscriptHome.class);

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

	public void persist(GeneWithPolycistronicTranscript transientInstance) {
		log.debug("persisting GeneWithPolycistronicTranscript instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GeneWithPolycistronicTranscript instance) {
		log.debug("attaching dirty GeneWithPolycistronicTranscript instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GeneWithPolycistronicTranscript instance) {
		log.debug("attaching clean GeneWithPolycistronicTranscript instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GeneWithPolycistronicTranscript persistentInstance) {
		log.debug("deleting GeneWithPolycistronicTranscript instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GeneWithPolycistronicTranscript merge(
			GeneWithPolycistronicTranscript detachedInstance) {
		log.debug("merging GeneWithPolycistronicTranscript instance");
		try {
			GeneWithPolycistronicTranscript result = (GeneWithPolycistronicTranscript) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GeneWithPolycistronicTranscript findById(
			org.irri.iric.chado.so.GeneWithPolycistronicTranscriptId id) {
		log.debug("getting GeneWithPolycistronicTranscript instance with id: "
				+ id);
		try {
			GeneWithPolycistronicTranscript instance = (GeneWithPolycistronicTranscript) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.GeneWithPolycistronicTranscript",
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

	public List findByExample(GeneWithPolycistronicTranscript instance) {
		log.debug("finding GeneWithPolycistronicTranscript instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.GeneWithPolycistronicTranscript")
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
