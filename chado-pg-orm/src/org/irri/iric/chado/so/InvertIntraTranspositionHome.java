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
 * Home object for domain model class InvertIntraTransposition.
 * @see org.irri.iric.chado.so.InvertIntraTransposition
 * @author Hibernate Tools
 */
public class InvertIntraTranspositionHome {

	private static final Log log = LogFactory
			.getLog(InvertIntraTranspositionHome.class);

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

	public void persist(InvertIntraTransposition transientInstance) {
		log.debug("persisting InvertIntraTransposition instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(InvertIntraTransposition instance) {
		log.debug("attaching dirty InvertIntraTransposition instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(InvertIntraTransposition instance) {
		log.debug("attaching clean InvertIntraTransposition instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(InvertIntraTransposition persistentInstance) {
		log.debug("deleting InvertIntraTransposition instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public InvertIntraTransposition merge(
			InvertIntraTransposition detachedInstance) {
		log.debug("merging InvertIntraTransposition instance");
		try {
			InvertIntraTransposition result = (InvertIntraTransposition) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InvertIntraTransposition findById(
			org.irri.iric.chado.so.InvertIntraTranspositionId id) {
		log.debug("getting InvertIntraTransposition instance with id: " + id);
		try {
			InvertIntraTransposition instance = (InvertIntraTransposition) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.InvertIntraTransposition",
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

	public List findByExample(InvertIntraTransposition instance) {
		log.debug("finding InvertIntraTransposition instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.InvertIntraTransposition")
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
