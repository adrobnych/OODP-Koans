package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class Tuner {
	String description;
	Amplifier amplifier;
	double frequency;
	
	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}
 
	public void on() {
		COUT.println(description + " on");
	}
 
	public void off() {
		COUT.println(description + " off");
	}
 
	public void setFrequency(double frequency) {
		COUT.println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}
 
	public void setAm() {
		COUT.println(description + " setting AM mode");
	}
 
	public void setFm() {
		COUT.println(description + " setting FM mode");
	}
  
        public String toString() {
                return description;
        }
}
