package email2;

import java.util.Scanner;

public class User implements Department {

    //Prompts the user for input

    private String deptEmail;

    public static Scanner input = new Scanner(System.in);

    public User(String deptEmail) {
        this.deptEmail = deptEmail;
    }

    public User() { // this empty constructor has been placed here in order to call the userPrompt
                    // and depChoice methods

    }

    public static String userPromptOne(String firstName) {
        System.out.println("\nPlease enter your first name:");
        firstName = input.nextLine();
        return ("You have entered: " + firstName + "\n");

    }

    public static String userPromptTwo(String lastName) {
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