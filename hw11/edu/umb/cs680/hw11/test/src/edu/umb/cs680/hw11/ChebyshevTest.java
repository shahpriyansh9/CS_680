package edu.umb.cs680.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.umb.cs680.hw11.Distance;
import edu.umb.cs680.hw11.Manhattan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChebyshevTest 
{
    @Test
	void testChebyshevDistance() {
		
		List<Double> point1 = new ArrayList<Double>();
		point1.add(2.0);
		point1.add(3.0);
		point1.add(4.0);
		
		List<Double> point2 = new ArrayList<Double>();
		point2.add(5.0);
		point2.add(6.0);
		point2.add(7.0);
		
		Chebyshev chebyshev = new Chebyshev();
		
		assertEquals(3.0, chebyshev.distance(point1, point2));
	}

    
}
