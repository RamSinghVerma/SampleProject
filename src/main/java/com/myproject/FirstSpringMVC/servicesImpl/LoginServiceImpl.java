package com.myproject.FirstSpringMVC.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.myproject.FirstSpringMVC.dao.LoginDao;
import com.myproject.FirstSpringMVC.services.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	@Override
	
	public boolean validateUser(String userName, String userPass) {
		return loginDao.validateUser(userName, userPass);
	}

}
