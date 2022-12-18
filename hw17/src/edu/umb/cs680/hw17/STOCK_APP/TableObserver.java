package edu.umb.cs680.hw17.STOCK_APP;

public class TableObserver 
{
         
    public void update(StockEvent event)
    {
        System.out.println("TableObserver " + "ticker: " + event.getTicker() + " quote: " + event.getQuote());
    }
}