package com.tdl.badcode;

//Change request:
//	We're starting to build rooms w/o on-wall switchers.
//	We're going to control lights with remote control.
//	Number of lights can vary.
//	Also we'll control washing mashine, TV, HomeTheater, ClimatControl using the same remote controll.
//	User can activate new features by our Android app and remote server
//	We need undo with 10 commands history.
//	Don't forget about redo function

class Light{
	String name;
	Light(String name){
		this.name = name;
	}
	void turnOn(){
		System.out.println(name + " Light on");
	}
	void turnOff(){
		System.out.println(name + " Light off");
	}
}

public class ElectricRoom {

	Light light1 = new Light("1");
	Light light2 = new Light("2");
	Light light3 = new Light("3");
	
	void turnOnLight1(){
		light1.turnOn();
	}
	
	void turnOnLight2(){
		light2.turnOn();
	}
	
	void turnOnLight3(){
		light3.turnOff();
	}
	
	void turnOffLight1(){
		light1.turnOff();
	}
	
	void turnOffLight2(){
		light2.turnOff();
	}
	
	void turnOffLight3(){
		light3.turnOff();
	}
	
	public static void main(String[] args) {
		ElectricRoom er = new ElectricRoom();
		er.turnOnLight1();
		er.turnOffLight1();

	}

}
