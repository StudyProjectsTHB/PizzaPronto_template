package de.thb.pizzapronto.controller;

import de.thb.pizzapronto.businessObjects.exceptions.NoCustomerException;
import de.thb.pizzapronto.businessObjects.exceptions.NoOrderException;
import de.thb.pizzapronto.valueObjects.CustomerVO;
import de.thb.pizzapronto.valueObjects.DishVO;
import de.thb.pizzapronto.valueObjects.OrderVO;

import java.util.List;

public interface IOrdering {
	
	public OrderVO startNewOrder(CustomerVO customer) throws NullPointerException;
	
	public void addDish(DishVO dish) throws NoOrderException, IllegalStateException ;
	
	public void deleteDish(DishVO dish) throws NoOrderException, IllegalStateException ;
	
	public float calculateTotalPrice() throws NoOrderException ;
	
	public void confirmOrder() throws NoOrderException, NoCustomerException, IllegalStateException ;
	
	public List<DishVO> sortShoppingBasket() throws NoOrderException;
	
	public List<DishVO> sortShoppingBasketByNumber() throws NoOrderException;
	
	public List<DishVO> sortShoppingBasketByPrice() throws NoOrderException ;

}
