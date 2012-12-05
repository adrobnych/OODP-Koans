package com.tdl.oodpkoans.behavioral.template_method;

import com.tdl.oodpkoans.COUT;

public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		COUT.println("Boiling water");
	}
  
	void pourInCup() {
		COUT.println("Pouring into cup");
	}
}
