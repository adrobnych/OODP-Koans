package com.tdl.oodpkoans.structural.decorator;

/*
 * 
 * The Decorator Pattern attaches additional
 * responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to
 * subclassing for extending functionality.
 * 
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;

public class Koan extends TDLKoan {
	@Test
	public void talk_to_master(){
		Beverage beverage = new Espresso();
		COUT.println(beverage.getDescription() 
				+ " $" + beverage.cost());
		assertEquals(___, COUT.getLastLine());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		COUT.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
		assertEquals(___, COUT.getLastLine());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		COUT.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
		assertEquals(___, COUT.getLastLine());
	}
}
