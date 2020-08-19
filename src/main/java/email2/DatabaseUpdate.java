package email2;

public class DatabaseUpdate implements Runnable, java.lang.Runnable {
//Concurrency method
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("A new user has been added to the Global Address List...");
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.err.println("Global address list has ceased to update.");
        }
    }

}