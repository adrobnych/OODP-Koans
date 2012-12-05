package com.tdl.oodpkoans.behavioral.state;

import com.tdl.oodpkoans.COUT;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		COUT.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void ejectQuarter() {
		COUT.println("You can't eject, you haven't inserted a quarter yet");
	}
 
	public void turnCrank() {
		COUT.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		COUT.println("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
