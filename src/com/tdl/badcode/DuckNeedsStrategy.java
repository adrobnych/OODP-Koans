package com.tdl.badcode;

class Duck{
	public void quack(){
		System.out.println("Quack");
	}
	public void fly(){
		System.out.println("fly");
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
}

public class DuckNeedsStrategy{
	public static void main(String[] args){
		Duck rd = new RibbonDuck();
		rd.fly();
		// but ribbon duck can't fly!
	}
}