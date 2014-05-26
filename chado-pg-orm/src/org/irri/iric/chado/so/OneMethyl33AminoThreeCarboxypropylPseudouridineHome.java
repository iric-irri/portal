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
 * Home object for domain model class OneMethyl33AminoThreeCarboxypropylPseudouridine.
 * @see org.irri.iric.chado.so.OneMethyl33AminoThreeCarboxypropylPseudouridine
 * @author Hibernate Tools
 */
public class OneMethyl33AminoThreeCarboxypropylPseudouridineHome {

	private static final Log log = LogFactory
			.getLog(OneMethyl33AminoThreeCarboxypropylPseudouridineHome.class);

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
			OneMethyl33AminoThreeCarboxypropylPseudouridine transientInstance) {
		log.debug("persisting OneMethyl33AminoThreeCarboxypropylPseudouridine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(
			OneMethyl33AminoThreeCarboxypropylPseudouridine instance) {
		log.debug("attaching dirty OneMethyl33AminoThreeCarboxypropylPseudouridine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(
			OneMethyl33AminoThreeCarboxypropylPseudouridine instance) {
		log.debug("attaching clean OneMethyl33AminoThreeCarboxypropylPseudouridine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			OneMethyl33AminoThreeCarboxypropylPseudouridine persistentInstance) {
		log.debug("deleting OneMethyl33AminoThreeCarboxypropylPseudouridine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OneMethyl33AminoThreeCarboxypropylPseudouridine merge(
			OneMethyl33AminoThreeCarboxypropylPseudouridine detachedInstance) {
		log.debug("merging OneMethyl33AminoThreeCarboxypropylPseudouridine instance");
		try {
			OneMethyl33AminoThreeCarboxypropylPseudouridine result = (OneMethyl33AminoThreeCarboxypropylPseudouridine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OneMethyl33AminoThreeCarboxypropylPseudouridine findById(
			org.irri.iric.chado.so.OneMethyl33AminoThreeCarboxypropylPseudouridineId id) {
		log.debug("getting OneMethyl33AminoThreeCarboxypropylPseudouridine instance with id: "
				+ id);
		try {
			OneMethyl33AminoThreeCarboxypropylPseudouridine instance = (OneMethyl33AminoThreeCarboxypropylPseudouridine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.OneMethyl33AminoThreeCarboxypropylPseudouridine",
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

	public List findByExample(
			OneMethyl33AminoThreeCarboxypropylPseudouridine instance) {
		log.debug("finding OneMethyl33AminoThreeCarboxypropylPseudouridine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.OneMethyl33AminoThreeCarboxypropylPseudouridine")
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
