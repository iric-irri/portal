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
 * Home object for domain model class PolypeptideBindingMotif.
 * @see org.irri.iric.chado.so.PolypeptideBindingMotif
 * @author Hibernate Tools
 */
public class PolypeptideBindingMotifHome {

	private static final Log log = LogFactory
			.getLog(PolypeptideBindingMotifHome.class);

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

	public void persist(PolypeptideBindingMotif transientInstance) {
		log.debug("persisting PolypeptideBindingMotif instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PolypeptideBindingMotif instance) {
		log.debug("attaching dirty PolypeptideBindingMotif instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PolypeptideBindingMotif instance) {
		log.debug("attaching clean PolypeptideBindingMotif instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PolypeptideBindingMotif persistentInstance) {
		log.debug("deleting PolypeptideBindingMotif instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PolypeptideBindingMotif merge(
			PolypeptideBindingMotif detachedInstance) {
		log.debug("merging PolypeptideBindingMotif instance");
		try {
			PolypeptideBindingMotif result = (PolypeptideBindingMotif) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PolypeptideBindingMotif findById(
			org.irri.iric.chado.so.PolypeptideBindingMotifId id) {
		log.debug("getting PolypeptideBindingMotif instance with id: " + id);
		try {
			PolypeptideBindingMotif instance = (PolypeptideBindingMotif) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.PolypeptideBindingMotif",
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

	public List findByExample(PolypeptideBindingMotif instance) {
		log.debug("finding PolypeptideBindingMotif instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PolypeptideBindingMotif")
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
