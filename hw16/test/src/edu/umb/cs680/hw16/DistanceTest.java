package edu.umb.cs680.hw16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class DistanceTest 
{
    @Test
	public void testDistanceManhattan() 
    {
			
		List<Double> p1 = Arrays.asList(1.0, 2.0, 3.0);
		List<Double> p2 = Arrays.asList(4.0, 5.0, 6.0);
			
		double expectedDistance = 9.0;
			
		DistanceMetric manhattan = (p1L, p2L) -> {
			double sumOfAbsolute = 0.0;
			for(int i=0; i < p1L.size(); i++) {
				sumOfAbsolute += Math.abs( p1L.get(i)-p2L.get(i) );
			}
			return sumOfAbsolute;
		};
			
		double actualDistance = Distance.get(p1, p2, manhattan);
		assertEquals(expectedDistance, actualDistance);
			
	}

    @Test
	public void testMatrixManhattan() 
    {
			
		List<List<Double>> points = new ArrayList<List<Double>>();
		points.add(Arrays.asList(1.0, 2.0, 3.0));
		points.add(Arrays.asList(4.0, 5.0, 6.0));
		points.add(Arrays.asList(7.0, 8.0, 9.0));
		points.add(Arrays.asList(10.0, 11.0, 12.0));
		points.add(Arrays.asList(13.0, 14.0, 15.0));
			
		List<List<Double>> expectedMatrix = new ArrayList<List<Double>>();
		expectedMatrix.add(Arrays.asList( 0.0, 9.0, 18.0, 27.0, 36.0 ));
		expectedMatrix.add(Arrays.asList( 9.0, 0.0, 9.0, 18.0, 27.0 ));
		expectedMatrix.add(Arrays.asList( 18.0, 9.0, 0.0, 9.0, 18.0 ));
		expectedMatrix.add(Arrays.asList( 27.0, 18.0, 9.0, 0.0, 9.0 ));
		expectedMatrix.add(Arrays.asList( 36.0, 27.0, 18.0, 9.0, 0.0 ));
			
		DistanceMetric manhattan = (p1L, p2L) -> {
			double sumOfAbsolute = 0.0;
			for(int i=0; i < p1L.size(); i++) {
				sumOfAbsolute += Math.abs( p1L.get(i)-p2L.get(i) );
			}
			return sumOfAbsolute;
		};
			
		List<List<Double>> actualMatrix = Distance.matrix(points, manhattan);
		assertEquals(expectedMatrix, actualMatrix);
			
	}

    @Test
	public void testDistanceGet() 
    {
		List<Double> p1 = new ArrayList<Double>(Arrays.asList(3.0, 5.0, 7.0));
		List<Double> p2 = new ArrayList<Double>(Arrays.asList(4.0, 6.0, 8.0));
		double expected = Math.sqrt(3);
		double actual = Distance.get(p1, p2);
		assertEquals(expected, actual);
	}

    

    
}
