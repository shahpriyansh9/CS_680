package edu.umb.cs680.hw05;

public class LoggedOut implements State {
    
    SecurityContext ctx;

    @Override
    public void login( EncryptedString pass) {
        if (Authenticator.authenticate()) {
            ctx.changeState(new LoggedIn());
        } else {
            // auth error handling
        }
    }
 
    @Override
    public void logout() {
        
    }
 

   
}