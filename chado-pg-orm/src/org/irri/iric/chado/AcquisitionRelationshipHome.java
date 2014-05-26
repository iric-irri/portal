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
 * Home object for domain model class AcquisitionRelationship.
 * @see org.irri.iric.chado.AcquisitionRelationship
 * @author Hibernate Tools
 */
public class AcquisitionRelationshipHome {

	private static final Log log = LogFactory
			.getLog(AcquisitionRelationshipHome.class);

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

	public void persist(AcquisitionRelationship transientInstance) {
		log.debug("persisting AcquisitionRelationship instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(AcquisitionRelationship instance) {
		log.debug("attaching dirty AcquisitionRelationship instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AcquisitionRelationship instance) {
		log.debug("attaching clean AcquisitionRelationship instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(AcquisitionRelationship persistentInstance) {
		log.debug("deleting AcquisitionRelationship instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AcquisitionRelationship merge(
			AcquisitionRelationship detachedInstance) {
		log.debug("merging AcquisitionRelationship instance");
		try {
			AcquisitionRelationship result = (AcquisitionRelationship) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AcquisitionRelationship findById(int id) {
		log.debug("getting AcquisitionRelationship instance with id: " + id);
		try {
			AcquisitionRelationship instance = (AcquisitionRelationship) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.AcquisitionRelationship", id);
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

	public List findByExample(AcquisitionRelationship instance) {
		log.debug("finding AcquisitionRelationship instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.AcquisitionRelationship")
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
