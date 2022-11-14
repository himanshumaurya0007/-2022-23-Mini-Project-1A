package ams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDatabase {

    public static Connection ConnectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ams", "root", "2711");
            return con;

        } catch (ClassNotFoundException | SQLException e) {
        }
        return null;
    }
}
