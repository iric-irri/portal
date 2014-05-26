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
 * Home object for domain model class VGeneRecombinationFeature.
 * @see org.irri.iric.chado.so.VGeneRecombinationFeature
 * @author Hibernate Tools
 */
public class VGeneRecombinationFeatureHome {

	private static final Log log = LogFactory
			.getLog(VGeneRecombinationFeatureHome.class);

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

	public void persist(VGeneRecombinationFeature transientInstance) {
		log.debug("persisting VGeneRecombinationFeature instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(VGeneRecombinationFeature instance) {
		log.debug("attaching dirty VGeneRecombinationFeature instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VGeneRecombinationFeature instance) {
		log.debug("attaching clean VGeneRecombinationFeature instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(VGeneRecombinationFeature persistentInstance) {
		log.debug("deleting VGeneRecombinationFeature instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VGeneRecombinationFeature merge(
			VGeneRecombinationFeature detachedInstance) {
		log.debug("merging VGeneRecombinationFeature instance");
		try {
			VGeneRecombinationFeature result = (VGeneRecombinationFeature) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public VGeneRecombinationFeature findById(
			org.irri.iric.chado.so.VGeneRecombinationFeatureId id) {
		log.debug("getting VGeneRecombinationFeature instance with id: " + id);
		try {
			VGeneRecombinationFeature instance = (VGeneRecombinationFeature) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.VGeneRecombinationFeature",
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

	public List findByExample(VGeneRecombinationFeature instance) {
		log.debug("finding VGeneRecombinationFeature instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.VGeneRecombinationFeature")
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
