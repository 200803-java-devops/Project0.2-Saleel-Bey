package email2;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

 
public class DBConnect extends User { 

    //Used for the purpose of connecting to the database

    String username = "postgres";
    String password = "Barata20"; 
    String url = "jdbc:postgresql://localhost:5432/Email2-Maven"; 
    String driver = "org.postgresql.Driver";
    Connection connection;

    public synchronized Connection getConnection() throws SQLException {

        String query = " SELECT first_name, last_name, department, phone_num FROM email_storage";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.err.println("Connection Failed");
        }

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the Database:\n");

            // Statement creation and implementation of printing the database.
            Statement stmt = connection.createStatement(); 
            ResultSet rset = stmt.executeQuery(query);
            int rows = 0;
            while (rset.next()) {
                String firstname = rset.getString("first_name");
                String lastname = rset.getString("last_name");
                String department = rset.getString("department");
                int phone = rset.getInt("phone_num");
                System.out.println(firstname + ", " + lastname + ", " + department + ", " + phone);
                ++rows;
            }
            System.out.println("Global Address List. " + rows);

        } catch (SQLException e) {
            System.err.println("Failed to connect.");
            e.printStackTrace();
        }

        connection.close();

        return connection;
    }

}
