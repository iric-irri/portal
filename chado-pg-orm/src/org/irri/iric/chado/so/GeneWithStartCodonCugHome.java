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
 * Home object for domain model class GeneWithStartCodonCug.
 * @see org.irri.iric.chado.so.GeneWithStartCodonCug
 * @author Hibernate Tools
 */
public class GeneWithStartCodonCugHome {

	private static final Log log = LogFactory
			.getLog(GeneWithStartCodonCugHome.class);

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

	public void persist(GeneWithStartCodonCug transientInstance) {
		log.debug("persisting GeneWithStartCodonCug instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GeneWithStartCodonCug instance) {
		log.debug("attaching dirty GeneWithStartCodonCug instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GeneWithStartCodonCug instance) {
		log.debug("attaching clean GeneWithStartCodonCug instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GeneWithStartCodonCug persistentInstance) {
		log.debug("deleting GeneWithStartCodonCug instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GeneWithStartCodonCug merge(GeneWithStartCodonCug detachedInstance) {
		log.debug("merging GeneWithStartCodonCug instance");
		try {
			GeneWithStartCodonCug result = (GeneWithStartCodonCug) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GeneWithStartCodonCug findById(
			org.irri.iric.chado.so.GeneWithStartCodonCugId id) {
		log.debug("getting GeneWithStartCodonCug instance with id: " + id);
		try {
			GeneWithStartCodonCug instance = (GeneWithStartCodonCug) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.GeneWithStartCodonCug", id);
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

	public List findByExample(GeneWithStartCodonCug instance) {
		log.debug("finding GeneWithStartCodonCug instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.GeneWithStartCodonCug")
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
