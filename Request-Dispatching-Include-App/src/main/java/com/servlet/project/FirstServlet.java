package com.servlet.project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IO.println("Controller in First Servlet");
		
		req.getRequestDispatcher("/SecondServlet").include(req, resp);
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Response from 1st Servlet</h1>");
		writer.close();
		
		IO.println("Controller again First Servlet");
		
	}

}
