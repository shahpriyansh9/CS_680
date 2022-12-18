package edu.umb.cs680.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.umb.cs680.hw11.Distance;
import edu.umb.cs680.hw11.Manhattan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManhattanTest 
{
	
	@Test
	public void ManhattanDistanceTest() 
    {
		DistanceMetric metric = new Manhattan();
		List<Double> point1 = Arrays.asList(1.0, 2.0, 3.0);
		List<Double> point2 = Arrays.asList(2.0, 3.0, 4.0);
		
		assertEquals(3.0, metric.distance(point1, point2));
	}
	
	
}