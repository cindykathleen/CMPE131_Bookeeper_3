import java.sql.*;

public class RegisterDao {

	public static boolean register (String name, String username, String password) {
		boolean isRecordRegistered = false;
		try {
			//defining database driver to use
			Class.forName("com.mysql.jdbc.Driver");
			
			//getting connection from the mysql database
			//jdbc:mysql://localhost:3306 is database url
			//login is database name
			//root : username
			//root: password
			//syntex : databaseurl/databasename, username , password
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/login", "root", "");

			//prepared statement is used for secure access
			// ? used for data to put in query
			// actual query to execute is
			// select * from users where username = name and password = pass
			PreparedStatement oPrStmt = con
					.prepareStatement("INSERT INTO users (name, username, password) VALUES(?,?,?)");// ? represents some parameter to include
																							
			oPrStmt.setString(1, name);// parameter index start from 1
			oPrStmt.setString(2, username);
			oPrStmt.setString(3, password);
			int nInsertedRecords = oPrStmt.executeUpdate(); // executing the query and getting the updated/inserted row counts from database
			
			if(nInsertedRecords>0){ // check that the data is inserted successfully or not
				isRecordRegistered = true;
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return isRecordRegistered;
	}
}
