package email2;

import java.util.Scanner;

public class User implements Department {
    private String firstName;
    private String lastName;
    private String deptEmail;
    Scanner input = new Scanner(System.in);

    public User(String deptEmail) { // this paramerterized constructor is used for the ArrayList of objects in my
                                    // main class
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptEmail = deptEmail;
    }

    public User() { // this empty constructor has been placed here in order to call the userPrompt
                    // and depChoice methods

    }

    public void userPrompt() {
        System.out.println("Please enter your first name:");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name:");
        String lastName = input.nextLine();
        System.out.println("You have entered: " + firstName + " " + lastName+"\n");

    }

    public void depOperation() {
        System.out.println("Choose your Department: \n1: Sales\n2: Help Desk\n3: Operations\n");

    }

    public String depChoice(int choice) {
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Department: Sales");
        } else if (choice == 2) {
            System.out.println("Department: Help Desk");
        } else if (choice == 3) {
            System.out.println("Department: Operations");
        } else {

        }
        return "Department: ";

    }

}