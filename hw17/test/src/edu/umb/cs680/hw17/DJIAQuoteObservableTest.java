package edu.umb.cs680.hw17;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw17.DJIA_APP.DJIAQuoteObservable;
import edu.umb.cs680.hw17.DJIA_APP.LineChartObserver;
import edu.umb.cs680.hw17.DJIA_APP.Observable;
import edu.umb.cs680.hw17.DJIA_APP.Observer;
import edu.umb.cs680.hw17.DJIA_APP.TableObserver;
import edu.umb.cs680.hw17.DJIA_APP.ThreeDObserver;

public class DJIAQuoteObservableTest 
{
       

    @Test
    public void testDJIAQuoteObservable() 
    {
        System.out.println("DJIAQuoteObservableTest");
        DJIAQuoteObservable subject = new DJIAQuoteObservable();
        LineChartObserver lineChartObserver = new LineChartObserver();
        TableObserver tableObserver = new TableObserver();
        ThreeDObserver threeDObserver = new ThreeDObserver();
        subject.addObserver(lineChartObserver);
        subject.addObserver(tableObserver);
        subject.addObserver(threeDObserver);
        subject.changeQuote(5.5);
        subject.changeQuote(10.5);
        subject.changeQuote(15.5);
    }
    
    @Test
    public void verifyDJIAQuoteObservable()
    {
        DJIAQuoteObservable observable = new DJIAQuoteObservable();

        LineChartObserver lineChartObserver = new LineChartObserver();
        TableObserver tableObserver = new TableObserver();
        ThreeDObserver threeDObserver = new ThreeDObserver();

        observable.addObserver(lineChartObserver);
        observable.addObserver(tableObserver);
        observable.addObserver(threeDObserver);

        observable.changeQuote(1000.0);

        observable.clearObservers();

        assertEquals(observable.countObservers(), 0);
    }

    @Test
    public void testChangeQuote()
    {
        DJIAQuoteObservable dqo = new DJIAQuoteObservable();
        dqo.addObserver(new LineChartObserver());
        dqo.addObserver(new TableObserver());
        dqo.addObserver(new ThreeDObserver());
        dqo.changeQuote(1000);
    }

    public static void main(String[] args) 
    {
        DJIAQuoteObservable observable = new DJIAQuoteObservable();
        LineChartObserver lineChartObserver = new LineChartObserver();
        TableObserver tableObserver = new TableObserver();
        ThreeDObserver threeDObserver = new ThreeDObserver();
        observable.addObserver(lineChartObserver);
        observable.addObserver(tableObserver);
        observable.addObserver(threeDObserver);
        observable.changeQuote(5.5);
        observable.changeQuote(10.5);
        observable.changeQuote(15.5);
    }

    
    public void checkAddObserverWithLE()
    {
    DJIAQuoteObservable DQ = new DJIAQuoteObservable();

    Observer quoteUpdateLineChart = (Observable Sender, Object event) -> {System.out.println(" LineChartObserver:" +  Sender + "Event:" + event);};

    DQ.addObserver(quoteUpdateLineChart);

    if(DQ.getObservers().contains(quoteUpdateLineChart))
    {
        System.out.println("LE Observer Added successfully");
    }

    }
    
    public void checkRemoveObserverWithLE()
	{
		DJIAQuoteObservable DQ = new DJIAQuoteObservable();
		Observer quoteUpdateLineChart = (Observable Sender, Object event) -> {System.out.println(" LineChartObserver:" +  Sender + "Event:" + event);};
		DQ.addObserver(quoteUpdateLineChart);
		DQ.removeObserver(quoteUpdateLineChart);
		
		if(DQ.getObservers().contains(quoteUpdateLineChart))
		{
			System.out.println("Test failed: Observer was not removed");
		}
		else
		{
			System.out.println("Test passed: Observer was removed");
		}
	}


    

}
