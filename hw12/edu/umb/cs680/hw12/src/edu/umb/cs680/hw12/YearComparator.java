package edu.umb.cs680.hw12;

import java.util.Comparator;

public class YearComparator implements Comparator<Car>
{

   
    public int compare(Car C1, Car C2) 
    {
        return C2.getYear() - C1.getYear();
    }
    
}
