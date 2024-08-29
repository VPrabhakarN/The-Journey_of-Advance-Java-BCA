import java.sql.*;


public class Update_Operation {
    public static void main(String [] args){

        // URL, USER, PASS
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String pass = "VinnyyyMinnyyy@1923";

        // using try block
        try {

            // establish connection
            Connection conn = DriverManager.getConnection(url, user, pass);

            // statement
            Statement st = conn.createStatement();

            // update query
            int update = st.executeUpdate("UPDATE employee_1 SET salary = 190000 WHERE id = 1");

            System.out.println("Updation successful!");

        } catch(SQLException e){
            System.out.println("Error : " + e);
        }
    }
}
