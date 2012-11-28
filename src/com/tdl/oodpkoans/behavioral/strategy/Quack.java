package com.tdl.oodpkoans.behavioral.strategy;

import com.tdl.oodpkoans.COUT;

public class Quack implements QuackBehavior {
	public void quack() {
		COUT.println("Quack");
	}
}

