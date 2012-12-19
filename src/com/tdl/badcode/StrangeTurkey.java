package com.tdl.badcode;

import com.tdl.oodpkoans.structural.adapter.Duck;
import com.tdl.oodpkoans.structural.adapter.Turkey;


class WildWildTurkey implements Turkey, Duck {
	public void gobble() {
		System.out.println("Gobble gobble");
	}
 
	public void fly() { // fly as who? Duck or Turkey?
		System.out.println("I'm flying a short distance");
	}

	public void quack() {
		// Not sure what to do here...
	}
}

public class StrangeTurkey {

	public static void main(String[] args) {
		// really strange Turkey!

	}

}
