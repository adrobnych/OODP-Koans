package com.tdl.oodpkoans.behavioral.strategy;

/*
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it. 
 */

import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;

class RibbonDuck extends Duck {
	public RibbonDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		COUT.println("I'm a yellow ribbon duck");
	}
}

class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		COUT.println("I'm a model duck");
	}
}

public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		Duck rd = new RibbonDuck();
		rd.performQuack();
		assertEquals(___, COUT.getLastLine());
		rd.performFly();
		assertEquals(___, COUT.getLastLine());
		
		Duck model = new ModelDuck();
		model.performQuack();
		assertEquals(___, COUT.getLastLine());		
		model.performFly();
		assertEquals(___, COUT.getLastLine());
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		assertEquals(___, COUT.getLastLine());
	}
}
