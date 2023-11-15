package de.thb.pizzapronto.businessObjects;


import de.thb.pizzapronto.valueObjects.IObserver;

public interface IObservable {
	
	
	public  void attach(IObserver o);
	
	
	public void detach(IObserver o);
	
	
	public void notify(IObservable observable,String msg);
}
