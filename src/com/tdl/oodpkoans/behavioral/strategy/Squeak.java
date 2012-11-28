package com.tdl.oodpkoans.behavioral.strategy;

import com.tdl.oodpkoans.COUT;

public class Squeak implements QuackBehavior {
	public void quack() {
		COUT.println("Squeak");
	}
}
