package com.tdl.oodpkoans.behavioral.iterator;

/*
 * 
 * The Iterator Pattern provides a way to
 * access the elements of an aggregate object
 * sequentially without exposing its underlying
 * representation.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 
		waitress.printMenu();
		assertEquals(___, COUT.getLastLines(4));
		waitress.printVegetarianMenu();
		assertEquals(___, COUT.getLastLines(9));

		COUT.println("\nCustomer asks, is the Hotdog vegetarian?");
		COUT.println("Waitress says: ");
		if (waitress.isItemVegetarian("Hotdog")) {
			COUT.println("Yes");
		} else {
			COUT.println("No");
		}
		assertEquals(___, COUT.getLastLine());
		
		COUT.println("\nCustomer asks, are the Waffles vegetarian?");
		COUT.println("Waitress says: ");
		if (waitress.isItemVegetarian("Waffles")) {
			COUT.println("Yes");
		} else {
			COUT.println("No");
		}
		assertEquals(___, COUT.getLastLine());
	}
}