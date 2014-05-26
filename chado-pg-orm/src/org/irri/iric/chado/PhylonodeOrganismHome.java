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
 * Home object for domain model class PhylonodeOrganism.
 * @see org.irri.iric.chado.PhylonodeOrganism
 * @author Hibernate Tools
 */
public class PhylonodeOrganismHome {

	private static final Log log = LogFactory
			.getLog(PhylonodeOrganismHome.class);

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

	public void persist(PhylonodeOrganism transientInstance) {
		log.debug("persisting PhylonodeOrganism instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PhylonodeOrganism instance) {
		log.debug("attaching dirty PhylonodeOrganism instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PhylonodeOrganism instance) {
		log.debug("attaching clean PhylonodeOrganism instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PhylonodeOrganism persistentInstance) {
		log.debug("deleting PhylonodeOrganism instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PhylonodeOrganism merge(PhylonodeOrganism detachedInstance) {
		log.debug("merging PhylonodeOrganism instance");
		try {
			PhylonodeOrganism result = (PhylonodeOrganism) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PhylonodeOrganism findById(int id) {
		log.debug("getting PhylonodeOrganism instance with id: " + id);
		try {
			PhylonodeOrganism instance = (PhylonodeOrganism) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.PhylonodeOrganism", id);
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

	public List findByExample(PhylonodeOrganism instance) {
		log.debug("finding PhylonodeOrganism instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.PhylonodeOrganism")
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
