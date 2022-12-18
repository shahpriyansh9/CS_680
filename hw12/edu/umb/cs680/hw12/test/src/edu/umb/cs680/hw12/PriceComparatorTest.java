package edu.umb.cs680.hw12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PriceComparatorTest 
{
    Car car1 = new Car("Toyota", "RAV4", 2018, 20_000, 15_000);
    Car car2 = new Car("Toyota", "Camry", 2019, 30_000, 20_000);
    Car car3 = new Car("Toyota", "Corolla", 2017, 10_000, 25_000);
    Car car4 = new Car("Toyota", "Highlander", 2020, 40_000, 10_000);
    ArrayList<Car> cars = new ArrayList<Car>();

    @Test
    public void verifyPriceComparator() 
    {
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        ArrayList<Car> expected = new ArrayList<Car>();
        expected.add(car3);
        expected.add(car1);
        expected.add(car2);
        expected.add(car4);
        Collections.sort(cars, new PriceComparator());
        assertArrayEquals(expected.toArray(), cars.toArray());
    }
    
          
    
    @Test
    public void verifyPriceComparatorForMultipleCars() 
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("BMW", "X5", 2016, 36000, 20);
        Car car2 = new Car("Toyota", "RAV4", 2015, 28000, 25);
        Car car3 = new Car("Toyota", "RAV4", 2017, 30000, 35);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        Collections.sort(cars, new PriceComparator());
        assertEquals(28000.0, cars.get(0).getPrice());
        assertEquals(30000.0, cars.get(1).getPrice());
        assertEquals(36000.0, cars.get(2).getPrice());
    }
    
    @Test
    public void verifyPriceComparatorForSamePriceCars() 
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("BMW", "X5", 2016, 36000, 25);
        Car car2 = new Car("Toyota", "RAV4", 2015, 36000, 40);
        cars.add(car1);
        cars.add(car2);
        Collections.sort(cars, new PriceComparator());
        assertEquals(36000.0, cars.get(0).getPrice());
        assertEquals(36000.0, cars.get(1).getPrice());
    }
    
    @Test
    public void verifyPriceComparatorForSameCar() 
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("BMW", "X5", 2016, 45000, 35);
        Car car2 = new Car("BMW", "X5", 2016, 45000, 20);
        cars.add(car1);
        cars.add(car2);
        Collections.sort(cars, new PriceComparator());
        assertEquals(45000.0, cars.get(0).getPrice());
        assertEquals(45000.0, cars.get(1).getPrice());
    }
    
    
}
