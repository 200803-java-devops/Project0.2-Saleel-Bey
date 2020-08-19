package email2;



public class PasswordGen extends User {

    private String password;
    private int passwordLength = 8;
    int i;
    //Used to generate a random password that the user can choose to keep

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