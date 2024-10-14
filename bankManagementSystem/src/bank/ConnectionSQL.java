package bank;

import java.sql.*;

public class ConnectionSQL {
    public Connection c;
    public Statement s;

    public ConnectionSQL() {
        try {
            // Load the MySQL JDBC Driver
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "1234");
            s = c.createStatement();
            // Mysql@localhost: 3306
        } catch (Exception e) {
            // Print a generic error message and the exception details
            System.out.println("Error occurred: " + e.getMessage());
//            e.printStackTrace(); // This will print the stack trace for more details
        }
    }
}
