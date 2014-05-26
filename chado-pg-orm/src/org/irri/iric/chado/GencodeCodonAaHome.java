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
 * Home object for domain model class GencodeCodonAa.
 * @see org.irri.iric.chado.GencodeCodonAa
 * @author Hibernate Tools
 */
public class GencodeCodonAaHome {

	private static final Log log = LogFactory.getLog(GencodeCodonAaHome.class);

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

	public void persist(GencodeCodonAa transientInstance) {
		log.debug("persisting GencodeCodonAa instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GencodeCodonAa instance) {
		log.debug("attaching dirty GencodeCodonAa instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GencodeCodonAa instance) {
		log.debug("attaching clean GencodeCodonAa instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GencodeCodonAa persistentInstance) {
		log.debug("deleting GencodeCodonAa instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GencodeCodonAa merge(GencodeCodonAa detachedInstance) {
		log.debug("merging GencodeCodonAa instance");
		try {
			GencodeCodonAa result = (GencodeCodonAa) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GencodeCodonAa findById(org.irri.iric.chado.GencodeCodonAaId id) {
		log.debug("getting GencodeCodonAa instance with id: " + id);
		try {
			GencodeCodonAa instance = (GencodeCodonAa) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.GencodeCodonAa", id);
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

	public List findByExample(GencodeCodonAa instance) {
		log.debug("finding GencodeCodonAa instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.GencodeCodonAa")
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
