package email2;

import java.util.Scanner;

public class PasswordGen extends User {

    private String password;
    private int passwordLength = 8;
    int i;
    Scanner in = new Scanner(System.in);

    public PasswordGen() {
        this.password = ranPassword(passwordLength);
        System.out.println("Temporary Password: " + this.password);

    }

    public String ranPassword(int length) {
        String setpass = "ABCDEFGHIJKLMNOP123456789*&%$#@!";
        char[] password = new char[length];
        for (i = 0; i < length; i++) {
            int random = (int) (Math.random() * setpass.length());
            password[i] = setpass.charAt(random);
        }

        return new String(password);
    }

}