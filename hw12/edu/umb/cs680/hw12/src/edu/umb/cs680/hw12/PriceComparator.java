package edu.umb.cs680.hw12;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car>
{

    
    public int compare(Car C1, Car C2) 
    {
        return (int) (C1.getPrice() - C2.getPrice());
    }
        
}
