package edu.umb.cs680.hw12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class YearComparatorTest 
{
    private LinkedList<Car> carList = new LinkedList<Car>();
  
  
   
{
    Car car1 = new Car("Toyota", "Camry", 2017, 24000, 15000);
    Car car2 = new Car("Honda", "Accord", 2018, 28000, 10000);
    Car car3 = new Car("Nissan", "Altima", 2019, 26000, 12000);
    carList.add(car1);
    carList.add(car2);
    carList.add(car3);
}
  
  @Test
  public void verifyYearComparator0() 
{
    carList.forEach(car -> car.setDominationCount(carList));
    Collections.sort(carList, new YearComparator());
    assertEquals(2019, carList.get(0).getYear());
    assertEquals(2018, carList.get(1).getYear());
    assertEquals(2017, carList.get(2).getYear());
}

@Test
public void verifyYearComparatorAscending() 
{
    Collections.sort(carList, new YearComparator());
    int[] expectedYear = {2019, 2018, 2017};
    int[] actualYear = new int[3];
    int i = 0;
    for (Car car : carList) {
      actualYear[i] = car.getYear();
      i++;
    }
    assertArrayEquals(expectedYear, actualYear);
}


  
@Test
public void verifyYearComparator() 
{
    YearComparator yc = new YearComparator();
    Collections.sort(carList, yc);
    ArrayList<Integer> expectedYears = new ArrayList<Integer>();
    expectedYears.add(2019);
    expectedYears.add(2018);
    expectedYears.add(2017);
    ArrayList<Integer> actualYears = new ArrayList<Integer>();
    for (Car car : carList) 
    {
      actualYears.add(car.getYear());
    }
    assertArrayEquals(expectedYears.toArray(), actualYears.toArray());
}
  
  
  @Test
    public void testYearComparator() 
    {
        Car car1 = new Car("Toyota", "RAV4", 2017, 32000, 30);
        Car car2 = new Car("Toyota", "RAV4", 2019, 42000, 35);
        Car car3 = new Car("Honda", "Civic", 2017, 22000, 40);
        Car car4 = new Car("Honda", "Civic", 2020, 52000, 35);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars, new YearComparator());
        assertEquals(2020, cars.get(0).getYear());
        assertEquals(2019, cars.get(1).getYear());
        assertEquals(2017, cars.get(2).getYear());
        assertEquals(2017, cars.get(3).getYear());
    }


 

}
