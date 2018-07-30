package com.myproject.FirstSpringMVC.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.FirstSpringMVC.dao.UsersDao;
import com.myproject.FirstSpringMVC.model.Users;
import com.myproject.FirstSpringMVC.services.UserService;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersDao userDao;

	@Override
	
	public void addUser(Users u) {
		userDao.addUser(u);
	}

	@Override
	
	public void updateUser(int id) {
		userDao.updateUser(id);

	}

	@Override
	
	public void removeUser(int id) {
		userDao.removeUser(id);

	}

	@Override
	
	public Users getUserById(int id) {

		return userDao.getUserById(id);
	}

	@Override
	
	public List<Users> listUsers() {
		// TODO Auto-generated method stub
		return userDao.listUsers();
	}
	@Override
	
	public boolean checkLogin(String userName, String userPassword) {
		return userDao.checkLogin(userName, userPassword);
	}

}
