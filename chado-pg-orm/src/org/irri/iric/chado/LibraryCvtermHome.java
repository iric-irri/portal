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
 * Home object for domain model class LibraryCvterm.
 * @see org.irri.iric.chado.LibraryCvterm
 * @author Hibernate Tools
 */
public class LibraryCvtermHome {

	private static final Log log = LogFactory.getLog(LibraryCvtermHome.class);

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

	public void persist(LibraryCvterm transientInstance) {
		log.debug("persisting LibraryCvterm instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LibraryCvterm instance) {
		log.debug("attaching dirty LibraryCvterm instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LibraryCvterm instance) {
		log.debug("attaching clean LibraryCvterm instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LibraryCvterm persistentInstance) {
		log.debug("deleting LibraryCvterm instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LibraryCvterm merge(LibraryCvterm detachedInstance) {
		log.debug("merging LibraryCvterm instance");
		try {
			LibraryCvterm result = (LibraryCvterm) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LibraryCvterm findById(int id) {
		log.debug("getting LibraryCvterm instance with id: " + id);
		try {
			LibraryCvterm instance = (LibraryCvterm) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.LibraryCvterm", id);
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

	public List findByExample(LibraryCvterm instance) {
		log.debug("finding LibraryCvterm instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.LibraryCvterm")
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
