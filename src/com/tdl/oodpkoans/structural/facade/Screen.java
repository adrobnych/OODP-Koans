package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class Screen {
	String description;
	
	public Screen(String description) {
		this.description = description;
	}
 
	public void up() {
		COUT.println(description + " going up");
	}
 
	public void down() {
		COUT.println(description + " going down");
	}
 
  
        public String toString() {
                return description;
        }
}
