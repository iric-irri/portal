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
 * Home object for domain model class PolypeptideFusion.
 * @see org.irri.iric.chado.so.PolypeptideFusion
 * @author Hibernate Tools
 */
public class PolypeptideFusionHome {

	private static final Log log = LogFactory
			.getLog(PolypeptideFusionHome.class);

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

	public void persist(PolypeptideFusion transientInstance) {
		log.debug("persisting PolypeptideFusion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PolypeptideFusion instance) {
		log.debug("attaching dirty PolypeptideFusion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PolypeptideFusion instance) {
		log.debug("attaching clean PolypeptideFusion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PolypeptideFusion persistentInstance) {
		log.debug("deleting PolypeptideFusion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PolypeptideFusion merge(PolypeptideFusion detachedInstance) {
		log.debug("merging PolypeptideFusion instance");
		try {
			PolypeptideFusion result = (PolypeptideFusion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PolypeptideFusion findById(
			org.irri.iric.chado.so.PolypeptideFusionId id) {
		log.debug("getting PolypeptideFusion instance with id: " + id);
		try {
			PolypeptideFusion instance = (PolypeptideFusion) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PolypeptideFusion", id);
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

	public List findByExample(PolypeptideFusion instance) {
		log.debug("finding PolypeptideFusion instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.PolypeptideFusion")
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
