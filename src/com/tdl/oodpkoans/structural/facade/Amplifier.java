package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class Amplifier {
	String description;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		COUT.println(description + " on");
	}
 
	public void off() {
		COUT.println(description + " off");
	}
 
	public void setStereoSound() {
		COUT.println(description + " stereo mode on");
	}
 
	public void setSurroundSound() {
		COUT.println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		COUT.println(description + " setting volume to " + level);
	}

	public void setTuner(Tuner tuner) {
		COUT.println(description + " setting tuner to " + dvd);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		COUT.println(description + " setting DVD player to " + dvd);
		this.dvd = dvd;
	}
 
	public void setCd(CdPlayer cd) {
		COUT.println(description + " setting CD player to " + cd);
		this.cd = cd;
	}
 
	public String toString() {
		return description;
	}
}
