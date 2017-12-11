	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;
	
public class SearchDao {
	/*
	@author: Divyang Soni
	@date : 10/18/2017
	@ This class is having database related methods for login application
	*/


		public static boolean validate(String booktitle) {
			boolean isRecordSearched = false;
			try {
				//defining database driver to use
				Class.forName("com.mysql.jdbc.Driver");
				
				//getting connection from the mysql database
				//jdbc:mysql://localhost:3306 is database url
				//login is database name
				//root : username
				//root: password
				//syntax : databaseurl/databasename, username , password
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/book", "root", "");

				//prepared statement is used for secure access
				// ? used for data to put in query
				// actual query to execute is
				// select * from users where username = name and password = pass
				
				String searchTitle = booktitle; 
				PreparedStatement oPrStmt = con
						.prepareStatement("select * from book where title like ?");// ? represents some parameter to include
																								
				oPrStmt.setString(1,'%' + booktitle +'%');// parameter index start from 1
/*				oPrStmt.setString(2, pass);
*/				ResultSet rs = oPrStmt.executeQuery(); // executing the query and getting the result set from database
				
				//rs.next() shows that the result set contains next value or not
				// for retrieving multiple results, you can use while(rs.next)
					
				List<String> matchingTitles = new ArrayList<>();
				while (rs.next()) { //checking if the result set has any value?   
					String titles = rs.getString("title");
					String authors = rs.getString("author");
					String isbns = rs.getString("isbn");
					matchingTitles.add(titles);
					matchingTitles.add(authors);
					matchingTitles.add(isbns);
					
					isRecordSearched = true;
				}
			if(isRecordSearched){
				System.out.println(matchingTitles);
			}
			} catch (Exception e) {
				System.out.println(e);
			}
			return isRecordSearched;
		}
	}
