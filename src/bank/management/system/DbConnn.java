package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnn{
    Connection connection;
    Statement statement;

    public DbConnn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Akhtar");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
