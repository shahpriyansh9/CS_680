package edu.umb.cs680.hw13.fs;

import java.util.Comparator;

public class ReverseAlphabeticalComparator implements Comparator<FSElement>
{

    public int compare(FSElement E1, FSElement E2) 
    {
        return E2.getName().compareTo(E1.getName());
    }
    
}
