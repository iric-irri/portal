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
 * Home object for domain model class MrnaWithPlus2Frameshift.
 * @see org.irri.iric.chado.so.MrnaWithPlus2Frameshift
 * @author Hibernate Tools
 */
public class MrnaWithPlus2FrameshiftHome {

	private static final Log log = LogFactory
			.getLog(MrnaWithPlus2FrameshiftHome.class);

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

	public void persist(MrnaWithPlus2Frameshift transientInstance) {
		log.debug("persisting MrnaWithPlus2Frameshift instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MrnaWithPlus2Frameshift instance) {
		log.debug("attaching dirty MrnaWithPlus2Frameshift instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MrnaWithPlus2Frameshift instance) {
		log.debug("attaching clean MrnaWithPlus2Frameshift instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MrnaWithPlus2Frameshift persistentInstance) {
		log.debug("deleting MrnaWithPlus2Frameshift instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MrnaWithPlus2Frameshift merge(
			MrnaWithPlus2Frameshift detachedInstance) {
		log.debug("merging MrnaWithPlus2Frameshift instance");
		try {
			MrnaWithPlus2Frameshift result = (MrnaWithPlus2Frameshift) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MrnaWithPlus2Frameshift findById(
			org.irri.iric.chado.so.MrnaWithPlus2FrameshiftId id) {
		log.debug("getting MrnaWithPlus2Frameshift instance with id: " + id);
		try {
			MrnaWithPlus2Frameshift instance = (MrnaWithPlus2Frameshift) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.MrnaWithPlus2Frameshift",
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

	public List findByExample(MrnaWithPlus2Frameshift instance) {
		log.debug("finding MrnaWithPlus2Frameshift instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.MrnaWithPlus2Frameshift")
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
