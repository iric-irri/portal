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
 * Home object for domain model class BiomaterialDbxref.
 * @see org.irri.iric.chado.BiomaterialDbxref
 * @author Hibernate Tools
 */
public class BiomaterialDbxrefHome {

	private static final Log log = LogFactory
			.getLog(BiomaterialDbxrefHome.class);

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

	public void persist(BiomaterialDbxref transientInstance) {
		log.debug("persisting BiomaterialDbxref instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BiomaterialDbxref instance) {
		log.debug("attaching dirty BiomaterialDbxref instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BiomaterialDbxref instance) {
		log.debug("attaching clean BiomaterialDbxref instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BiomaterialDbxref persistentInstance) {
		log.debug("deleting BiomaterialDbxref instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BiomaterialDbxref merge(BiomaterialDbxref detachedInstance) {
		log.debug("merging BiomaterialDbxref instance");
		try {
			BiomaterialDbxref result = (BiomaterialDbxref) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BiomaterialDbxref findById(int id) {
		log.debug("getting BiomaterialDbxref instance with id: " + id);
		try {
			BiomaterialDbxref instance = (BiomaterialDbxref) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.BiomaterialDbxref", id);
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

	public List findByExample(BiomaterialDbxref instance) {
		log.debug("finding BiomaterialDbxref instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("org.irri.iric.chado.BiomaterialDbxref")
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
