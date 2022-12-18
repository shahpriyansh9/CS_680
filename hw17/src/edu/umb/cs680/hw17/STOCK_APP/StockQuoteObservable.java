package edu.umb.cs680.hw17.STOCK_APP;

import java.util.HashMap;
import java.util.Map;

public class StockQuoteObservable extends Observable
{
    private Map<String, Double> tickerMap = new HashMap<>();

    public void changeQuote(String t, double q)
    {
        tickerMap.put(t, q);
        notifyObservers(new StockEvent(t, q));
    }

    public Map<String, Double> getTickerMap()
    {
        return tickerMap;
    }

    public void addObserver(TableObserver tObserver) {
    }

    public void addObserver(LineChartObserver lcObserver) {
    }

    public void addObserver(ThreeDObserver tdObserver) {
    }

    public Integer getQuote() {
        return null;
    }
}