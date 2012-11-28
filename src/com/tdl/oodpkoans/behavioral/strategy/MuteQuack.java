package com.tdl.oodpkoans.behavioral.strategy;

import com.tdl.oodpkoans.COUT;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		COUT.println("<< Silence >>");
	}
}
