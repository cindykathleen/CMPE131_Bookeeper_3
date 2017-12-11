import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchedServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
<<<<<<< HEAD
		
		
		RequestDispatcher rd=request.getRequestDispatcher("search.html");
		rd.include(request,response);
=======
>>>>>>> 5790deb9dbd12b3b5d22560dbd3f462c06ed2fc1
		
		out.close();
	}

}
