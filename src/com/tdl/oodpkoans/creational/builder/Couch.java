package com.tdl.oodpkoans.creational.builder;

import com.tdl.oodpkoans.COUT;

public class Couch implements TrainItem{

	public String describe() {
		return "Couch";
		
	}
	
	public void addConductor(){
		COUT.println("Conductor added");
	}

}
