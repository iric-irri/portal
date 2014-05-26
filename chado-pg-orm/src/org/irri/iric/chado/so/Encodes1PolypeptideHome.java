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
 * Home object for domain model class Encodes1Polypeptide.
 * @see org.irri.iric.chado.so.Encodes1Polypeptide
 * @author Hibernate Tools
 */
public class Encodes1PolypeptideHome {

	private static final Log log = LogFactory
			.getLog(Encodes1PolypeptideHome.class);

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

	public void persist(Encodes1Polypeptide transientInstance) {
		log.debug("persisting Encodes1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Encodes1Polypeptide instance) {
		log.debug("attaching dirty Encodes1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Encodes1Polypeptide instance) {
		log.debug("attaching clean Encodes1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Encodes1Polypeptide persistentInstance) {
		log.debug("deleting Encodes1Polypeptide instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Encodes1Polypeptide merge(Encodes1Polypeptide detachedInstance) {
		log.debug("merging Encodes1Polypeptide instance");
		try {
			Encodes1Polypeptide result = (Encodes1Polypeptide) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Encodes1Polypeptide findById(
			org.irri.iric.chado.so.Encodes1PolypeptideId id) {
		log.debug("getting Encodes1Polypeptide instance with id: " + id);
		try {
			Encodes1Polypeptide instance = (Encodes1Polypeptide) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Encodes1Polypeptide", id);
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

	public List findByExample(Encodes1Polypeptide instance) {
		log.debug("finding Encodes1Polypeptide instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Encodes1Polypeptide")
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
