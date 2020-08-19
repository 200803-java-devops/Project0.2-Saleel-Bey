package email2;

import java.sql.SQLException;
import java.util.*;

public class EmailMain extends DBConnect {

    public static void main(String[] args) {

        // Concurrency object implementation
        java.lang.Runnable instance = new DatabaseUpdate();
        Thread thr = new Thread(instance);
        thr.start();
        try {
            Thread.sleep(3);
            thr.interrupt();
        } catch (Exception e) {
            System.err.println("Thread has been interrupted.");
        }
        // Collection API
        ArrayList<String> users = new ArrayList<String>();
        users.add("yourname.sales@revature.com");
        users.add("yourname.helpdesk@revature.com");
        users.add("yourname.operations@revature.com\n");

        System.out.println("Your email creation will be for the following options: \n");
        int elements = users.size();
        for (int i = 0; i < elements; i++) {
            System.out.println(users.get(i));

        }
        // Inheritance Objects
        User startHere = new User();
        startHere.userPromptOne(null);
        startHere.userPromptTwo(null);

        startHere.depOperation();
        User.depChoice(null);

        PasswordGen generate = new PasswordGen();
        generate.ranPassword(8);

        PasswordChange changepass = new PasswordChange();
        changepass.changePassword();

        System.out
                .println("Your email account has been created and is currently pending to the Global Address List. \n");
        // Database Connection Object
        DBConnect db = new DBConnect();
        try {
            db.getConnection();
        } catch (SQLException e) {
            System.err.println("Failed to connect.");
            e.printStackTrace();
        }

    }
}