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
 * Home object for domain model class PhylonodeRelationship.
 * @see org.irri.iric.chado.PhylonodeRelationship
 * @author Hibernate Tools
 */
public class PhylonodeRelationshipHome {

	private static final Log log = LogFactory
			.getLog(PhylonodeRelationshipHome.class);

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

	public void persist(PhylonodeRelationship transientInstance) {
		log.debug("persisting PhylonodeRelationship instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PhylonodeRelationship instance) {
		log.debug("attaching dirty PhylonodeRelationship instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PhylonodeRelationship instance) {
		log.debug("attaching clean PhylonodeRelationship instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PhylonodeRelationship persistentInstance) {
		log.debug("deleting PhylonodeRelationship instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PhylonodeRelationship merge(PhylonodeRelationship detachedInstance) {
		log.debug("merging PhylonodeRelationship instance");
		try {
			PhylonodeRelationship result = (PhylonodeRelationship) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PhylonodeRelationship findById(int id) {
		log.debug("getting PhylonodeRelationship instance with id: " + id);
		try {
			PhylonodeRelationship instance = (PhylonodeRelationship) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.PhylonodeRelationship", id);
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

	public List findByExample(PhylonodeRelationship instance) {
		log.debug("finding PhylonodeRelationship instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("org.irri.iric.chado.PhylonodeRelationship")
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
