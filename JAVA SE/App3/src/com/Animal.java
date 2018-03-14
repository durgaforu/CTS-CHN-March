package com;

import java.io.FileInputStream;

public class Animal {

	private int animalId;
	private String animalName;

// default constructor
	public Animal() {
		// load all images here
		System.out.println("-- Animal default constructor got called with hash code " + this.hashCode());
	}
	
	// Parameterized constructor
	
	public Animal(int animalId) {
		this.animalId=animalId;
	}
	

	void f1() {
		// use loded images here
	}

	public static void main(String[] args) {
		

		Animal cat=new Animal();
		
		
	
		
		System.out.println("--- Done ---");
	}

}
