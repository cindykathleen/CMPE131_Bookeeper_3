import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String strTitle=request.getParameter("title");
//		String strAuthor=request.getParameter("author");
//		String strISBN=request.getParameter("isbn");
		
		
		if(SearchDao.search(strTitle)){
			RequestDispatcher rd=request.getRequestDispatcher("searched");
			rd.forward(request,response);
		}
		
		else{
			out.print("Error occured while searching for book.");
			RequestDispatcher rd=request.getRequestDispatcher("search.html");
			rd.include(request,response);
		}
		
		out.close();
	}

}
