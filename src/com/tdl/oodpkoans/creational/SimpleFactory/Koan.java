package com.tdl.oodpkoans.creational.SimpleFactory;

/*
 * 
 * The Simple Factory isn’t actually a Design Pattern; it’s more of a programming idiom.
 * It's all about non-constructor creation of objects. Typical examples: population control 
 * or mandatory wrapping of infant objects with some wrappers or there are many similar classes
 * and we have "wet" code.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		COUT.println("We ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLines(2));
 
		pizza = store.orderPizza("veggie");
		COUT.println("We ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLines(2));
	}
}