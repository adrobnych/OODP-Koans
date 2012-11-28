package com.tdl.oodpkoans.behavioral.strategy;

import com.tdl.oodpkoans.COUT;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	 
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		COUT.println("All ducks float, even decoys!");
	}
}
