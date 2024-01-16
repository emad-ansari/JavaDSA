package oops.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnection {
    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306";
        String userName = "root";
        String password = "emad@111";
        try {
            String sql = "SELECT * FROM employee";

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(sql);
            results.next();

            System.out.println(results);
        }
        catch(SQLException e) {
            System.out.println(e);
        }

    }
    
}
