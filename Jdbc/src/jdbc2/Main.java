package jdbc2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
      public Connection getconnection() throws ClassNotFoundException, SQLException {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection connection=null;
    	  connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
    	  return connection;

	}
}
