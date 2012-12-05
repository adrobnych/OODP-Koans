package com.tdl.oodpkoans.behavioral.template_method;

/*
 * 
 * The Template Method Pattern defi nes the skeleton
 * of an algorithm in a method, deferring some steps to
 * subclasses. Template Method lets subclasses redefi ne
 * certain steps of an algorithm without changing the
 * algorithm’s structure.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		COUT.println("\nMaking tea...");
		tea.prepareRecipe();
		assertEquals(___, COUT.getLastLines(5));
 
		COUT.println("\nMaking coffee...");
		coffee.prepareRecipe();
		assertEquals(___, COUT.getLastLines(5));
	}
}