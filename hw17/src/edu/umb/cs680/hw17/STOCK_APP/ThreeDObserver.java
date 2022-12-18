package edu.umb.cs680.hw17.STOCK_APP;

public class ThreeDObserver 
{
    public void update(StockEvent event)
    {
        System.out.println("ThreeDObserver " + "ticker: " + event.getTicker() + " quote: " + event.getQuote());
    }
}