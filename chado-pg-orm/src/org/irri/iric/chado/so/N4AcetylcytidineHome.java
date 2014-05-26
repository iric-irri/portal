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
 * Home object for domain model class N4Acetylcytidine.
 * @see org.irri.iric.chado.so.N4Acetylcytidine
 * @author Hibernate Tools
 */
public class N4AcetylcytidineHome {

	private static final Log log = LogFactory
			.getLog(N4AcetylcytidineHome.class);

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

	public void persist(N4Acetylcytidine transientInstance) {
		log.debug("persisting N4Acetylcytidine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N4Acetylcytidine instance) {
		log.debug("attaching dirty N4Acetylcytidine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N4Acetylcytidine instance) {
		log.debug("attaching clean N4Acetylcytidine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N4Acetylcytidine persistentInstance) {
		log.debug("deleting N4Acetylcytidine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N4Acetylcytidine merge(N4Acetylcytidine detachedInstance) {
		log.debug("merging N4Acetylcytidine instance");
		try {
			N4Acetylcytidine result = (N4Acetylcytidine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N4Acetylcytidine findById(
			org.irri.iric.chado.so.N4AcetylcytidineId id) {
		log.debug("getting N4Acetylcytidine instance with id: " + id);
		try {
			N4Acetylcytidine instance = (N4Acetylcytidine) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.N4Acetylcytidine", id);
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

	public List findByExample(N4Acetylcytidine instance) {
		log.debug("finding N4Acetylcytidine instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.N4Acetylcytidine")
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
