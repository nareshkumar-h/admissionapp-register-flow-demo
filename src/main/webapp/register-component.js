function register(){

	event.preventDefault();

	const name = document.querySelector("#name").value;//"Naresh5";
	const email = document.querySelector("#email").value; //"nn5@gmail.com";
	const password = document.querySelector("#password").value;//"pass1234";
	
	
	try{
		validateRegistrationFields(name,email,password);
		save(name,email,password);
	}
	catch(err){
		alert(err.message);
	}
}
