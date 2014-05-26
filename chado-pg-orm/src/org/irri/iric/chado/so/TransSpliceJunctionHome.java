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
 * Home object for domain model class TransSpliceJunction.
 * @see org.irri.iric.chado.so.TransSpliceJunction
 * @author Hibernate Tools
 */
public class TransSpliceJunctionHome {

	private static final Log log = LogFactory
			.getLog(TransSpliceJunctionHome.class);

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

	public void persist(TransSpliceJunction transientInstance) {
		log.debug("persisting TransSpliceJunction instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TransSpliceJunction instance) {
		log.debug("attaching dirty TransSpliceJunction instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TransSpliceJunction instance) {
		log.debug("attaching clean TransSpliceJunction instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TransSpliceJunction persistentInstance) {
		log.debug("deleting TransSpliceJunction instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TransSpliceJunction merge(TransSpliceJunction detachedInstance) {
		log.debug("merging TransSpliceJunction instance");
		try {
			TransSpliceJunction result = (TransSpliceJunction) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransSpliceJunction findById(
			org.irri.iric.chado.so.TransSpliceJunctionId id) {
		log.debug("getting TransSpliceJunction instance with id: " + id);
		try {
			TransSpliceJunction instance = (TransSpliceJunction) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.TransSpliceJunction", id);
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

	public List findByExample(TransSpliceJunction instance) {
		log.debug("finding TransSpliceJunction instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.TransSpliceJunction")
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
