package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class Projector {
	String description;
	DvdPlayer dvdPlayer;
	
	public Projector(String description, DvdPlayer dvdPlayer) {
		this.description = description;
		this.dvdPlayer = dvdPlayer;
	}
 
	public void on() {
		COUT.println(description + " on");
	}
 
	public void off() {
		COUT.println(description + " off");
	}

	public void wideScreenMode() {
		COUT.println(description + " in widescreen mode (16x9 aspect ratio)");
	}

	public void tvMode() {
		COUT.println(description + " in tv mode (4x3 aspect ratio)");
	}
  
        public String toString() {
                return description;
        }
}
