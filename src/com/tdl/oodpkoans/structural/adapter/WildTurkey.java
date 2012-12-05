package com.tdl.oodpkoans.structural.adapter;

import com.tdl.oodpkoans.COUT;

public class WildTurkey implements Turkey {
	public void gobble() {
		COUT.println("Gobble gobble");
	}
 
	public void fly() {
		COUT.println("I'm flying a short distance");
	}
}
