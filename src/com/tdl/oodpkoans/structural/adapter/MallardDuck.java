package com.tdl.oodpkoans.structural.adapter;

import com.tdl.oodpkoans.COUT;

public class MallardDuck implements Duck {
	public void quack() {
		COUT.println("Quack");
	}
 
	public void fly() {
		COUT.println("I'm flying");
	}
}
