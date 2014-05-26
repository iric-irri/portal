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
 * Home object for domain model class TyrosineTrnaPrimaryTranscript.
 * @see org.irri.iric.chado.so.TyrosineTrnaPrimaryTranscript
 * @author Hibernate Tools
 */
public class TyrosineTrnaPrimaryTranscriptHome {

	private static final Log log = LogFactory
			.getLog(TyrosineTrnaPrimaryTranscriptHome.class);

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

	public void persist(TyrosineTrnaPrimaryTranscript transientInstance) {
		log.debug("persisting TyrosineTrnaPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TyrosineTrnaPrimaryTranscript instance) {
		log.debug("attaching dirty TyrosineTrnaPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TyrosineTrnaPrimaryTranscript instance) {
		log.debug("attaching clean TyrosineTrnaPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TyrosineTrnaPrimaryTranscript persistentInstance) {
		log.debug("deleting TyrosineTrnaPrimaryTranscript instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TyrosineTrnaPrimaryTranscript merge(
			TyrosineTrnaPrimaryTranscript detachedInstance) {
		log.debug("merging TyrosineTrnaPrimaryTranscript instance");
		try {
			TyrosineTrnaPrimaryTranscript result = (TyrosineTrnaPrimaryTranscript) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TyrosineTrnaPrimaryTranscript findById(
			org.irri.iric.chado.so.TyrosineTrnaPrimaryTranscriptId id) {
		log.debug("getting TyrosineTrnaPrimaryTranscript instance with id: "
				+ id);
		try {
			TyrosineTrnaPrimaryTranscript instance = (TyrosineTrnaPrimaryTranscript) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.TyrosineTrnaPrimaryTranscript",
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

	public List findByExample(TyrosineTrnaPrimaryTranscript instance) {
		log.debug("finding TyrosineTrnaPrimaryTranscript instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.TyrosineTrnaPrimaryTranscript")
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
