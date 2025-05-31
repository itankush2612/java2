package connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC driver
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db", // DB URL
                "root",                                // your MySQL username
                ""                        // your MySQL password
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
