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
 * Home object for domain model class ExpressionCvtermprop.
 * @see org.irri.iric.chado.ExpressionCvtermprop
 * @author Hibernate Tools
 */
public class ExpressionCvtermpropHome {

	private static final Log log = LogFactory
			.getLog(ExpressionCvtermpropHome.class);

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

	public void persist(ExpressionCvtermprop transientInstance) {
		log.debug("persisting ExpressionCvtermprop instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ExpressionCvtermprop instance) {
		log.debug("attaching dirty ExpressionCvtermprop instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExpressionCvtermprop instance) {
		log.debug("attaching clean ExpressionCvtermprop instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ExpressionCvtermprop persistentInstance) {
		log.debug("deleting ExpressionCvtermprop instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExpressionCvtermprop merge(ExpressionCvtermprop detachedInstance) {
		log.debug("merging ExpressionCvtermprop instance");
		try {
			ExpressionCvtermprop result = (ExpressionCvtermprop) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExpressionCvtermprop findById(int id) {
		log.debug("getting ExpressionCvtermprop instance with id: " + id);
		try {
			ExpressionCvtermprop instance = (ExpressionCvtermprop) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.ExpressionCvtermprop", id);
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

	public List findByExample(ExpressionCvtermprop instance) {
		log.debug("finding ExpressionCvtermprop instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.ExpressionCvtermprop")
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
