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
 * Home object for domain model class NdReagentprop.
 * @see org.irri.iric.chado.NdReagentprop
 * @author Hibernate Tools
 */
public class NdReagentpropHome {

	private static final Log log = LogFactory.getLog(NdReagentpropHome.class);

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

	public void persist(NdReagentprop transientInstance) {
		log.debug("persisting NdReagentprop instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(NdReagentprop instance) {
		log.debug("attaching dirty NdReagentprop instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NdReagentprop instance) {
		log.debug("attaching clean NdReagentprop instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(NdReagentprop persistentInstance) {
		log.debug("deleting NdReagentprop instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NdReagentprop merge(NdReagentprop detachedInstance) {
		log.debug("merging NdReagentprop instance");
		try {
			NdReagentprop result = (NdReagentprop) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NdReagentprop findById(int id) {
		log.debug("getting NdReagentprop instance with id: " + id);
		try {
			NdReagentprop instance = (NdReagentprop) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.NdReagentprop", id);
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

	public List findByExample(NdReagentprop instance) {
		log.debug("finding NdReagentprop instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.NdReagentprop")
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
