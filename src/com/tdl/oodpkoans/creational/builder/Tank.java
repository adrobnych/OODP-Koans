package com.tdl.oodpkoans.creational.builder;

public class Tank implements TrainItem{

	public String describe() {
		return "Tank";
		
	}
	
	public void PourSomeLiquid(){
		System.out.println("Tank filled");
	}

}
