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
 * Home object for domain model class GeneSilencedByDnaModification.
 * @see org.irri.iric.chado.so.GeneSilencedByDnaModification
 * @author Hibernate Tools
 */
public class GeneSilencedByDnaModificationHome {

	private static final Log log = LogFactory
			.getLog(GeneSilencedByDnaModificationHome.class);

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

	public void persist(GeneSilencedByDnaModification transientInstance) {
		log.debug("persisting GeneSilencedByDnaModification instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GeneSilencedByDnaModification instance) {
		log.debug("attaching dirty GeneSilencedByDnaModification instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GeneSilencedByDnaModification instance) {
		log.debug("attaching clean GeneSilencedByDnaModification instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GeneSilencedByDnaModification persistentInstance) {
		log.debug("deleting GeneSilencedByDnaModification instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GeneSilencedByDnaModification merge(
			GeneSilencedByDnaModification detachedInstance) {
		log.debug("merging GeneSilencedByDnaModification instance");
		try {
			GeneSilencedByDnaModification result = (GeneSilencedByDnaModification) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GeneSilencedByDnaModification findById(
			org.irri.iric.chado.so.GeneSilencedByDnaModificationId id) {
		log.debug("getting GeneSilencedByDnaModification instance with id: "
				+ id);
		try {
			GeneSilencedByDnaModification instance = (GeneSilencedByDnaModification) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.GeneSilencedByDnaModification",
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

	public List findByExample(GeneSilencedByDnaModification instance) {
		log.debug("finding GeneSilencedByDnaModification instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.GeneSilencedByDnaModification")
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
