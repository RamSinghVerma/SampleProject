package com.myproject.FirstSpringMVC.DaoImpl;

import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.FirstSpringMVC.dao.LoginDao;
import com.myproject.FirstSpringMVC.model.Users;
@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Override
	public boolean validateUser(String userName, String userPass) {
		
		System.out.println("In Check login " + sessionFactory);
		System.out.println(userName+"  "+userPass);
		boolean userFound = false;
		Session session = sessionFactory.getCurrentSession();
		// Query using Hibernate Query Language
		String SQL_QUERY = " from Users where userName=:userName and userPass=:userPass";
		
		Query<Users> query = session.createQuery(SQL_QUERY, Users.class);
		query.setParameter("userName", userName);
		query.setParameter("userPass", userPass);
		Users list = query.uniqueResult();
		if(list!=null)
			userFound= true;

		/*
		 * CriteriaBuilder builder=session.getCriteriaBuilder(); CriteriaQuery<Users>
		 * criteriaQuery = builder.createQuery(Users.class); Root<Users>
		 * root=criteriaQuery.from(Users.class); ParameterExpression<String>
		 * parameterExpression =builder.parameter(String.class);
		 * criteriaQuery.where(builder.equal(root.get("userName"),
		 * parameterExpression));
		 * criteriaQuery.where(builder.equal(root.get("userPass"),
		 * parameterExpression)); Query<Users> query=session.createQuery(criteriaQuery);
		 * query.setParameter(parameterExpression, userName);
		 * query.setParameter(parameterExpression, userPass); List<Users>
		 * list=query.getResultList(); if(list!=null && list.size()>0) userFound= true;
		 */
		/*
		 * DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Users.class);
		 * detachedCriteria.add(Restrictions.eq("userName", userName));
		 * detachedCriteria.add(Restrictions.eq("userPass", userPass)); List<Users>
		 * findByCriteria = (List<Users>)
		 * hibernateTemplate.findByCriteria(detachedCriteria); if(findByCriteria !=null
		 * && findByCriteria.size()>0) userFound= true;
		 */

		return userFound;

	}

}
