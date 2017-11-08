import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InsertedServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String strTitle =request.getParameter("title");
		String strAuthor = request.getParameter("author");
		String strISBN = request.getParameter("isbn");
		out.print("Book having name "+strTitle+" and author "+strAuthor + " with ISBN #"+strISBN + "is saved successfully");
		
		out.close();
	}

}