package de.thb.pizzapronto.businessObjects;

import de.thb.pizzapronto.businessObjects.exceptions.NoCustomerException;
import de.thb.pizzapronto.businessObjects.exceptions.NotEnoughTimeException;
import de.thb.pizzapronto.valueObjects.EmployeeVO;
import de.thb.pizzapronto.valueObjects.OrderVO;

public interface IService {
	public String startService(OrderVO order) throws NoCustomerException, IllegalStateException, NullPointerException, NotEnoughTimeException;
	public void addEmployee(EmployeeVO employee);
	public void removeEmployee(EmployeeVO employee);
	public void removeEmployee(String persNr);
	public String getServiceName();
	public void setServiceName(String serviceName);
}
