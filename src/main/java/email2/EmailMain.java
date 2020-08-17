package email2;

import java.util.*;

public class EmailMain {

    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        users.add("yourname.sales@revature.com");
        users.add("yourname.helpdesk@revature.com");
        users.add("yourname.operations@revature.com\n");

        System.out.println("Your email creation will be for the following options: \n");
        int elements = users.size();
        for (int i = 0; i < elements; i++) {
            System.out.println(users.get(i));

        }

        User startHere = new User();
        User.userPromptOne(null); // Was originally starthere.userprompt(); - but changed due to static method in
        User.userPrompTwo(null); // User class

        startHere.depOperation();
        User.depChoice(null); // originally took an argument of 0 when the parameter was set to an int.

        PasswordGen generate = new PasswordGen();
        generate.ranPassword(8);

        PasswordChange changepass = new PasswordChange();
        changepass.changePassword();

        System.out.println("Your email account has been created.");

    }
}
