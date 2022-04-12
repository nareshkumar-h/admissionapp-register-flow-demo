package com.admissionapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admissionapp.dao.UserDAO;
import com.admissionapp.service.UserService;
import com.admissionapp.validator.UserValidator;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//PrintWriter out=response.getWriter();
		System.out.println(name+" "+email+" "+password);
		
		String result = null;
		try {
			
			result = UserService.register(name, email, password);
			
		} catch (Exception e) {
			e.printStackTrace();
			result = e.getMessage();
		}
		
		out.println(result);
		out.flush();
		
		
		
		
	}
	
	

		
}
