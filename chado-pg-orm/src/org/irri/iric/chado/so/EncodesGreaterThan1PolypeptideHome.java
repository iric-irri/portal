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
 * Home object for domain model class EncodesGreaterThan1Polypeptide.
 * @see org.irri.iric.chado.so.EncodesGreaterThan1Polypeptide
 * @author Hibernate Tools
 */
public class EncodesGreaterThan1PolypeptideHome {

	private static final Log log = LogFactory
			.getLog(EncodesGreaterThan1PolypeptideHome.class);

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

	public void persist(EncodesGreaterThan1Polypeptide transientInstance) {
		log.debug("persisting EncodesGreaterThan1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(EncodesGreaterThan1Polypeptide instance) {
		log.debug("attaching dirty EncodesGreaterThan1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EncodesGreaterThan1Polypeptide instance) {
		log.debug("attaching clean EncodesGreaterThan1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(EncodesGreaterThan1Polypeptide persistentInstance) {
		log.debug("deleting EncodesGreaterThan1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EncodesGreaterThan1Polypeptide merge(
			EncodesGreaterThan1Polypeptide detachedInstance) {
		log.debug("merging EncodesGreaterThan1Polypeptide instance");
		try {
			EncodesGreaterThan1Polypeptide result = (EncodesGreaterThan1Polypeptide) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EncodesGreaterThan1Polypeptide findById(
			org.irri.iric.chado.so.EncodesGreaterThan1PolypeptideId id) {
		log.debug("getting EncodesGreaterThan1Polypeptide instance with id: "
				+ id);
		try {
			EncodesGreaterThan1Polypeptide instance = (EncodesGreaterThan1Polypeptide) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.EncodesGreaterThan1Polypeptide",
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

	public List findByExample(EncodesGreaterThan1Polypeptide instance) {
		log.debug("finding EncodesGreaterThan1Polypeptide instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.EncodesGreaterThan1Polypeptide")
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
