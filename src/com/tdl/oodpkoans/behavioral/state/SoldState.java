package com.tdl.oodpkoans.behavioral.state;

import com.tdl.oodpkoans.COUT;

public class SoldState implements State {
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		COUT.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		COUT.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		COUT.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			COUT.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}
