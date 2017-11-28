import java.sql.*;

public class RegisterDao {

	public static boolean register (String name, String username, String password) {
		boolean isRecordRegistered = false;
		try {
			//defining database driver to use
			Class.forName("com.mysql.jdbc.Driver");
			
			//getting connection from the mysql database
			//jdbc:mysql://localhost:3306 is database url
			//syntex : databaseurl/databasename, username , password
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/login", "root", "");

			//prepared statement is used for secure access
			// ? used for data to put in query
			// actual query to execute is
			PreparedStatement oPrStmt = con
					.prepareStatement("INSERT INTO users (name, username, password) VALUES(?,?,?)");
																							
			oPrStmt.setString(1, name);
			oPrStmt.setString(2, username);
			oPrStmt.setString(3, password);
			int nInsertedRecords = oPrStmt.executeUpdate();
			
			if(nInsertedRecords>0){
				isRecordRegistered = true;
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return isRecordRegistered;
	}
}
