package email2;


public class Prompter {

    

    public User userPromptOne(User user) { 
		// to the database
		System.out.println("\nPlease enter your first name:");
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		System.out.println("You have entered: " + firstName + "\n");
		user.setFirstName(firstName); //THIS IS A SETTER THAT WOULD HAVE TO BE CREATED, SAME FOR THE SETTERS IN THE OTHER PROMPTS
		closeResources();
		return user;	
	}
    
	
	public User userPromptTwo(User user) { // Both user prompts were originally a combined method
		System.out.println("Please enter your last name:");
		Scanner input = new Scanner(System.in);
		String lastName = input.nextLine();
		System.out.println("You have entered: " + lastName + "\n");
		user.setLastName(lastName);
		closeResources();
		return user;
	}
	
	
	public User userPromptThree(User user) {
		System.out.println("Please enter your Department: \nSales\nHelp Desk\nOperations\n");
		Scanner input = new Scanner(System.in);
		String dept = input.nextLine().toUpperCase();
		
		if (dept.equals("SALES")) {
			System.out.println("Department: Sales\n");
			user.setDept("Sales");
		} else if (dept.equals("HELP DESK")) {
			System.out.println("Department: Help Desk\n");
			user.setDept("Help Desk");
		} else if (dept.equals("OPERATIONS")) {
			System.out.println("Department: Operations\n");
			user.setDept("Operations");
		} else {
			System.out.println("Unrecognized keyword.");
			//You would need logic to then loop back to prompt them again so they could type the right keyword.  A switch statement might be better than this big if/else block.
		}
		
		closeResources();
		return user;
	
	}
	
	
	//Scanners ought to be closed when you are finished with them.  You should be able to just call this to close the scanner in the above methods.
	public  void closeResources() { 
		input.close(); 
	}
}