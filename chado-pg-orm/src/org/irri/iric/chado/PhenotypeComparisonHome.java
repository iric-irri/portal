package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class PhenotypeComparison.
 * @see org.irri.iric.chado.PhenotypeComparison
 * @author Hibernate Tools
 */
public class PhenotypeComparisonHome {

	private static final Log log = LogFactory
			.getLog(PhenotypeComparisonHome.class);

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

	public void persist(PhenotypeComparison transientInstance) {
		log.debug("persisting PhenotypeComparison instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PhenotypeComparison instance) {
		log.debug("attaching dirty PhenotypeComparison instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PhenotypeComparison instance) {
		log.debug("attaching clean PhenotypeComparison instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PhenotypeComparison persistentInstance) {
		log.debug("deleting PhenotypeComparison instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PhenotypeComparison merge(PhenotypeComparison detachedInstance) {
		log.debug("merging PhenotypeComparison instance");
		try {
			PhenotypeComparison result = (PhenotypeComparison) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PhenotypeComparison findById(int id) {
		log.debug("getting PhenotypeComparison instance with id: " + id);
		try {
			PhenotypeComparison instance = (PhenotypeComparison) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.PhenotypeComparison", id);
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

	public List findByExample(PhenotypeComparison instance) {
		log.debug("finding PhenotypeComparison instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.PhenotypeComparison")
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
