package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		
		// URL, USER, PASS
		String url = "jdbc:mysql://localhost:3306/employee1";
		String user = "root";
		String pass = "VinnyyyMinnyyy@1923";
		
		// using try block 
		try {
			
			// establish connection
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			// statement 
			Statement st = conn.createStatement();
			
			int insert = st.executeUpdate("insert into employee_1(id, name, dept, salary)"+ "values(1, 'Vijay', 'Software Engineer', 100000)");
			
			System.out.print("Inserted Successfully! " + insert);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
