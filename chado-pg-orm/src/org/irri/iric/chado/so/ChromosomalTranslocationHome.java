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
 * Home object for domain model class ChromosomalTranslocation.
 * @see org.irri.iric.chado.so.ChromosomalTranslocation
 * @author Hibernate Tools
 */
public class ChromosomalTranslocationHome {

	private static final Log log = LogFactory
			.getLog(ChromosomalTranslocationHome.class);

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

	public void persist(ChromosomalTranslocation transientInstance) {
		log.debug("persisting ChromosomalTranslocation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ChromosomalTranslocation instance) {
		log.debug("attaching dirty ChromosomalTranslocation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ChromosomalTranslocation instance) {
		log.debug("attaching clean ChromosomalTranslocation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ChromosomalTranslocation persistentInstance) {
		log.debug("deleting ChromosomalTranslocation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ChromosomalTranslocation merge(
			ChromosomalTranslocation detachedInstance) {
		log.debug("merging ChromosomalTranslocation instance");
		try {
			ChromosomalTranslocation result = (ChromosomalTranslocation) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChromosomalTranslocation findById(
			org.irri.iric.chado.so.ChromosomalTranslocationId id) {
		log.debug("getting ChromosomalTranslocation instance with id: " + id);
		try {
			ChromosomalTranslocation instance = (ChromosomalTranslocation) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.ChromosomalTranslocation",
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

	public List findByExample(ChromosomalTranslocation instance) {
		log.debug("finding ChromosomalTranslocation instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.ChromosomalTranslocation")
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
