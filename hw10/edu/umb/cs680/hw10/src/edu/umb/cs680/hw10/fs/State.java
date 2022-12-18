package edu.umb.cs680.hw10.fs;

public interface State {
    void login(EncryptedString pass);
 
    void logout();
 
    
}