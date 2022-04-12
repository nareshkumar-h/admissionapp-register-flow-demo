function save(name,email,password){
	//const url = "http://localhost:8080/admissionapp-web/RegisterServlet?name=Naresh&email=nn2@gmail.com&password=12345678";

	const rootUrl = "http://localhost:8080/admissionapp-web/";

	const url = rootUrl + "RegisterServlet?name=" + name + "&email=" + email +"&password=" + password;

	fetch(url)
	.then(res=>res.text())
	.then(res=> {
		let data = res.trim();
		console.log(data);
		alert(data);
	});
	
	http.get(url).subscribe(res=>{
		alert(res);
	})

}
