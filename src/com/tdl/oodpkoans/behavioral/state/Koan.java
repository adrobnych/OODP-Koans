package com.tdl.oodpkoans.behavioral.state;

/*
 * 
 * The State Pattern allows an object to alter its behavior
 * when its internal state changes. The object will appear to
 * change its class.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
			GumballMachine gumballMachine = 
				new GumballMachine(10);

			COUT.println(gumballMachine.toString());
			assertEquals(___, COUT.getLastLine());

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			COUT.println(gumballMachine.toString());
			assertEquals(___, COUT.getLastLine());

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			COUT.println(gumballMachine.toString());
			assertEquals(___, COUT.getLastLine());

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			COUT.println(gumballMachine.toString());
			assertEquals(___, COUT.getLastLine());

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			COUT.println(gumballMachine.toString());
			assertEquals(___, COUT.getLastLine());

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			COUT.println(gumballMachine.toString());
			assertEquals(___, COUT.getLastLine());
		
	}
}