package edu.umb.cs680.hw11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import edu.umb.cs680.hw11.Distance;
import edu.umb.cs680.hw11.Manhattan;
import edu.umb.cs680.hw11.Euclidean;
import edu.umb.cs680.hw11.Chebyshev;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistanceTest 
{
    private static List<Double> p1, p2, p3, p4, p5;
	private static List<List<Double>> pointsList = new LinkedList<>();

    @BeforeAll
	static void setUpBeforeClass() throws Exception {
		p1 = Arrays.asList(4.0, 5.0, 6.0);
		p2 = Arrays.asList(2.0, 5.0, 6.0);
		p3 = Arrays.asList(3.0, 4.0, 8.0);
		p4 = Arrays.asList(2.0, 2.0, 1.0);
		p5 = Arrays.asList(7.0, 5.0, 6.0);
		pointsList.add(p1);
		pointsList.add(p2);
		pointsList.add(p3);
		pointsList.add(p4);
		pointsList.add(p5);
	}

	@Test
	public void TestGetP1P2() {
		double expected = Math.sqrt(4.0);
		double actual = Distance.get(p1, p2);
		assertEquals(expected, actual);
	}

	@Test
	public void VerifygetP1P2AndEuclidean() {
		double expected = Math.sqrt(4.0);
		double actual = Distance.get(p1, p2, new Euclidean());
		assertEquals(expected, actual);
	}

	@Test
	public void VerifygetP1P2AndManhattan() {
		double expected = 2.0;
		double actual = Distance.get(p1, p2, new Manhattan());
		assertEquals(expected, actual);
	}

	@Test
	public void VerifygetP1P2AndChebyshev() {
		double expected = 2.0;
		double actual = Distance.get(p1, p2, new Chebyshev());
		assertEquals(expected, actual);
	}

    
	

	
	

	
	
   
	

    
    
    

    


   


}
