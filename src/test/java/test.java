import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class test {

		// TODO Auto-generated method stub
		// JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost:3306/studentenrollment";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "admin";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT * FROM student";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		} catch (Exception ex) {
			System.out.println("Vanessa is printing error!!!! \n" + ex.getMessage());
		}
	}

}
