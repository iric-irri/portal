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
 * Home object for domain model class BiomaterialRelationship.
 * @see org.irri.iric.chado.BiomaterialRelationship
 * @author Hibernate Tools
 */
public class BiomaterialRelationshipHome {

	private static final Log log = LogFactory
			.getLog(BiomaterialRelationshipHome.class);

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

	public void persist(BiomaterialRelationship transientInstance) {
		log.debug("persisting BiomaterialRelationship instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BiomaterialRelationship instance) {
		log.debug("attaching dirty BiomaterialRelationship instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BiomaterialRelationship instance) {
		log.debug("attaching clean BiomaterialRelationship instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BiomaterialRelationship persistentInstance) {
		log.debug("deleting BiomaterialRelationship instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BiomaterialRelationship merge(
			BiomaterialRelationship detachedInstance) {
		log.debug("merging BiomaterialRelationship instance");
		try {
			BiomaterialRelationship result = (BiomaterialRelationship) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BiomaterialRelationship findById(int id) {
		log.debug("getting BiomaterialRelationship instance with id: " + id);
		try {
			BiomaterialRelationship instance = (BiomaterialRelationship) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.BiomaterialRelationship", id);
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

	public List findByExample(BiomaterialRelationship instance) {
		log.debug("finding BiomaterialRelationship instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.BiomaterialRelationship")
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
