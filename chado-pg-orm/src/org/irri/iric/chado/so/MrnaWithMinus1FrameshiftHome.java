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
 * Home object for domain model class MrnaWithMinus1Frameshift.
 * @see org.irri.iric.chado.so.MrnaWithMinus1Frameshift
 * @author Hibernate Tools
 */
public class MrnaWithMinus1FrameshiftHome {

	private static final Log log = LogFactory
			.getLog(MrnaWithMinus1FrameshiftHome.class);

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

	public void persist(MrnaWithMinus1Frameshift transientInstance) {
		log.debug("persisting MrnaWithMinus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MrnaWithMinus1Frameshift instance) {
		log.debug("attaching dirty MrnaWithMinus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MrnaWithMinus1Frameshift instance) {
		log.debug("attaching clean MrnaWithMinus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MrnaWithMinus1Frameshift persistentInstance) {
		log.debug("deleting MrnaWithMinus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MrnaWithMinus1Frameshift merge(
			MrnaWithMinus1Frameshift detachedInstance) {
		log.debug("merging MrnaWithMinus1Frameshift instance");
		try {
			MrnaWithMinus1Frameshift result = (MrnaWithMinus1Frameshift) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MrnaWithMinus1Frameshift findById(
			org.irri.iric.chado.so.MrnaWithMinus1FrameshiftId id) {
		log.debug("getting MrnaWithMinus1Frameshift instance with id: " + id);
		try {
			MrnaWithMinus1Frameshift instance = (MrnaWithMinus1Frameshift) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.MrnaWithMinus1Frameshift",
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

	public List findByExample(MrnaWithMinus1Frameshift instance) {
		log.debug("finding MrnaWithMinus1Frameshift instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.MrnaWithMinus1Frameshift")
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
