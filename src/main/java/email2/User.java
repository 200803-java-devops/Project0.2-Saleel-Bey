package email2;

import java.util.Scanner;

public class User implements Department {
    private String deptEmail;
    private String firstName;
    private String lastName;
    private String dept;
    
  //ADD ALL GETTERS AND SETTERS HERE FOR THE VARIABLES ABOVE

    
    public User(String deptEmail) {
        this.deptEmail = deptEmail;
    }
    
    

    public User() { // this empty constructor has been placed here in order to call the userPrompt
                    // and depChoice methods
    }
    
    


}