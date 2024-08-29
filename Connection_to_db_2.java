package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Practice2 {

	public static void main(String[] args) {
		
		// URL, USER, PASSWORD
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String pass = "VinnyyyMinnyyy@1923";
		
		// using try catch 
		try {
			
			// establishing connection
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			// creating statement
			Statement st = conn.createStatement();
			
			// creating query to execute
			ResultSet rs = st.executeQuery("select * from employee1");
			
			// using while loop
			while(rs.next()) {
				System.out.println(rs.getString("E_Name"));
			}
			
			
		} catch(SQLException e) {
			System.out.println("Error : " + e);
		}

	}

}
