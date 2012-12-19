package com.tdl.oodpkoans.creational.builder;

public class Engine implements TrainItem{

	public String describe() {
		return "Engine";
		
	}
	
	public void start(){
		System.out.println("tu tu");
	}
	
	public void stop(){
		System.out.println("stopped");
	}


}
