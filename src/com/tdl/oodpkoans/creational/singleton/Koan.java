package com.tdl.oodpkoans.creational.singleton;

/*
 * 
 * The Singleton Pattern ensures a class has only one
 * instance, and provides a global point of access to it.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		assertEquals(___, COUT.getLastLines(3));
	}
}