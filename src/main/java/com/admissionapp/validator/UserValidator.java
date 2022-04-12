package com.admissionapp.validator;

public class UserValidator {

	public static void validate(String name,String email, String password) throws Exception {
		if(name == null || name.trim().equals("")) {
			throw new Exception("Invalid Name. Name cannot be empty/blank");
		}
		if(email == null || email.trim().equals("")) {
			throw new Exception("Invalid Email");
		}
		if(password == null || password.trim().equals("")) {
			throw new Exception("Invalid Password");
		}
		else if(password.length() <8) {
			throw new Exception("Password must be minimum 8 characters");
		}
		
		
		
	}
}
