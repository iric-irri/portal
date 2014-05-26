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
 * Home object for domain model class RhoIndependentBacterialTerminator.
 * @see org.irri.iric.chado.so.RhoIndependentBacterialTerminator
 * @author Hibernate Tools
 */
public class RhoIndependentBacterialTerminatorHome {

	private static final Log log = LogFactory
			.getLog(RhoIndependentBacterialTerminatorHome.class);

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

	public void persist(RhoIndependentBacterialTerminator transientInstance) {
		log.debug("persisting RhoIndependentBacterialTerminator instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RhoIndependentBacterialTerminator instance) {
		log.debug("attaching dirty RhoIndependentBacterialTerminator instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RhoIndependentBacterialTerminator instance) {
		log.debug("attaching clean RhoIndependentBacterialTerminator instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RhoIndependentBacterialTerminator persistentInstance) {
		log.debug("deleting RhoIndependentBacterialTerminator instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RhoIndependentBacterialTerminator merge(
			RhoIndependentBacterialTerminator detachedInstance) {
		log.debug("merging RhoIndependentBacterialTerminator instance");
		try {
			RhoIndependentBacterialTerminator result = (RhoIndependentBacterialTerminator) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RhoIndependentBacterialTerminator findById(
			org.irri.iric.chado.so.RhoIndependentBacterialTerminatorId id) {
		log.debug("getting RhoIndependentBacterialTerminator instance with id: "
				+ id);
		try {
			RhoIndependentBacterialTerminator instance = (RhoIndependentBacterialTerminator) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.RhoIndependentBacterialTerminator",
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

	public List findByExample(RhoIndependentBacterialTerminator instance) {
		log.debug("finding RhoIndependentBacterialTerminator instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.RhoIndependentBacterialTerminator")
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
