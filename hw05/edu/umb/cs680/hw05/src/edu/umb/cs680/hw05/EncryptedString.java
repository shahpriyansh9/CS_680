package edu.umb.cs680.hw05;

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