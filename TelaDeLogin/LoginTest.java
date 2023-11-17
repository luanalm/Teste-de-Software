public import org.junit.Test; 
import static org.junit.Assert; 

public class LoginTest { 
    @Test 
    public void testSucessfullogin() { 
        Login login = new Login();
        assertTrue(login.login("john", "password123"));
    } 

    @Test 
    public void testFailedLogin() { 
        Login login = new Login();
        assertFalse(login.login("john", "wrongpassword"));
    }

    @Test 
    public void testAddUser() { 
        Login login = new Login();
        login.addUser("testuser", "testpassword");
        assertTrue(login.login("testuser", "testpassword"));
    }
}
