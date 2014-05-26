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
 * Home object for domain model class NdExperimentProtocol.
 * @see org.irri.iric.chado.NdExperimentProtocol
 * @author Hibernate Tools
 */
public class NdExperimentProtocolHome {

	private static final Log log = LogFactory
			.getLog(NdExperimentProtocolHome.class);

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

	public void persist(NdExperimentProtocol transientInstance) {
		log.debug("persisting NdExperimentProtocol instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(NdExperimentProtocol instance) {
		log.debug("attaching dirty NdExperimentProtocol instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NdExperimentProtocol instance) {
		log.debug("attaching clean NdExperimentProtocol instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(NdExperimentProtocol persistentInstance) {
		log.debug("deleting NdExperimentProtocol instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NdExperimentProtocol merge(NdExperimentProtocol detachedInstance) {
		log.debug("merging NdExperimentProtocol instance");
		try {
			NdExperimentProtocol result = (NdExperimentProtocol) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NdExperimentProtocol findById(int id) {
		log.debug("getting NdExperimentProtocol instance with id: " + id);
		try {
			NdExperimentProtocol instance = (NdExperimentProtocol) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.NdExperimentProtocol", id);
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

	public List findByExample(NdExperimentProtocol instance) {
		log.debug("finding NdExperimentProtocol instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.NdExperimentProtocol")
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
