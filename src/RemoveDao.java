import java.sql.*;

public class RemoveDao {

	public static boolean delete(String title) {
		boolean isRecordRemoved = false;
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
					.prepareStatement("DELETE FROM book WHERE title = ?");
																							
			oPrStmt.setString(1, title);
			int nRemovedRecords = oPrStmt.executeUpdate(); 
			
			if(nRemovedRecords>0){
				isRecordRemoved = true;
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return isRecordRemoved;
	}
}
