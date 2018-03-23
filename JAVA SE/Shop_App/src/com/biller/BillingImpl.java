package com.biller;

import com.pricematrix.PriceMatrix;

// Dependent
public class BillingImpl {

	private PriceMatrix priceMatrix;
	
	public void setPriceMatrix(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/*
	 * Issues -------- 1. too many dependency obj creations -> application per goes
	 * down
	 * 
	 * Why this issue happened? --------------------------- -> creating dependecy
	 * obj in the dependent class. SOlutin -------- -> Do not create dependencies in
	 * the dependent classes
	 * 
	 * -> Insted of creating, search in some repositaries using JNDI
	 * 
	 * -> issues with JNDI-> JNDI location is tightly binded with java obj
	 * 
	 * Best Solution --------------- -> Do not create, or do not search. insted ask
	 * some one (IOC) -> DI (Dependecy Injection) -> Injecting Dependecy to a
	 * Dependent obj
	 * 
	 * 
	 * 
	 */

	

	public double getCartTotal(String[] cart) {

		// PricematrixImpl priceMatrix = new PricematrixImpl();

		double total = 0.0;

		for (String itemCode : cart) {
			total = total + priceMatrix.getItemPrice(itemCode);
		}

		return total;

	}

}
