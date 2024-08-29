package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Practice {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employee";
		
		try {
			
			// establishing the connection
			Connection conn = DriverManager.getConnection(url, "root", "VinnyyyMinnyyy@1923");
			
			// a statement object to write a sql statement
			Statement st = conn.createStatement();
			
			// create an executable query
			ResultSet rs = st.executeQuery("select * from employee1");
			
			// using while loop
			while(rs.next()) {
				System.out.println(rs.getString("E_Name"));
			}
			
			// closing the connection 
			conn.close();
		}
		
		catch(SQLException e) {
			System.out.println("Erroe : " + e);
		}

	}

}
