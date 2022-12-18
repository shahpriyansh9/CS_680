package edu.umb.cs680.hw17.STOCK_APP;

public class LineChartObserver 
{
    public void update(StockEvent event)
    {
        System.out.println("LineChartObserver " + "ticker: " + event.getTicker() + " quote: " + event.getQuote());
    }
}