package com.tdl.badcode;

abstract class Duck{                                        // we need this base class for polymorphic actions
	
	public void quack(){
		System.out.println("Default Quack");                // we need polymorphic calls to quack()
	}
	public void fly(){
		System.out.println("Default Fly");                  // we need polymorphic calls to fly()
	}
	
	public void getLocation(){
		System.out.println("My location is beautiful lake");
	}
}


class MallardDuck extends Duck{
	public void quack(){
		System.out.println("Quack Quack");
	}
	public void fly(){
		System.out.println("fly..............");
	}	
}

class RibbonDuck extends Duck{
	public void quack(){
		System.out.println("Squick");
	}	
	
	// no fly ability! notice this!
}

class DivingDuck extends Duck{
	public void quack(){
		System.out.println("Quack Quack");               // Hmmm. The same as for MallardDuck! don't DRY!
	}
	public void fly(){
		System.out.println("fly..............");
	}	
}

class GoldenEyeDuck extends Duck{
	public void quack(){
		System.out.println("Quack Quack");               // Hmmm. The same as for MallardDuck! don't DRY!
	}
	public void fly(){
		System.out.println("fly..............");
	}	
}

public class DuckNeedsStrategy{
	public static void main(String[] args){
		Duck d = new RibbonDuck();
		d.fly();
		// but ribbon duck can't fly!
		d = new GoldenEyeDuck();
		d.quack();
	}
}