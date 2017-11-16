import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String strName=request.getParameter("name");
		String strUsername=request.getParameter("username");
		String strPassword=request.getParameter("userpass");
		
		
		if(RegisterDao.save2(strName, strUsername, strPassword)){
			RequestDispatcher rd=request.getRequestDispatcher("saved2");
			rd.forward(request,response);
		}
		else{
			out.print("Error occured while registering.");
			RequestDispatcher rd=request.getRequestDispatcher("register.html");
			rd.include(request,response);
		}
		
		out.close();
	}

}
