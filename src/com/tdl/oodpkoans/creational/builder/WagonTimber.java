package com.tdl.oodpkoans.creational.builder;

public class WagonTimber implements TrainItem{

	public String describe() {
		return "VagonTimber";
		
	}
	
	public void loadTimber(){
		System.out.println("Timber loaded");
	}


}
