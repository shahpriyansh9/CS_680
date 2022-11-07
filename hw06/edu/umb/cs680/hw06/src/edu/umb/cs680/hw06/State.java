package edu.umb.cs680.hw06;

public interface State {
    void login(EncryptedString pass);
 
    void logout();
 
    
}