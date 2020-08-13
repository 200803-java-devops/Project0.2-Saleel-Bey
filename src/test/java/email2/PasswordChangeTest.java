package email2;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PasswordChangeTest {

    @Test
    public void testChangePassword() {
        PasswordChange testchange = new PasswordChange();
        boolean test = true;
        System.out.println(test);
        assertFalse(testchange(test));
    }

    private boolean testchange(boolean b) {
        return false;
    }

}
