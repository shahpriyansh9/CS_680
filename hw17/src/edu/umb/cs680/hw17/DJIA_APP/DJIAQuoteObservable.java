package edu.umb.cs680.hw17.DJIA_APP;

public class DJIAQuoteObservable extends Observable
{
    private double quote;

    public void changeQuote(double q)
    {
        quote = q;
        notifyObservers(Double.valueOf(this.quote));
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