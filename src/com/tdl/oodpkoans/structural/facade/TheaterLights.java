package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class TheaterLights {
	String description;
	
	public TheaterLights(String description) {
		this.description = description;
	}
  
	public void on() {
		COUT.println(description + " on");
	}
  
	public void off() {
		COUT.println(description + " off");
	}
  
	public void dim(int level) {
		COUT.println(description + " dimming to " + level  + "%");
	}
   
        public String toString() {
                return description;
        }
}
