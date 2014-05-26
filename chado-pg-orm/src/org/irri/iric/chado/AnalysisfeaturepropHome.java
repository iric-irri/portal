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
 * Home object for domain model class Analysisfeatureprop.
 * @see org.irri.iric.chado.Analysisfeatureprop
 * @author Hibernate Tools
 */
public class AnalysisfeaturepropHome {

	private static final Log log = LogFactory
			.getLog(AnalysisfeaturepropHome.class);

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

	public void persist(Analysisfeatureprop transientInstance) {
		log.debug("persisting Analysisfeatureprop instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Analysisfeatureprop instance) {
		log.debug("attaching dirty Analysisfeatureprop instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Analysisfeatureprop instance) {
		log.debug("attaching clean Analysisfeatureprop instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Analysisfeatureprop persistentInstance) {
		log.debug("deleting Analysisfeatureprop instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Analysisfeatureprop merge(Analysisfeatureprop detachedInstance) {
		log.debug("merging Analysisfeatureprop instance");
		try {
			Analysisfeatureprop result = (Analysisfeatureprop) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Analysisfeatureprop findById(int id) {
		log.debug("getting Analysisfeatureprop instance with id: " + id);
		try {
			Analysisfeatureprop instance = (Analysisfeatureprop) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.Analysisfeatureprop", id);
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

	public List findByExample(Analysisfeatureprop instance) {
		log.debug("finding Analysisfeatureprop instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.Analysisfeatureprop")
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
