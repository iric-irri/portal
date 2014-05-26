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
 * Home object for domain model class InsertionalDuplication.
 * @see org.irri.iric.chado.so.InsertionalDuplication
 * @author Hibernate Tools
 */
public class InsertionalDuplicationHome {

	private static final Log log = LogFactory
			.getLog(InsertionalDuplicationHome.class);

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

	public void persist(InsertionalDuplication transientInstance) {
		log.debug("persisting InsertionalDuplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(InsertionalDuplication instance) {
		log.debug("attaching dirty InsertionalDuplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(InsertionalDuplication instance) {
		log.debug("attaching clean InsertionalDuplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(InsertionalDuplication persistentInstance) {
		log.debug("deleting InsertionalDuplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public InsertionalDuplication merge(InsertionalDuplication detachedInstance) {
		log.debug("merging InsertionalDuplication instance");
		try {
			InsertionalDuplication result = (InsertionalDuplication) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InsertionalDuplication findById(
			org.irri.iric.chado.so.InsertionalDuplicationId id) {
		log.debug("getting InsertionalDuplication instance with id: " + id);
		try {
			InsertionalDuplication instance = (InsertionalDuplication) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.InsertionalDuplication", id);
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

	public List findByExample(InsertionalDuplication instance) {
		log.debug("finding InsertionalDuplication instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.InsertionalDuplication")
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
