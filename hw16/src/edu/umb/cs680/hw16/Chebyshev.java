package edu.umb.cs680.hw16;

import java.util.List;

public class Chebyshev implements DistanceMetric
{
	public double distance(List<Double> p1, List<Double> p2) 
	{
		// TODO Error handling if p1.size() != p2.size()
		double maxDistance = 0.0;
		for(int i=0; i < p1.size(); i++) 
		{
			double distance = Math.abs( p1.get(i)-p2.get(i) );
			if(distance > maxDistance) 
			{
				maxDistance = distance;
			}
		}
		return maxDistance;		
	}
}
