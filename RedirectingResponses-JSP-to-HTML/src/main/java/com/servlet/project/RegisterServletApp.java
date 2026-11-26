package com.servlet.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class RegisterServletApp extends HttpServlet {
	
	static {
		IO.println("Servlet has been loaded!");
	}
	
	public RegisterServletApp() {
		IO.println("Register Servlet has been invoked!");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IO.println("Control in Post servlet/ controller");
		
		String uname = req.getParameter("uname").toLowerCase();
		String ucity = req.getParameter("ucity").toLowerCase();
		
		
//		IO.println(uname);
//		IO.println(ucity);
//		
//		if(uname.equals("rishi") && ucity.equals("hyderabad")) {
//			IO.println("Successfully logged in!");
//		} else {
//			IO.println("Invalid username or password");
//		}
		
		resp.sendRedirect("/RedirectingResponses-JSP-to-HTML/success.jsp");
	}
}