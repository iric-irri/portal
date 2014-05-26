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
 * Home object for domain model class ElongatedPolypeptide.
 * @see org.irri.iric.chado.so.ElongatedPolypeptide
 * @author Hibernate Tools
 */
public class ElongatedPolypeptideHome {

	private static final Log log = LogFactory
			.getLog(ElongatedPolypeptideHome.class);

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

	public void persist(ElongatedPolypeptide transientInstance) {
		log.debug("persisting ElongatedPolypeptide instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ElongatedPolypeptide instance) {
		log.debug("attaching dirty ElongatedPolypeptide instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ElongatedPolypeptide instance) {
		log.debug("attaching clean ElongatedPolypeptide instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ElongatedPolypeptide persistentInstance) {
		log.debug("deleting ElongatedPolypeptide instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ElongatedPolypeptide merge(ElongatedPolypeptide detachedInstance) {
		log.debug("merging ElongatedPolypeptide instance");
		try {
			ElongatedPolypeptide result = (ElongatedPolypeptide) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ElongatedPolypeptide findById(
			org.irri.iric.chado.so.ElongatedPolypeptideId id) {
		log.debug("getting ElongatedPolypeptide instance with id: " + id);
		try {
			ElongatedPolypeptide instance = (ElongatedPolypeptide) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ElongatedPolypeptide", id);
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

	public List findByExample(ElongatedPolypeptide instance) {
		log.debug("finding ElongatedPolypeptide instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ElongatedPolypeptide")
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
