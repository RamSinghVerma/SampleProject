package com.myproject.FirstSpringMVC.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.myproject.FirstSpringMVC.model.Users;
@Component
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Users.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors err) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(err, "userName", "user.name.empty");
	      ValidationUtils.rejectIfEmpty(err, "userPass", "user.pass.empty");
	}

}
