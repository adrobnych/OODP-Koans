package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		COUT.println(description + " on");
	}
 
	public void off() {
		COUT.println(description + " off");
	}

	public void pop() {
		COUT.println(description + " popping popcorn!");
	}
 
  
        public String toString() {
                return description;
        }
}
