package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



import java.util.LinkedList;
public class CarTest 
{
    Car c1 = new Car("Toyota", "RAV4", 2019, 25000, 15000);
    Car c2 = new Car("Toyota", "RAV4", 2018, 24000, 14000);
    Car c3 = new Car("Honda", "CRV", 2018, 23000, 13000);
    Car c4 = new Car("Honda", "CRV", 2017, 22000, 12000);
    LinkedList<Car> cars = new LinkedList<Car>(){
        {add(c1); add(c2); add(c3); add(c4);}
    };
   
    @Test
    public void verifyModel() 
    {
        c3.setDominationCount(cars);
        String expected = "CRV";
        String actual = c3.getModel();
        assertEquals(expected, actual);
    }

    @Test
    public void verifyPrice() 
    {
        c4.setDominationCount(cars);
        float expected = 22000;
        float actual = c4.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void verifyMileage()
    {
        c2.setDominationCount(cars);
        int expected = 14000;
        int actual = c2.getMileage();
        assertEquals(expected, actual);
    }

    @Test
    public void verifyYear()
    {
        c1.setDominationCount(cars);
        int expected = 2019;
        int actual = c1.getYear();
        assertEquals(expected, actual);
    }
    
    


}