package com.tdl.oodpkoans.behavioral.state;

import com.tdl.oodpkoans.COUT;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		COUT.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		COUT.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		COUT.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		COUT.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
