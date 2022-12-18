package edu.umb.cs680.hw17.STOCK_APP;

public class StockEvent 
{
    private String ticker;
    private double quote;

    StockEvent(String ticker, double quote)
    {
        this.ticker = ticker;
        this.quote = quote;

    }

    public String getTicker()
    {
        return this.ticker;
    }

    public double getQuote()
    {
        return this.quote;
    }

    public void setTicker(String newTicker)
    {
        this.ticker = newTicker;
    }
    
    public void setQuote(double newQuote)
    {
        this.quote = newQuote;
    }
}