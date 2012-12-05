package com.tdl.oodpkoans.behavioral.command;

import com.tdl.oodpkoans.COUT;

public class Light {
	String location;
	int level;

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		level = 100;
		COUT.println("Light is on");
	}

	public void off() {
		level = 0;
		COUT.println("Light is off");
	}

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			COUT.println("Light is dimmed to " + level + "%");
		}
	}

	public int getLevel() {
		return level;
	}
}
