function validateRegistrationFields(name,email,password){
	if(name == null || name.trim() == ""){
		throw new Error("Invalid Name");
	}
	if(email == null || email.trim() == ""){
		throw new Error("Invalid Email");
	}
	if(password == null || password.trim() == ""){
		throw new Error("Invalid Password");
	}
	else if(password.length < 8 ){
		throw new Error("Password must be minimum 8 characters")
	}
}
