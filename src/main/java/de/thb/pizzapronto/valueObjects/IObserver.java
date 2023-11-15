package de.thb.pizzapronto.valueObjects;

import de.thb.pizzapronto.businessObjects.IObservable;

public interface IObserver {
	
	public abstract void update(IObservable observable, String o);

}
