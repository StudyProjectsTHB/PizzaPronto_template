package de.thb.pizzapronto.controller;

import de.thb.pizzapronto.businessObjects.Delivery;
import de.thb.pizzapronto.businessObjects.IService;
import de.thb.pizzapronto.businessObjects.Kitchen;
import de.thb.pizzapronto.valueObjects.ChefVO;
import de.thb.pizzapronto.valueObjects.DeliveryManVO;
import de.thb.pizzapronto.valueObjects.EmployeeVO;

public class EmployeeFactory implements IEmployeeFactory {

	@Override
	public EmployeeVO create(String pNo, String lastName, String firstName, IService service) throws IllegalArgumentException{
		EmployeeVO newEmployee = null;

		if (service instanceof Kitchen) {
			newEmployee = new ChefVO(pNo, lastName, firstName, service);
		} else {
			if (service instanceof Delivery) {

				newEmployee = new DeliveryManVO(pNo, lastName, firstName, service);
			} else {
				throw new IllegalArgumentException("Wrong service.");
			}
		}
		return newEmployee;
	}

}
