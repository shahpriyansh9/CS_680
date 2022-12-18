package edu.umb.cs680.hw17;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.umb.cs680.hw17.STOCK_APP.Observable;
import edu.umb.cs680.hw17.STOCK_APP.Observer;
import edu.umb.cs680.hw17.STOCK_APP.StockEvent;
import edu.umb.cs680.hw17.STOCK_APP.StockQuoteObservable;

public class StockQuoteObservableTest 
{
        public void checkAddObserverWithLE()
        {
            StockQuoteObservable SQ = new StockQuoteObservable();

            Observer quoteUpdateLineChart = (Observable observable, Object obj) -> 
            {
                System.out.println("LineChartObserver  : " + "ticker: " + ((StockEvent) obj).getTicker() + " quote:" + ((StockEvent) obj).getQuote());
    
            };
         
            
            SQ.addObserver(quoteUpdateLineChart);
            List<String> actual = new LinkedList<String>();
            List<Observer<StockEvent>> Observers = SQ.getObservers();

            for(Observer<StockEvent> element: Observers)
            {
                actual.add(element.getClass().toString());
            }

            List<String> expected = new LinkedList<String>();
            expected.add(quoteUpdateLineChart.getClass().toString());
            assertEquals(expected, actual);
        }


        public void checkRemoveObserverWithLE()
        {
            StockQuoteObservable SQ = new StockQuoteObservable();

            Observer quoteUpdateLineChart = (Observable observable, Object obj) -> 
            {
                System.out.println("LineChartObserver  : " + "ticker: " + ((StockEvent) obj).getTicker() + " quote:" + ((StockEvent) obj).getQuote());
    
            };
            SQ.addObserver(quoteUpdateLineChart);
            SQ.removeObserver(quoteUpdateLineChart);
            List<String> actual = new LinkedList<String>();
            List<Observer<StockEvent>> Observers = SQ.getObservers();

            for(Observer<StockEvent> element: Observers)
            {
                actual.add(element.getClass().toString());
            }

            List<String> expected = new LinkedList<String>();
            assertEquals(expected, actual);
        }

            public void checkUpdateQuote()
            {
                StockQuoteObservable SQ = new StockQuoteObservable();

                Observer quoteUpdateLineChart = (Observable observable, Object obj) -> 
                {
                    System.out.println("LineChartObserver  : " + "ticker: " + ((StockEvent) obj).getTicker() + " quote:" + ((StockEvent) obj).getQuote());
    
                };
                SQ.addObserver(quoteUpdateLineChart);
                SQ.changeQuote("ABC", 20.5);
                Map<String, Double> expected = new HashMap<String, Double>();
                expected.put("ABC", 20.5);
                Map<String, Double> actual = SQ.getTickerMap();
                assertEquals(expected, actual);
            }



    
}
