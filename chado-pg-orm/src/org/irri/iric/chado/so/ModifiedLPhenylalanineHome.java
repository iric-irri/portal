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
 * Home object for domain model class ModifiedLPhenylalanine.
 * @see org.irri.iric.chado.so.ModifiedLPhenylalanine
 * @author Hibernate Tools
 */
public class ModifiedLPhenylalanineHome {

	private static final Log log = LogFactory
			.getLog(ModifiedLPhenylalanineHome.class);

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

	public void persist(ModifiedLPhenylalanine transientInstance) {
		log.debug("persisting ModifiedLPhenylalanine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ModifiedLPhenylalanine instance) {
		log.debug("attaching dirty ModifiedLPhenylalanine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ModifiedLPhenylalanine instance) {
		log.debug("attaching clean ModifiedLPhenylalanine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ModifiedLPhenylalanine persistentInstance) {
		log.debug("deleting ModifiedLPhenylalanine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ModifiedLPhenylalanine merge(ModifiedLPhenylalanine detachedInstance) {
		log.debug("merging ModifiedLPhenylalanine instance");
		try {
			ModifiedLPhenylalanine result = (ModifiedLPhenylalanine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModifiedLPhenylalanine findById(
			org.irri.iric.chado.so.ModifiedLPhenylalanineId id) {
		log.debug("getting ModifiedLPhenylalanine instance with id: " + id);
		try {
			ModifiedLPhenylalanine instance = (ModifiedLPhenylalanine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.ModifiedLPhenylalanine", id);
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

	public List findByExample(ModifiedLPhenylalanine instance) {
		log.debug("finding ModifiedLPhenylalanine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ModifiedLPhenylalanine")
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
