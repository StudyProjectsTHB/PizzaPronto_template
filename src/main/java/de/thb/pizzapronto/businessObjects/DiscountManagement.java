package de.thb.pizzapronto.businessObjects;


import de.thb.pizzapronto.valueObjects.DiscountVO;

import java.util.ArrayList;
import java.util.List;


public class DiscountManagement extends Observable{

	private List<DiscountVO> discounts;
	
	public DiscountManagement() {
		this.discounts = new ArrayList<DiscountVO>();
	}
	
	
	public void add(DiscountVO d)  {
		discounts.add(d);
		notify(this,"New " + d.getTitle());
	}
	
	public void delete(DiscountVO d)  {
		discounts.remove(d);
		notify(this,"Over " + d.getTitle());
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Discount Overview\n");
		for(int i =0; i< this.discounts.size(); i++) {
			sb.append("***" +this.discounts.get(i).getDiscountInfo() + "\n");
		}
		return sb.toString();
	}


	public List<DiscountVO> getDiscounts() {
		return discounts;
	}


	public void setDiscounts(List<DiscountVO> discounts) {
		this.discounts = discounts;
	}


	
}