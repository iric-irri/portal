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
 * Home object for domain model class NoncodingRegionOfExon.
 * @see org.irri.iric.chado.so.NoncodingRegionOfExon
 * @author Hibernate Tools
 */
public class NoncodingRegionOfExonHome {

	private static final Log log = LogFactory
			.getLog(NoncodingRegionOfExonHome.class);

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

	public void persist(NoncodingRegionOfExon transientInstance) {
		log.debug("persisting NoncodingRegionOfExon instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(NoncodingRegionOfExon instance) {
		log.debug("attaching dirty NoncodingRegionOfExon instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NoncodingRegionOfExon instance) {
		log.debug("attaching clean NoncodingRegionOfExon instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(NoncodingRegionOfExon persistentInstance) {
		log.debug("deleting NoncodingRegionOfExon instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NoncodingRegionOfExon merge(NoncodingRegionOfExon detachedInstance) {
		log.debug("merging NoncodingRegionOfExon instance");
		try {
			NoncodingRegionOfExon result = (NoncodingRegionOfExon) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NoncodingRegionOfExon findById(
			org.irri.iric.chado.so.NoncodingRegionOfExonId id) {
		log.debug("getting NoncodingRegionOfExon instance with id: " + id);
		try {
			NoncodingRegionOfExon instance = (NoncodingRegionOfExon) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.NoncodingRegionOfExon", id);
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

	public List findByExample(NoncodingRegionOfExon instance) {
		log.debug("finding NoncodingRegionOfExon instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.NoncodingRegionOfExon")
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
