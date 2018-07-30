package com.myproject.FirstSpringMVC.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.myproject.FirstSpringMVC.model.Users;
@Component
public class UserValidation implements Validator {

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
	      ValidationUtils.rejectIfEmpty(err, "userPhoneNo", "user.phone.empty");
	      ValidationUtils.rejectIfEmpty(err, "userEmailId", "user.email.empty");
	      

	      Users user = (Users) obj;
	      
	      Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
	            Pattern.CASE_INSENSITIVE);
	      if (!user.getUserEmailId().isEmpty() && !(pattern.matcher(user.getUserEmailId()).matches())) {
	         err.rejectValue("userEmailId", "user.email.invalid");
	      }
	}

}
