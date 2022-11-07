package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SecurityContextTest {
    User user = new User("User1", "pass1");
    SecurityContext ctx = new SecurityContext(user);
    EncryptedString pass = new EncryptedString("pass1");
     

    public void setup() {
        ctx = new SecurityContext(new User("cs680","cs680"));
    }

    @Test
    public void testLoggedOutState() {
        assertTrue(ctx.getstate() instanceof LoggedOut);
    }
    @Test
    public void instanceofLggedInisnotnull()
    {
        LoggedIn LI = new LoggedIn();
        assertNotNull(LI);
    }
    @Test
    public void instanceofLoggedOutisnotnull()
    {
        LoggedOut LO = new LoggedOut();
        assertNotNull(LO);
    }
    @Test
    public void instanceofEncryptedString()
    {
        EncryptedString ES = new EncryptedString("Priansh");
        assertNotNull(ES);
    }

    
}