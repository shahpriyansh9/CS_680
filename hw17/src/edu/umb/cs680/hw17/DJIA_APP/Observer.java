package edu.umb.cs680.hw17.DJIA_APP;

public interface Observer<Double> 
{
	public void update(Observable<Double> sender, Double event);
}