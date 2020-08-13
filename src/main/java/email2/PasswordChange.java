package email2;

import java.util.Scanner;

public class PasswordChange {

    Scanner pass = new Scanner(System.in);

    public void PasswordChange() {

    }

    public String changePassword() {
        String passwordChange = pass.nextLine().toLowerCase();
        System.out.println("Change password:\nYes:\nNo: ");
        passwordChange = pass.nextLine().toLowerCase();
        if (passwordChange.equals("yes")) {
            System.out.println("Enter new password: ");
            passwordChange = pass.nextLine().toLowerCase();
            System.out.println("You have successfully updated your password.");
        } else if (passwordChange.equals("no")) {
            System.out.println("You have chosen to keep your given password.");
        }
        pass.close();

        return passwordChange;

    }

}