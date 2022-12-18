package edu.umb.cs680.hw17.DJIA_APP;

public class LineChartObserver 
{
    public void update(Double event)
    {
        System.out.println("LineChart Observer:" + event.toString());   
    }
    
}
