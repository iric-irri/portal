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
 * Home object for domain model class FiveMcm2Thiouridine.
 * @see org.irri.iric.chado.so.FiveMcm2Thiouridine
 * @author Hibernate Tools
 */
public class FiveMcm2ThiouridineHome {

	private static final Log log = LogFactory
			.getLog(FiveMcm2ThiouridineHome.class);

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

	public void persist(FiveMcm2Thiouridine transientInstance) {
		log.debug("persisting FiveMcm2Thiouridine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(FiveMcm2Thiouridine instance) {
		log.debug("attaching dirty FiveMcm2Thiouridine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FiveMcm2Thiouridine instance) {
		log.debug("attaching clean FiveMcm2Thiouridine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(FiveMcm2Thiouridine persistentInstance) {
		log.debug("deleting FiveMcm2Thiouridine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FiveMcm2Thiouridine merge(FiveMcm2Thiouridine detachedInstance) {
		log.debug("merging FiveMcm2Thiouridine instance");
		try {
			FiveMcm2Thiouridine result = (FiveMcm2Thiouridine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FiveMcm2Thiouridine findById(
			org.irri.iric.chado.so.FiveMcm2ThiouridineId id) {
		log.debug("getting FiveMcm2Thiouridine instance with id: " + id);
		try {
			FiveMcm2Thiouridine instance = (FiveMcm2Thiouridine) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.FiveMcm2Thiouridine", id);
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

	public List findByExample(FiveMcm2Thiouridine instance) {
		log.debug("finding FiveMcm2Thiouridine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.FiveMcm2Thiouridine")
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
