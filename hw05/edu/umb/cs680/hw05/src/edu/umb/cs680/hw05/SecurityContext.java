package edu.umb.cs680.hw05;

public class SecurityContext {
    private State state;
    private User user;
 
    public SecurityContext(User user) {
        this.user = user;
        this.state = new LoggedOut();
    }
 
    public void changeState(State state) {
        this.state = state;
    }
 
    public void login(EncryptedString pass) {
        state.login(pass);
    }
 
    public void logout() {
        state.logout();
    }

    public State getstate(){
        return state;

    }
 
    public boolean isActive() {
        return true;
    }
 
    public User getUser() {
        return user;
    }
}

