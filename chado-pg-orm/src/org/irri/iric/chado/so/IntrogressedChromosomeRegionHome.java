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
 * Home object for domain model class IntrogressedChromosomeRegion.
 * @see org.irri.iric.chado.so.IntrogressedChromosomeRegion
 * @author Hibernate Tools
 */
public class IntrogressedChromosomeRegionHome {

	private static final Log log = LogFactory
			.getLog(IntrogressedChromosomeRegionHome.class);

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

	public void persist(IntrogressedChromosomeRegion transientInstance) {
		log.debug("persisting IntrogressedChromosomeRegion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(IntrogressedChromosomeRegion instance) {
		log.debug("attaching dirty IntrogressedChromosomeRegion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IntrogressedChromosomeRegion instance) {
		log.debug("attaching clean IntrogressedChromosomeRegion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(IntrogressedChromosomeRegion persistentInstance) {
		log.debug("deleting IntrogressedChromosomeRegion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IntrogressedChromosomeRegion merge(
			IntrogressedChromosomeRegion detachedInstance) {
		log.debug("merging IntrogressedChromosomeRegion instance");
		try {
			IntrogressedChromosomeRegion result = (IntrogressedChromosomeRegion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IntrogressedChromosomeRegion findById(
			org.irri.iric.chado.so.IntrogressedChromosomeRegionId id) {
		log.debug("getting IntrogressedChromosomeRegion instance with id: "
				+ id);
		try {
			IntrogressedChromosomeRegion instance = (IntrogressedChromosomeRegion) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.IntrogressedChromosomeRegion",
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

	public List findByExample(IntrogressedChromosomeRegion instance) {
		log.debug("finding IntrogressedChromosomeRegion instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.IntrogressedChromosomeRegion")
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
