package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connection_to_db_3 {

	public static void main(String[] args) {
		
		// URL, USER, PASS
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String pass = "VinnyyyMinnyyy@1923";
		
		// using try block
		try {
			
			// establishing connection
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			// statement 
			Statement st = conn.createStatement();
			
			// create query to execute
			ResultSet rs = st.executeQuery("select * from employee1");
			
			// using while loop 
			while(rs.next()) {
				System.out.println(rs.getString("E_Name") + " " + rs.getInt("age"));
			}
			
		} catch(SQLException e) { // catch block
			System.out.println("Error : " + e);
		}

	}

}
