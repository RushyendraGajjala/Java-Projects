

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class FirstServletApp extends HttpServlet {
	
	public FirstServletApp() {
		IO.println("Servlet Object has been invoked!");
	}
	
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String ucity = req.getParameter("ucity");
		
		PrintWriter out = resp.getWriter();
//		out.println("Hello "+uname);
//		out.println("I know you're from "+ucity);
		out.print("<html><head><head><title>My Second App</title></head>"
				+ "<body bgcolor='blue' style='color: white'>"
				+ "<h1><marquee>This is the Dynamic Website</marquee></h1>"
				+ "<table>"
				+ "<tr> <th>Name</th>"
				+ "<th>City</th> </tr>"
				+ "<tr> <td>"+uname+"</td>"
				+ "<td>"+ucity+"</td></tr>"
				+ "</table></body></html>");
		
		out.close();
	}
	
	

}
