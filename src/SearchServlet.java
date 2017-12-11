import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String t=request.getParameter("title");
<<<<<<< HEAD
/*		String p=request.getParameter("userpass");
*/		
		if(SearchDao.validate(t).isRecordSearched){
			out.print(SearchDao.validate(t).bookString);
			
			RequestDispatcher rd=request.getRequestDispatcher("search.html");
			rd.include(request,response);
			
			/*RequestDispatcher rd=request.getRequestDispatcher("searched");
			rd.forward(request,response);*/
			 
=======
	
		if(SearchDao.validate(t)){
			RequestDispatcher rd=request.getRequestDispatcher("searched");
			rd.forward(request,response);
>>>>>>> 5790deb9dbd12b3b5d22560dbd3f462c06ed2fc1
		}
		
		else{
			out.print("Sorry book not found");
			RequestDispatcher rd=request.getRequestDispatcher("search.html");
			rd.include(request,response);
		}
		
		out.close();
	}

}
