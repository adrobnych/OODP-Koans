package com.tdl.oodpkoans.structural.composite;

import java.util.Iterator;
import java.util.ArrayList;

import com.tdl.oodpkoans.COUT;

public class MenuItem extends MenuComponent {
 
	String name;
	String description;
	boolean vegetarian;
	double price;
    
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}

	public Iterator createIterator() {
		return new NullIterator();
	}
 
	public void print() {
		COUT.println("  " + getName());
//		if (isVegetarian()) {
//			COUT.print("(v)");
//		}
//		COUT.println(", " + getPrice());
//		COUT.println("     -- " + getDescription());
	}

}

