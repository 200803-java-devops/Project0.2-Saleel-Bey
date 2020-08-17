package email2;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBConnect extends User {
    
    private static final String username = "postgres";
    private static final String password = "postgres"; //docker = postgres
    private static final String url = "jdbc:postgresql://localhost:5432/email2-maven"; //Docker = email2-maven-port 5432
    private static final String driver = "org.postgresql.Driver";
    private static Connection connection;

    public static synchronized Connection getConection(String firstName, String lastName, String choice) throws SQLException {
        if (connection == null) {
            try {
                Class.forName(driver);
                String query = " insert into email2-maven (firstName, lastName, department)"+"values (?, ?, ?)";

                //Prepared Statement creation
                PreparedStatement preparedstmt = connection.prepareStatement(query);
                preparedstmt.setString(1, userPromptOne(firstName)); // must figure out how to reflect user input here
                preparedstmt.setString(2, userPrompTwo(lastName)); 
                preparedstmt.setString(3, depChoice(choice));
                preparedstmt.execute();

                connection.close();
            } catch (ClassNotFoundException e) {
                System.err.println("Connection Failed.");
            }
        connection = DriverManager.getConnection(url, username, password);
        }

        return connection;
    }
}