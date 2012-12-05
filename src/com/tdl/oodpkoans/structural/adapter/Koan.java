package com.tdl.oodpkoans.structural.adapter;

/*
 * 
 * The Adapter Pattern converts the interface of a class
 * into another interface the clients expect. Adapter lets
 * classes work together that couldn’t otherwise because of
 * incompatible interfaces.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master_about_ducks(){
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		COUT.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		assertEquals(___, COUT.getLastLines(3));

		COUT.println("\nThe Duck says...");
		testDuck(duck);
		assertEquals(___, COUT.getLastLines(3));

		COUT.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		assertEquals(___, COUT.getLastLines(3));
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	@Test
	public void talk_to_master_about_turkeys(){
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			COUT.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
			assertEquals(___, COUT.getLastLines(3));
		}
	}
}