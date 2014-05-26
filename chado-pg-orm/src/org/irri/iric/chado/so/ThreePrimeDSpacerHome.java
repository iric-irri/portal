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
 * Home object for domain model class ThreePrimeDSpacer.
 * @see org.irri.iric.chado.so.ThreePrimeDSpacer
 * @author Hibernate Tools
 */
public class ThreePrimeDSpacerHome {

	private static final Log log = LogFactory
			.getLog(ThreePrimeDSpacerHome.class);

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

	public void persist(ThreePrimeDSpacer transientInstance) {
		log.debug("persisting ThreePrimeDSpacer instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ThreePrimeDSpacer instance) {
		log.debug("attaching dirty ThreePrimeDSpacer instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ThreePrimeDSpacer instance) {
		log.debug("attaching clean ThreePrimeDSpacer instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ThreePrimeDSpacer persistentInstance) {
		log.debug("deleting ThreePrimeDSpacer instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ThreePrimeDSpacer merge(ThreePrimeDSpacer detachedInstance) {
		log.debug("merging ThreePrimeDSpacer instance");
		try {
			ThreePrimeDSpacer result = (ThreePrimeDSpacer) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ThreePrimeDSpacer findById(
			org.irri.iric.chado.so.ThreePrimeDSpacerId id) {
		log.debug("getting ThreePrimeDSpacer instance with id: " + id);
		try {
			ThreePrimeDSpacer instance = (ThreePrimeDSpacer) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ThreePrimeDSpacer", id);
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

	public List findByExample(ThreePrimeDSpacer instance) {
		log.debug("finding ThreePrimeDSpacer instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.ThreePrimeDSpacer")
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
