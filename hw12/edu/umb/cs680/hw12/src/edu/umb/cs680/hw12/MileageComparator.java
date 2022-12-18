package edu.umb.cs680.hw12;

import java.util.Comparator;

public class MileageComparator implements Comparator<Car>
{
    public int compare(Car C1, Car C2)
    {
        return C1.getMileage() - C2.getMileage();
    }
    
}
