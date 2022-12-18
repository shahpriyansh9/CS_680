package edu.umb.cs680.hw12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import edu.umb.cs680.hw12.Car;
import edu.umb.cs680.hw12.MileageComparator;

public class MileageComparatorTest {

	ArrayList<Car> cars = new ArrayList<Car>();

    private void setup() 
	{
        Car car1 = new Car("Toyota", "RAV4", 2020, 15000, 20);
        Car car2 = new Car("Toyota", "RAV4", 2019, 25000, 25);
        Car car3 = new Car("Toyota", "RAV4", 2018, 35000, 30);
        Car car4 = new Car("Toyota", "RAV4", 2017, 45000, 40);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
    }

    @Test
public void MileageComparatorTest1() 
{
    setup();
    Collections.sort(cars, new MileageComparator());
    assertEquals(20, cars.get(0).getMileage());
    assertEquals(25, cars.get(1).getMileage());
    assertEquals(30, cars.get(2).getMileage());
    assertEquals(40, cars.get(3).getMileage());
}

@Test
public void MileageComparatorTest2() 
{
    setup();
    Car car5 = new Car("Toyota", "RAV4", 2016, 55000, 15);
    cars.add(car5);
    Collections.sort(cars, new MileageComparator());
    assertEquals(15, cars.get(0).getMileage());
    assertEquals(20, cars.get(1).getMileage());
    assertEquals(25, cars.get(2).getMileage());
    assertEquals(30, cars.get(3).getMileage());
    assertEquals(40, cars.get(4).getMileage());
}
    
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
    public void verifyMileageComparator_LowToHigh() 
	{
        setup();
        Collections.sort(cars, new MileageComparator());
        assertTrue(cars.get(0).getMileage() < cars.get(1).getMileage());
        assertTrue(cars.get(1).getMileage() < cars.get(2).getMileage());
        assertTrue(cars.get(2).getMileage() < cars.get(3).getMileage());
    }

    @Test
    public void verifyMileageComparator_HighToLow() 
	{
        setup();
        Collections.sort(cars, Collections.reverseOrder(new MileageComparator()));
        assertTrue(cars.get(0).getMileage() > cars.get(1).getMileage());
        assertTrue(cars.get(1).getMileage() > cars.get(2).getMileage());
        assertTrue(cars.get(2).getMileage() > cars.get(3).getMileage());
    }

   
}