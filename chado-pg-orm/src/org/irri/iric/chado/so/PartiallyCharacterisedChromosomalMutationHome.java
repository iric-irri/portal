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
 * Home object for domain model class PartiallyCharacterisedChromosomalMutation.
 * @see org.irri.iric.chado.so.PartiallyCharacterisedChromosomalMutation
 * @author Hibernate Tools
 */
public class PartiallyCharacterisedChromosomalMutationHome {

	private static final Log log = LogFactory
			.getLog(PartiallyCharacterisedChromosomalMutationHome.class);

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

	public void persist(
			PartiallyCharacterisedChromosomalMutation transientInstance) {
		log.debug("persisting PartiallyCharacterisedChromosomalMutation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PartiallyCharacterisedChromosomalMutation instance) {
		log.debug("attaching dirty PartiallyCharacterisedChromosomalMutation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PartiallyCharacterisedChromosomalMutation instance) {
		log.debug("attaching clean PartiallyCharacterisedChromosomalMutation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			PartiallyCharacterisedChromosomalMutation persistentInstance) {
		log.debug("deleting PartiallyCharacterisedChromosomalMutation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PartiallyCharacterisedChromosomalMutation merge(
			PartiallyCharacterisedChromosomalMutation detachedInstance) {
		log.debug("merging PartiallyCharacterisedChromosomalMutation instance");
		try {
			PartiallyCharacterisedChromosomalMutation result = (PartiallyCharacterisedChromosomalMutation) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PartiallyCharacterisedChromosomalMutation findById(
			org.irri.iric.chado.so.PartiallyCharacterisedChromosomalMutationId id) {
		log.debug("getting PartiallyCharacterisedChromosomalMutation instance with id: "
				+ id);
		try {
			PartiallyCharacterisedChromosomalMutation instance = (PartiallyCharacterisedChromosomalMutation) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.PartiallyCharacterisedChromosomalMutation",
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

	public List findByExample(PartiallyCharacterisedChromosomalMutation instance) {
		log.debug("finding PartiallyCharacterisedChromosomalMutation instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.PartiallyCharacterisedChromosomalMutation")
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
