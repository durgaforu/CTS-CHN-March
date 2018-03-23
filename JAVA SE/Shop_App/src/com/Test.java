package com;

import com.biller.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PricematrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item01", "Item02" };

		PriceMatrix priceMatrix=new PricematrixImpl(); // dependency 
		
		
		BillingImpl biller = new BillingImpl();
		biller.setPriceMatrix(priceMatrix);// DI
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);
		
		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
