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
 * Home object for domain model class N6Isopentenyladenosine.
 * @see org.irri.iric.chado.so.N6Isopentenyladenosine
 * @author Hibernate Tools
 */
public class N6IsopentenyladenosineHome {

	private static final Log log = LogFactory
			.getLog(N6IsopentenyladenosineHome.class);

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

	public void persist(N6Isopentenyladenosine transientInstance) {
		log.debug("persisting N6Isopentenyladenosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N6Isopentenyladenosine instance) {
		log.debug("attaching dirty N6Isopentenyladenosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N6Isopentenyladenosine instance) {
		log.debug("attaching clean N6Isopentenyladenosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N6Isopentenyladenosine persistentInstance) {
		log.debug("deleting N6Isopentenyladenosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N6Isopentenyladenosine merge(N6Isopentenyladenosine detachedInstance) {
		log.debug("merging N6Isopentenyladenosine instance");
		try {
			N6Isopentenyladenosine result = (N6Isopentenyladenosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N6Isopentenyladenosine findById(
			org.irri.iric.chado.so.N6IsopentenyladenosineId id) {
		log.debug("getting N6Isopentenyladenosine instance with id: " + id);
		try {
			N6Isopentenyladenosine instance = (N6Isopentenyladenosine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.N6Isopentenyladenosine", id);
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

	public List findByExample(N6Isopentenyladenosine instance) {
		log.debug("finding N6Isopentenyladenosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N6Isopentenyladenosine")
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
