package edu.umb.cs680.hw05;

public class LoggedIn implements State {
    SecurityContext ctx;
    @Override
    public void login(EncryptedString pass) {
        if (!ctx.isActive()) {
            ctx.changeState(new LoggedOut());
            ctx.login(pass);
        }
        else{
            //auth error handling;
        };
    }
 
    @Override
    public void logout() {
        ctx.changeState(new LoggedOut());
    }
 
    
    
}