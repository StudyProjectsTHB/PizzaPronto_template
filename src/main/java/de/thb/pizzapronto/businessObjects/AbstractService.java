package de.thb.pizzapronto.businessObjects;


public abstract class AbstractService implements IService {
	private String serviceName;

	@Override
	public String getServiceName() {
		return serviceName;
	}
	
	@Override
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	
}
