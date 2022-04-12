package com.admissionapp.service;

import com.admissionapp.dao.UserDAO;
import com.admissionapp.validator.UserValidator;

public class UserService {

	public static String register(String name,String email, String password) throws Exception {
		
		
		UserValidator.validate(name, email, password);
		
		//If all fields are valid, then save details in dao
		UserDAO userDAO = new UserDAO();
		String result = userDAO.register(name, email, password);
		return result;
		
		//sendMail or sendSMS
	}
}
