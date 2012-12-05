package com.tdl.oodpkoans.creational.SimpleFactory;

import java.util.ArrayList;

import com.tdl.oodpkoans.COUT;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();

	public String getName() {
		return name;
	}

	public void prepare() {
		COUT.println("Preparing " + name);
	}

	public void bake() {
		COUT.println("Baking " + name);
	}

	public void cut() {
		COUT.println("Cutting " + name);
	}

	public void box() {
		COUT.println("Boxing " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String )toppings.get(i) + "\n");
		}
		return display.toString();
	}
}

