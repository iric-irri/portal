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
 * Home object for domain model class N2N27Trimethylguanosine.
 * @see org.irri.iric.chado.so.N2N27Trimethylguanosine
 * @author Hibernate Tools
 */
public class N2N27TrimethylguanosineHome {

	private static final Log log = LogFactory
			.getLog(N2N27TrimethylguanosineHome.class);

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

	public void persist(N2N27Trimethylguanosine transientInstance) {
		log.debug("persisting N2N27Trimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(N2N27Trimethylguanosine instance) {
		log.debug("attaching dirty N2N27Trimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(N2N27Trimethylguanosine instance) {
		log.debug("attaching clean N2N27Trimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(N2N27Trimethylguanosine persistentInstance) {
		log.debug("deleting N2N27Trimethylguanosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public N2N27Trimethylguanosine merge(
			N2N27Trimethylguanosine detachedInstance) {
		log.debug("merging N2N27Trimethylguanosine instance");
		try {
			N2N27Trimethylguanosine result = (N2N27Trimethylguanosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public N2N27Trimethylguanosine findById(
			org.irri.iric.chado.so.N2N27TrimethylguanosineId id) {
		log.debug("getting N2N27Trimethylguanosine instance with id: " + id);
		try {
			N2N27Trimethylguanosine instance = (N2N27Trimethylguanosine) sessionFactory
					.getCurrentSession().get(
							"org.irri.iric.chado.so.N2N27Trimethylguanosine",
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

	public List findByExample(N2N27Trimethylguanosine instance) {
		log.debug("finding N2N27Trimethylguanosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.N2N27Trimethylguanosine")
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
