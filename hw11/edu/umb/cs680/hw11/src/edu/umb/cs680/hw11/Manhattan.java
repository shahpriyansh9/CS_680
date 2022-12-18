package edu.umb.cs680.hw11;

import java.util.List;

public class Manhattan implements DistanceMetric{
	public double distance(List<Double> p1, List<Double> p2) {
		// TODO Error handling if p1.size() != p2.size()
		double sumOfAbsolute = 0.0;
		for(int i=0; i < p1.size(); i++) {
			sumOfAbsolute += Math.abs( p1.get(i)-p2.get(i) );
		}
		return sumOfAbsolute;		
	}
}