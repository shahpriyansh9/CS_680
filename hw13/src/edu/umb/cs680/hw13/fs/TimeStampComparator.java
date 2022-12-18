package edu.umb.cs680.hw13.fs;

import java.util.Comparator;

public class TimeStampComparator implements Comparator<FSElement> 
{

    @Override
    public int compare(FSElement E1, FSElement E2) {
        return E2.creationTime.compareTo(E1.creationTime);
    }
    
}
