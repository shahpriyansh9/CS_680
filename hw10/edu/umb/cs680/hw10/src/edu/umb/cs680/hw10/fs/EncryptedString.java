package edu.umb.cs680.hw10.fs;

public class EncryptedString
{
    private static String pass;
    EncryptedString(String CipherString)
    {
        EncryptedString.pass = CipherString;
    }
    public String getPass()
    {
        return pass;
    }
}