package com.tdl.badcode;

interface Gun{
	void load();
	void fire();
}

class AirGun implements Gun{
	public void load(){
		System.out.println("move pump");
	}
	
	public void fire(){
		System.out.println("paff!");
	}
}

class Revolver implements Gun{
	public void load(){
		System.out.println("load cartridge");
	}
	
	public void fire(){
		System.out.println("paff!");
	}
}

class AK47 implements Gun{
	public void load(){
		System.out.println("load cartridge");
	}
	
	public void fire(){
		System.out.println("paff!");
	}
}

class WaterGun implements Gun{
	public void load(){
		System.out.println("pour some water");
	}
	
	public void fire(){
		System.out.println("psik");
	}
}

public class CrazyGun {

	public static void main(String[] args) {
		
		Gun[] guns = {new WaterGun(), new AK47(), new Revolver()};
		for(Gun gun : guns)
		{
			gun.load();
			gun.fire();
		}
	}

}
