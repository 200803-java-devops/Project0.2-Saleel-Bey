package email2;

import java.util.*;
import email2.Prompter;

public class Manager {
	
	public void interact() {
	    ArrayList<String> users = new ArrayList<String>();
	    users.add("yourname.sales@revature.com");
	    users.add("yourname.helpdesk@revature.com");
	    users.add("yourname.operations@revature.com\n");
	
	    System.out.println("Your email creation will be for the following options: \n");
	    int elements = users.size();
	    for (int i = 0; i < elements; i++) {
	        System.out.println(users.get(i));
	
	    }
	    
	    Prompter prompter = new Prompter();
	    User user = new User();
	    //I'm creating a new User here, and I added some variables that each User can have.  What follows is us passing down that new user to each prompt to fill in those variables.
	    prompter.userPromptOne(user);
	    prompter.userPromptTwo(user);
	    prompter.userPromptThree(user);
	    System.out.println("A new user profile has been created.  Your info on file is: " + user.getFirstName() + " " + user.getLastName() + " " + user.getDept());
	    //You could upload user info to DB here if needed or continue.
	    
	    //Due to time constraints I will not adjust what you have for creating a password, so everything below here is untouched.
	    
	    PasswordGen generate = new PasswordGen();
	    generate.ranPassword(8);
	
	    PasswordChange changepass = new PasswordChange();
	    changepass.changePassword();
	
	    System.out.println("Your email account has been created.");
	    
	    //You could create a loop here too where it would ask "Do you want to create another email?"  or something and just loop through this again.  Not necessary though.
	}

}