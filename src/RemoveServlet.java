import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RemoveServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String strTitle=request.getParameter("title");
		
		if(RemoveDao.delete(strTitle)){
			RequestDispatcher rd=request.getRequestDispatcher("deleted");
			rd.forward(request,response);
		}
		
		else{
			RequestDispatcher rd=request.getRequestDispatcher("removed2.html");
			rd.include(request,response);
		}
		
		out.close();
	}

}
