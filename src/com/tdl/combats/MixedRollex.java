package com.tdl.combats;


interface Rollex{
	void showTime();
}

class OriginalRollex implements Rollex{
	public void showTime(){
		//right time
	}

	@Override
	public String toString() {
		return "OriginalRollex";
	}
	
}

class Xollex implements Rollex{
	public void showTime(){
		//not quite right time
	}

	@Override
	public String toString() {
		return "Xollex";
	}
	
}

class RollexStore{
	void supply(){
		Rollex r = new OriginalRollex();
		
		box(r);
		
		sendViaDHL(r);
	}

	private void sendViaDHL(Rollex r) {
		
		System.out.println("Sending Reliable of 1 " + r);
		
	}

	private void box(Rollex r) {
		
		System.out.println("Boxing");
		
	}
}

class XollexStore{
	void supply(){
		Rollex r = new Xollex();
		box(r);
		sendViaDHL(r);
	}

	private void sendViaDHL(Rollex r) {
		System.out.println("Sending Not Quite Reliable of 1 " + r);
	}

	private void box(Rollex r) {
		
		System.out.println("Boxing");
		
	}
}

public class MixedRollex {


	public static void main(String[] args) {
		
		RollexStore rs = new RollexStore();
		XollexStore xs = new XollexStore();
		rs.supply();
		xs.supply();
	}

}
