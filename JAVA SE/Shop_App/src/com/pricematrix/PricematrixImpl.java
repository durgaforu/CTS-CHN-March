package com.pricematrix;
// Dependency
public class PricematrixImpl implements PriceMatrix {
	
	public PricematrixImpl() {
		System.out.println("-- priceMatricxImpl obj created");
	}

	@Override
	public double getItemPrice(String itemCode) {

		// code to connect to DB and fetch price of an item

		return 100.00;

	}

}
