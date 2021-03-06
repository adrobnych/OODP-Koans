package com.tdl.oodpkoans.creational.factory_method;

/*
 * 
 * The Factory Method Pattern defi nes an interface
 * for creating an object, but lets subclasses decide which
 * class to instantiate. Factory Method lets a class defer
 * instantiation to subclasses.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		COUT.println("Ethan ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLine());
 
		pizza = chicagoStore.orderPizza("cheese");
		COUT.println("Joel ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLine());

		pizza = nyStore.orderPizza("clam");
		COUT.println("Ethan ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLine());
 
		pizza = chicagoStore.orderPizza("clam");
		COUT.println("Joel ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLine());

		pizza = nyStore.orderPizza("pepperoni");
		COUT.println("Ethan ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLine());
 
		pizza = chicagoStore.orderPizza("pepperoni");
		COUT.println("Joel ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLine());

		pizza = nyStore.orderPizza("veggie");
		COUT.println("Ethan ordered a " + pizza.getName() + "\n");
		assertEquals(___, COUT.getLastLine());
 
		pizza = chicagoStore.orderPizza("veggie");
		COUT.println("Joel ordered a " + pizza.getName() + "\n");	
		assertEquals(___, COUT.getLastLine());
	}
}