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
 * Home object for domain model class SerineThreonineMotif.
 * @see org.irri.iric.chado.so.SerineThreonineMotif
 * @author Hibernate Tools
 */
public class SerineThreonineMotifHome {

	private static final Log log = LogFactory
			.getLog(SerineThreonineMotifHome.class);

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

	public void persist(SerineThreonineMotif transientInstance) {
		log.debug("persisting SerineThreonineMotif instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SerineThreonineMotif instance) {
		log.debug("attaching dirty SerineThreonineMotif instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SerineThreonineMotif instance) {
		log.debug("attaching clean SerineThreonineMotif instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SerineThreonineMotif persistentInstance) {
		log.debug("deleting SerineThreonineMotif instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SerineThreonineMotif merge(SerineThreonineMotif detachedInstance) {
		log.debug("merging SerineThreonineMotif instance");
		try {
			SerineThreonineMotif result = (SerineThreonineMotif) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SerineThreonineMotif findById(
			org.irri.iric.chado.so.SerineThreonineMotifId id) {
		log.debug("getting SerineThreonineMotif instance with id: " + id);
		try {
			SerineThreonineMotif instance = (SerineThreonineMotif) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.SerineThreonineMotif", id);
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

	public List findByExample(SerineThreonineMotif instance) {
		log.debug("finding SerineThreonineMotif instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.SerineThreonineMotif")
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
