import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ServletLife") //URL Mapping
public class ServletLife extends HttpServlet {
	
	static {
		IO.println("Servlet is loaded...");
	}
	
	public ServletLife() {
		IO.println("Servlet object is created!");
	}
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
	    super.init(config);
	    IO.println("Servlet Instantiated!");
	}

	public void destroy() {
		IO.println("Servlet destroyed!");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IO.println("Service method to handle HTTP Request and Response Back");
	}

}
