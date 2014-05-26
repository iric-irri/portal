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
 * Home object for domain model class Complex3dStructuralVariant.
 * @see org.irri.iric.chado.so.Complex3dStructuralVariant
 * @author Hibernate Tools
 */
public class Complex3dStructuralVariantHome {

	private static final Log log = LogFactory
			.getLog(Complex3dStructuralVariantHome.class);

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

	public void persist(Complex3dStructuralVariant transientInstance) {
		log.debug("persisting Complex3dStructuralVariant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Complex3dStructuralVariant instance) {
		log.debug("attaching dirty Complex3dStructuralVariant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Complex3dStructuralVariant instance) {
		log.debug("attaching clean Complex3dStructuralVariant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Complex3dStructuralVariant persistentInstance) {
		log.debug("deleting Complex3dStructuralVariant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Complex3dStructuralVariant merge(
			Complex3dStructuralVariant detachedInstance) {
		log.debug("merging Complex3dStructuralVariant instance");
		try {
			Complex3dStructuralVariant result = (Complex3dStructuralVariant) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Complex3dStructuralVariant findById(
			org.irri.iric.chado.so.Complex3dStructuralVariantId id) {
		log.debug("getting Complex3dStructuralVariant instance with id: " + id);
		try {
			Complex3dStructuralVariant instance = (Complex3dStructuralVariant) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.Complex3dStructuralVariant",
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

	public List findByExample(Complex3dStructuralVariant instance) {
		log.debug("finding Complex3dStructuralVariant instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.Complex3dStructuralVariant")
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
