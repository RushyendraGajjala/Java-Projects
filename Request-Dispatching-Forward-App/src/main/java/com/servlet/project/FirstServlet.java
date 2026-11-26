package com.servlet.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IO.println("Control in First Servlet");
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("/SecondServlet");
		
		reqDispatcher.forward(req, resp);
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Response from Servlet 01</h1>");
		writer.close();
		IO.println("Controller again in First Servlet");
	}
}