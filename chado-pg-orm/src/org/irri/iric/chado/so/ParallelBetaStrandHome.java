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
 * Home object for domain model class ParallelBetaStrand.
 * @see org.irri.iric.chado.so.ParallelBetaStrand
 * @author Hibernate Tools
 */
public class ParallelBetaStrandHome {

	private static final Log log = LogFactory
			.getLog(ParallelBetaStrandHome.class);

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

	public void persist(ParallelBetaStrand transientInstance) {
		log.debug("persisting ParallelBetaStrand instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ParallelBetaStrand instance) {
		log.debug("attaching dirty ParallelBetaStrand instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ParallelBetaStrand instance) {
		log.debug("attaching clean ParallelBetaStrand instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ParallelBetaStrand persistentInstance) {
		log.debug("deleting ParallelBetaStrand instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ParallelBetaStrand merge(ParallelBetaStrand detachedInstance) {
		log.debug("merging ParallelBetaStrand instance");
		try {
			ParallelBetaStrand result = (ParallelBetaStrand) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ParallelBetaStrand findById(
			org.irri.iric.chado.so.ParallelBetaStrandId id) {
		log.debug("getting ParallelBetaStrand instance with id: " + id);
		try {
			ParallelBetaStrand instance = (ParallelBetaStrand) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ParallelBetaStrand", id);
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

	public List findByExample(ParallelBetaStrand instance) {
		log.debug("finding ParallelBetaStrand instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.ParallelBetaStrand")
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
