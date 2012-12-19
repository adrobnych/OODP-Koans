package com.tdl.badcode;


interface Rollex{
	void showTime();
}

class OriginalRollex implements Rollex{
	public void showTime(){
		//right time
	}
}

class Xollex implements Rollex{
	public void showTime(){
		//not quite right time
	}
}

class RollexStore{
	void supply(){
		Rollex r = new OriginalRollex();
		
		box(r);
		
		sendViaDHL(r);
	}

	private void sendViaDHL(Rollex r) {
		
		System.out.println("Sending");
		
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
		System.out.println("Sending");
	}

	private void box(Rollex r) {
		
		System.out.println("Boxing");
		
	}
}

public class TestRollex {


	public static void main(String[] args) {
		
		RollexStore rs = new RollexStore();
		XollexStore xs = new XollexStore();
		rs.supply();
		xs.supply();
	}

}
