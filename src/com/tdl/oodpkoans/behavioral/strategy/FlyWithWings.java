package com.tdl.oodpkoans.behavioral.strategy;

import com.tdl.oodpkoans.COUT;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		COUT.println("I'm flying!!");
	}
}