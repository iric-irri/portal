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
 * Home object for domain model class CentromereDnaElementIii.
 * @see org.irri.iric.chado.so.CentromereDnaElementIii
 * @author Hibernate Tools
 */
public class CentromereDnaElementIiiHome {

	private static final Log log = LogFactory
			.getLog(CentromereDnaElementIiiHome.class);

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

	public void persist(CentromereDnaElementIii transientInstance) {
		log.debug("persisting CentromereDnaElementIii instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CentromereDnaElementIii instance) {
		log.debug("attaching dirty CentromereDnaElementIii instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CentromereDnaElementIii instance) {
		log.debug("attaching clean CentromereDnaElementIii instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CentromereDnaElementIii persistentInstance) {
		log.debug("deleting CentromereDnaElementIii instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CentromereDnaElementIii merge(
			CentromereDnaElementIii detachedInstance) {
		log.debug("merging CentromereDnaElementIii instance");
		try {
			CentromereDnaElementIii result = (CentromereDnaElementIii) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CentromereDnaElementIii findById(
			org.irri.iric.chado.so.CentromereDnaElementIiiId id) {
		log.debug("getting CentromereDnaElementIii instance with id: " + id);
		try {
			CentromereDnaElementIii instance = (CentromereDnaElementIii) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.CentromereDnaElementIii",
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

	public List findByExample(CentromereDnaElementIii instance) {
		log.debug("finding CentromereDnaElementIii instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.CentromereDnaElementIii")
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
