import java.sql.*;

public class BookDao {

	public static boolean save(String title, String author, String isbn) {
		boolean isRecordInserted = false;
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
					.prepareStatement("INSERT INTO book (title,author,isbn) VALUES(?,?,?)");
																							
			oPrStmt.setString(1, title);
			oPrStmt.setString(2, author);
			oPrStmt.setString(3, isbn);
			int nInsertedRecords = oPrStmt.executeUpdate();
			
			if(nInsertedRecords>0){ 
				isRecordInserted = true;
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return isRecordInserted;
	}
}
