package com.myproject.FirstSpringMVC.DaoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.FirstSpringMVC.dao.UsersDao;
import com.myproject.FirstSpringMVC.model.Users;

@Repository
@Transactional
public class UserDaoImpl implements UsersDao {
	private Logger log=Logger.getLogger(Users.class);
	@Autowired
	private SessionFactory sessionFactory;
	public void addUser(Users u) {
		sessionFactory.getCurrentSession().save(u);
		log.info("Document Added! "+u.toString());
	}

	public void updateUser(int id) {
		Session session=sessionFactory.getCurrentSession();
		Users user=(Users) session.load(Users.class, id);
		session.update(user);
		
		log.info("Document Updated! "+user.toString());
	}

	public void removeUser(int id) {
		Session session=sessionFactory.getCurrentSession();
		Users user=(Users) session.load(Users.class, id);
		session.delete(user);
		
		log.info("Document Updated! "+user.toString());
	}

	public Users getUserById(int id) {
		return (Users) sessionFactory.getCurrentSession().load(Users.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Users> listUsers() {
		return (List<Users>)sessionFactory.getCurrentSession()
				.createCriteria(Users.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}
	public boolean checkLogin(String userName, String userPassword){
		System.out.println("In Check login "+sessionFactory);
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY =" from Users as o where o.userName=:userName and o.userPass=:userPass";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter("userName",userName);
		query.setParameter("userPass",userPassword);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		
		return userFound;              
   }
}
