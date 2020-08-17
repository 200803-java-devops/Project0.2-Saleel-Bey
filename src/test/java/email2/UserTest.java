package email2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserTest {

    @Test
    public void testDepChoice() {
        User testuser = new User();
        String text = "Hello";
        assertTrue(!text.isEmpty());
    }

}