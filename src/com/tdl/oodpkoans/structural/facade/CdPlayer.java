package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class CdPlayer {
	String description;
	int currentTrack;
	Amplifier amplifier;
	String title;
	
	public CdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		COUT.println(description + " on");
	}
 
	public void off() {
		COUT.println(description + " off");
	}

	public void eject() {
		title = null;
		COUT.println(description + " eject");
	}
 
	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		COUT.println(description + " playing \"" + title + "\"");
	}

	public void play(int track) {
		if (title == null) {
			COUT.println(description + " can't play track " + currentTrack + 
					", no cd inserted");
		} else {
			currentTrack = track;
			COUT.println(description + " playing track " + currentTrack);
		}
	}

	public void stop() {
		currentTrack = 0;
		COUT.println(description + " stopped");
	}
 
	public void pause() {
		COUT.println(description + " paused \"" + title + "\"");
	}
 
	public String toString() {
		return description;
	}
}
