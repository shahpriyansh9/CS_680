package edu.umb.cs680.hw13.fs;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<FSElement>
{

    public int compare(FSElement E1, FSElement E2) 
    {
        return E1.getName().compareTo(E2.getName());
    }
    
}
