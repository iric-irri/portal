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
 * Home object for domain model class RnaseMrpRnaGene.
 * @see org.irri.iric.chado.so.RnaseMrpRnaGene
 * @author Hibernate Tools
 */
public class RnaseMrpRnaGeneHome {

	private static final Log log = LogFactory.getLog(RnaseMrpRnaGeneHome.class);

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

	public void persist(RnaseMrpRnaGene transientInstance) {
		log.debug("persisting RnaseMrpRnaGene instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RnaseMrpRnaGene instance) {
		log.debug("attaching dirty RnaseMrpRnaGene instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RnaseMrpRnaGene instance) {
		log.debug("attaching clean RnaseMrpRnaGene instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RnaseMrpRnaGene persistentInstance) {
		log.debug("deleting RnaseMrpRnaGene instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RnaseMrpRnaGene merge(RnaseMrpRnaGene detachedInstance) {
		log.debug("merging RnaseMrpRnaGene instance");
		try {
			RnaseMrpRnaGene result = (RnaseMrpRnaGene) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RnaseMrpRnaGene findById(org.irri.iric.chado.so.RnaseMrpRnaGeneId id) {
		log.debug("getting RnaseMrpRnaGene instance with id: " + id);
		try {
			RnaseMrpRnaGene instance = (RnaseMrpRnaGene) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.RnaseMrpRnaGene", id);
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

	public List findByExample(RnaseMrpRnaGene instance) {
		log.debug("finding RnaseMrpRnaGene instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.so.RnaseMrpRnaGene")
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
