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
 * Home object for domain model class TwoMethylthioN6HydroxynorvalylCarbamoyladenosine.
 * @see org.irri.iric.chado.so.TwoMethylthioN6HydroxynorvalylCarbamoyladenosine
 * @author Hibernate Tools
 */
public class TwoMethylthioN6HydroxynorvalylCarbamoyladenosineHome {

	private static final Log log = LogFactory
			.getLog(TwoMethylthioN6HydroxynorvalylCarbamoyladenosineHome.class);

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
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine transientInstance) {
		log.debug("persisting TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance) {
		log.debug("attaching dirty TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance) {
		log.debug("attaching clean TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine persistentInstance) {
		log.debug("deleting TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TwoMethylthioN6HydroxynorvalylCarbamoyladenosine merge(
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine detachedInstance) {
		log.debug("merging TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance");
		try {
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine result = (TwoMethylthioN6HydroxynorvalylCarbamoyladenosine) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TwoMethylthioN6HydroxynorvalylCarbamoyladenosine findById(
			org.irri.iric.chado.so.TwoMethylthioN6HydroxynorvalylCarbamoyladenosineId id) {
		log.debug("getting TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance with id: "
				+ id);
		try {
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance = (TwoMethylthioN6HydroxynorvalylCarbamoyladenosine) sessionFactory
					.getCurrentSession()
					.get("org.irri.iric.chado.so.TwoMethylthioN6HydroxynorvalylCarbamoyladenosine",
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
			TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance) {
		log.debug("finding TwoMethylthioN6HydroxynorvalylCarbamoyladenosine instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"org.irri.iric.chado.so.TwoMethylthioN6HydroxynorvalylCarbamoyladenosine")
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
