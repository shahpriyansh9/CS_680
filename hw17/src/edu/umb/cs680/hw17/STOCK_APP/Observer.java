package edu.umb.cs680.hw17.STOCK_APP;

public interface Observer<StockEvent> 
{
	public void update(Observable<StockEvent> sender, StockEvent event );
}