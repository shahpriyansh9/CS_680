package edu.umb.cs680.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.umb.cs680.hw11.Distance;
import edu.umb.cs680.hw11.Manhattan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EuclideanTest 
{
    Euclidean e = new Euclidean();
	
	List<Double> p1 = Arrays.asList(1.0, 2.0, 3.0);
	List<Double> p2 = Arrays.asList(2.0, 3.0, 4.0);
	List<Double> p3 = Arrays.asList(3.0, 4.0, 5.0);
	List<Double> p4 = Arrays.asList(4.0, 5.0, 6.0);
	List<Double> p5 = Arrays.asList(5.0, 6.0, 7.0);
	
	double expectedDistanceP2P3 = 1.7320508075688772;
	
	@Test
	public void testDistanceP2P3() {
		assertEquals(expectedDistanceP2P3, e.distance(p2, p3));
	}
}
