package com.tdl.oodpkoans.behavioral.template_method;

import com.tdl.oodpkoans.COUT;

public class Tea extends CaffeineBeverage {
	public void brew() {
		COUT.println("Steeping the tea");
	}
	public void addCondiments() {
		COUT.println("Adding Lemon");
	}
}
