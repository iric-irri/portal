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
 * Home object for domain model class RecombinationallyRearrangedVertebrateImmuneSystemGene.
 * @see org.irri.iric.chado.so.RecombinationallyRearrangedVertebrateImmuneSystemGene
 * @author Hibernate Tools
 */
public class RecombinationallyRearrangedVertebrateImmuneSystemGeneHome {

	private static final Log log = LogFactory
			.getLog(RecombinationallyRearrangedVertebrateImmuneSystemGeneHome.class);

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
			RecombinationallyRearrangedVertebrateImmuneSystemGene transientInstance) {
		log.debug("persisting RecombinationallyRearrangedVertebrateImmuneSystemGene instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(
			RecombinationallyRearrangedVertebrateImmuneSystemGene instance) {
		log.debug("attaching dirty RecombinationallyRearrangedVertebrateImmuneSystemGene instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(
			RecombinationallyRearrangedVertebrateImmuneSystemGene instance) {
		log.debug("attaching clean RecombinationallyRearrangedVertebrateImmuneSystemGene instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			RecombinationallyRearrangedVertebrateImmuneSystemGene persistentInstance) {
		log.debug("deleting RecombinationallyRearrangedVertebrateImmuneSystemGene instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RecombinationallyRearrangedVertebrateImmuneSystemGene merge(
			RecombinationallyRearrangedVertebrateImmuneSystemGene detachedInstance) {
		log.debug("merging RecombinationallyRearrangedVertebrateImmuneSystemGene instance");
		try {
			RecombinationallyRearrangedVertebrateImmuneSystemGene result = (RecombinationallyRearrangedVertebrateImmuneSystemGene) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RecombinationallyRearrangedVertebrateImmuneSystemGene findById(
			org.irri.iric.chado.so.RecombinationallyRearrangedVertebrateImmuneSystemGeneId id) {
		log.debug("getting RecombinationallyRearrangedVertebrateImmuneSystemGene instance with id: "
				+ id);
		try {
			RecombinationallyRearrangedVertebrateImmuneSystemGene instance = (RecombinationallyRearrangedVertebrateImmuneSystemGene) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.RecombinationallyRearrangedVertebrateImmuneSystemGene",
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
			RecombinationallyRearrangedVertebrateImmuneSystemGene instance) {
		log.debug("finding RecombinationallyRearrangedVertebrateImmuneSystemGene instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.RecombinationallyRearrangedVertebrateImmuneSystemGene")
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
