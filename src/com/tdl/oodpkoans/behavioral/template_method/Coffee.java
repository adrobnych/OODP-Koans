package com.tdl.oodpkoans.behavioral.template_method;

import com.tdl.oodpkoans.COUT;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		COUT.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		COUT.println("Adding Sugar and Milk");
	}
}
