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
 * Home object for domain model class NonConservativeAminoAcidSubstitution.
 * @see org.irri.iric.chado.so.NonConservativeAminoAcidSubstitution
 * @author Hibernate Tools
 */
public class NonConservativeAminoAcidSubstitutionHome {

	private static final Log log = LogFactory
			.getLog(NonConservativeAminoAcidSubstitutionHome.class);

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

	public void persist(NonConservativeAminoAcidSubstitution transientInstance) {
		log.debug("persisting NonConservativeAminoAcidSubstitution instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(NonConservativeAminoAcidSubstitution instance) {
		log.debug("attaching dirty NonConservativeAminoAcidSubstitution instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NonConservativeAminoAcidSubstitution instance) {
		log.debug("attaching clean NonConservativeAminoAcidSubstitution instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(NonConservativeAminoAcidSubstitution persistentInstance) {
		log.debug("deleting NonConservativeAminoAcidSubstitution instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NonConservativeAminoAcidSubstitution merge(
			NonConservativeAminoAcidSubstitution detachedInstance) {
		log.debug("merging NonConservativeAminoAcidSubstitution instance");
		try {
			NonConservativeAminoAcidSubstitution result = (NonConservativeAminoAcidSubstitution) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NonConservativeAminoAcidSubstitution findById(
			org.irri.iric.chado.so.NonConservativeAminoAcidSubstitutionId id) {
		log.debug("getting NonConservativeAminoAcidSubstitution instance with id: "
				+ id);
		try {
			NonConservativeAminoAcidSubstitution instance = (NonConservativeAminoAcidSubstitution) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.NonConservativeAminoAcidSubstitution",
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

	public List findByExample(NonConservativeAminoAcidSubstitution instance) {
		log.debug("finding NonConservativeAminoAcidSubstitution instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.NonConservativeAminoAcidSubstitution")
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
