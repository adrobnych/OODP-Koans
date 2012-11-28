package com.tdl.oodpkoans.behavioral.strategy;

import com.tdl.oodpkoans.COUT;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		COUT.println("I can't fly");
	}
}
