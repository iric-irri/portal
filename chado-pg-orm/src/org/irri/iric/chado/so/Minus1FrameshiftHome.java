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
 * Home object for domain model class Minus1Frameshift.
 * @see org.irri.iric.chado.so.Minus1Frameshift
 * @author Hibernate Tools
 */
public class Minus1FrameshiftHome {

	private static final Log log = LogFactory
			.getLog(Minus1FrameshiftHome.class);

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

	public void persist(Minus1Frameshift transientInstance) {
		log.debug("persisting Minus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Minus1Frameshift instance) {
		log.debug("attaching dirty Minus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Minus1Frameshift instance) {
		log.debug("attaching clean Minus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Minus1Frameshift persistentInstance) {
		log.debug("deleting Minus1Frameshift instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Minus1Frameshift merge(Minus1Frameshift detachedInstance) {
		log.debug("merging Minus1Frameshift instance");
		try {
			Minus1Frameshift result = (Minus1Frameshift) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Minus1Frameshift findById(
			org.irri.iric.chado.so.Minus1FrameshiftId id) {
		log.debug("getting Minus1Frameshift instance with id: " + id);
		try {
			Minus1Frameshift instance = (Minus1Frameshift) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.Minus1Frameshift", id);
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

	public List findByExample(Minus1Frameshift instance) {
		log.debug("finding Minus1Frameshift instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.Minus1Frameshift")
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
