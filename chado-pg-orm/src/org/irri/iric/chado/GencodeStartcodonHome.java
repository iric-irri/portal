package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class GencodeStartcodon.
 * @see org.irri.iric.chado.GencodeStartcodon
 * @author Hibernate Tools
 */
public class GencodeStartcodonHome {

	private static final Log log = LogFactory
			.getLog(GencodeStartcodonHome.class);

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

	public void persist(GencodeStartcodon transientInstance) {
		log.debug("persisting GencodeStartcodon instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GencodeStartcodon instance) {
		log.debug("attaching dirty GencodeStartcodon instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GencodeStartcodon instance) {
		log.debug("attaching clean GencodeStartcodon instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GencodeStartcodon persistentInstance) {
		log.debug("deleting GencodeStartcodon instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GencodeStartcodon merge(GencodeStartcodon detachedInstance) {
		log.debug("merging GencodeStartcodon instance");
		try {
			GencodeStartcodon result = (GencodeStartcodon) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GencodeStartcodon findById(org.irri.iric.chado.GencodeStartcodonId id) {
		log.debug("getting GencodeStartcodon instance with id: " + id);
		try {
			GencodeStartcodon instance = (GencodeStartcodon) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.GencodeStartcodon", id);
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

	public List findByExample(GencodeStartcodon instance) {
		log.debug("finding GencodeStartcodon instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.GencodeStartcodon")
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
