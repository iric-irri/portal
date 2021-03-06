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
 * Home object for domain model class U12Snrna.
 * @see org.irri.iric.chado.so.U12Snrna
 * @author Hibernate Tools
 */
public class U12SnrnaHome {

	private static final Log log = LogFactory.getLog(U12SnrnaHome.class);

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

	public void persist(U12Snrna transientInstance) {
		log.debug("persisting U12Snrna instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(U12Snrna instance) {
		log.debug("attaching dirty U12Snrna instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(U12Snrna instance) {
		log.debug("attaching clean U12Snrna instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(U12Snrna persistentInstance) {
		log.debug("deleting U12Snrna instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public U12Snrna merge(U12Snrna detachedInstance) {
		log.debug("merging U12Snrna instance");
		try {
			U12Snrna result = (U12Snrna) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public U12Snrna findById(org.irri.iric.chado.so.U12SnrnaId id) {
		log.debug("getting U12Snrna instance with id: " + id);
		try {
			U12Snrna instance = (U12Snrna) sessionFactory.getCurrentSession()
					.get("org.irri.iric.chado.so.U12Snrna", id);
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

	public List findByExample(U12Snrna instance) {
		log.debug("finding U12Snrna instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.U12Snrna")
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
