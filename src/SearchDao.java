import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SearchDao {

	public static boolean search (String title) {
		boolean isRecordSearched = false;
		try {
			//defining database driver to use
			Class.forName("com.mysql.jdbc.Driver");
			
			//getting connection from the mysql database
			//jdbc:mysql://localhost:3306 is database url
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/book", "root", "");

			//prepared statement is used for secure access
			// ? used for data to put in query
			// actual query to execute is
			PreparedStatement oPrStmt = con
					.prepareStatement("SELECT title, author, isbn FROM book WHERE title = ?");
																							
			oPrStmt.setString(1, title);
//			oPrStmt.setString(1, author);
//			oPrStmt.setString(1, isbn);
			ResultSet nSearchedRecords = oPrStmt.executeQuery();
			
			List<String> matchingTitles = new ArrayList<>();
			while (nSearchedRecords.next())
			{
				String titles = nSearchedRecords.getString("title");
				matchingTitles.add(titles);
				System.out.println(matchingTitles);
			}
			
			isRecordSearched = true;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return isRecordSearched;
	}
}
