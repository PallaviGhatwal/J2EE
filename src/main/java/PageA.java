import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String name = req.getParameter("un");
		String email = req.getParameter("ue");
		String password = req.getParameter("up");
		
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Password:"+password);
		
		resp.getWriter().print("<html><body><h2>Name: </h2>"+name+"<h2>Email: </h2>"+email+"<h2>Password: </h2>"+password+"</body></html>");
	}
}
