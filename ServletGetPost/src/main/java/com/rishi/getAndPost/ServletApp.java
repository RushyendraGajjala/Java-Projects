package com.rishi.getAndPost;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class ServletApp extends HttpServlet {
//	@Override
//	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		IO.println("Control in Get servlet/ controller");
//		
//		String uname = req.getParameter("uname").toLowerCase();
//		String ucity = req.getParameter("ucity").toLowerCase();
//		
//		
//		IO.println(uname);
//		IO.println(ucity);
//		
//		if(uname.equals("rishi") && ucity.equals("hyderabad")) {
//			IO.println("Successfully logged in!");
//		} else {
//			IO.println("Invalid username or password");
//		}
//		
//	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IO.println("Control in Post servlet/ controller");
		
		String uname = req.getParameter("uname").toLowerCase();
		String ucity = req.getParameter("ucity").toLowerCase();
		
		
		IO.println(uname);
		IO.println(ucity);
		
		if(uname.equals("rishi") && ucity.equals("hyderabad")) {
			IO.println("Successfully logged in!");
		} else {
			IO.println("Invalid username or password");
		}
	}
}