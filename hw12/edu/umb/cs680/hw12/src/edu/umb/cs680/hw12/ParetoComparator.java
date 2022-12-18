package edu.umb.cs680.hw12;

import java.util.Comparator;

public class ParetoComparator implements Comparator<Car>
{
    public int compare(Car C1, Car C2)
    {
        return C1.getDominationCount() - C2.getDominationCount();
    }
    
}
