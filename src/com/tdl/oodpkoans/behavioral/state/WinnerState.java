package com.tdl.oodpkoans.behavioral.state;

import com.tdl.oodpkoans.COUT;

public class WinnerState implements State {
    GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		COUT.println("Please wait, we're already giving you a Gumball");
	}
 
	public void ejectQuarter() {
		COUT.println("Please wait, we're already giving you a Gumball");
	}
 
	public void turnCrank() {
		COUT.println("Turning again doesn't get you another gumball!");
	}
 
	public void dispense() {
		COUT.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	COUT.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
