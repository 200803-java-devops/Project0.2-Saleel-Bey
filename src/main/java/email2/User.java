package email2;

import java.util.Scanner;

public class User implements Department {
    private String deptEmail;
    public static Scanner input = new Scanner(System.in);

    public User(String deptEmail) {
        this.deptEmail = deptEmail;
    }

    public User() { // this empty constructor has been placed here in order to call the userPrompt
                    // and depChoice methods

    }

    public static final String userPromptOne(String firstName) { // changed to static void so that it can be accessable
                                                                 // to the database
        System.out.println("\nPlease enter your first name:");
        firstName = input.nextLine();
        return ("You have entered: " + firstName + "\n");

    }

    public static final String userPrompTwo(String lastName) { // Both user prompts were originally a combined method
        System.out.println("Please enter your last name:");
        lastName = input.nextLine();
        return ("You have entered: " + lastName + "\n");
    }

    public void depOperation() {
        System.out.println("Please enter your Department: \nSales\nHelp Desk\nOperations\n");

    }

    public static String depChoice(String choice) {
        choice = input.next();
        if (choice == "sales".toUpperCase()) {
            System.out.println("Department: Sales\n");
        } else if (choice == "help desk".toUpperCase()) {
            System.out.println("Department: Help Desk\n");
        } else if (choice == "operations".toUpperCase()) {
            System.out.println("Department: Operations\n");
        } else {

        }
        return "Department: \n";

    }

}