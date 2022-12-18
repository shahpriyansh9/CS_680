package edu.umb.cs680.hw12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class ParetoComparatorTest 
{
    private static Car C1;
	private static Car C2;
	private static Car C3;
	private static LinkedList<Car> usedCars;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
    {
		usedCars = new LinkedList<>();
		C1 = new Car(" Suzuki", "Swift", 2011, 30000, 45);
		C2 = new Car("Honda", "City", 70000, 2010, 55);
		C3 = new Car("Hyundai", "Verna", 90000, 2012, 30);
		usedCars.add(C1);
		usedCars.add(C2);
		usedCars.add(C3);
    }

	
	
	@Test
	public void compareTest1() {
		C1.setDominationCount(usedCars);
		C2.setDominationCount(usedCars);
		C3.setDominationCount(usedCars);
		Collections.sort(usedCars, new ParetoComparator());
		ArrayList<Car> sortedCars = new ArrayList<Car>();
		sortedCars.add(C3);
		sortedCars.add(C1);
		sortedCars.add(C2);
		assertNotEquals(sortedCars, usedCars);
	}
	
	@Test
	public void compareTest2() {
		C1.setDominationCount(usedCars);
		C2.setDominationCount(usedCars);
		C3.setDominationCount(usedCars);
		Collections.sort(usedCars, new ParetoComparator());
		ArrayList<Car> sortedCars = new ArrayList<Car>();
		sortedCars.add(C1);
		sortedCars.add(C2);
		sortedCars.add(C3);
		assertNotEquals(sortedCars, usedCars);
	}
	
    @Test
    public void paretoComparatorTest3() 
    {
        C1.setDominationCount(usedCars);
        C2.setDominationCount(usedCars);
        C3.setDominationCount(usedCars);
        Collections.sort(usedCars, new ParetoComparator());
        ArrayList<Car> cars = new ArrayList<Car>(usedCars);
        assertEquals(C2, cars.get(0));
        assertEquals(C3, cars.get(1));
        assertEquals(C1, cars.get(2));
    }
	
    @Test
    public void verifyDominationCountForC1() 
    {
		C1.setDominationCount(usedCars);
		int actual = C1.getDominationCount();
		int expected = 1;
		assertEquals(expected, actual);
    }
   
    @Test
    public void verifyDominationCountForC2() 
    {
		C2.setDominationCount(usedCars);
		int actual = C2.getDominationCount();
		int expected = 0;
		assertEquals(expected, actual);
    }
    
   
}
