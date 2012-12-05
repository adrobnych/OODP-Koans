package com.tdl.oodpkoans.structural.facade;

import com.tdl.oodpkoans.COUT;

public class DvdPlayer {
	String description;
	int currentTrack;
	Amplifier amplifier;
	String movie;
	
	public DvdPlayer(String description, Amplifier amplifier) {
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
		movie = null;
                COUT.println(description + " eject");
        }
 
	public void play(String movie) {
		this.movie = movie;
		currentTrack = 0;
		COUT.println(description + " playing \"" + movie + "\"");
	}

	public void play(int track) {
		if (movie == null) {
			COUT.println(description + " can't play track " + track + " no dvd inserted");
		} else {
			currentTrack = track;
			COUT.println(description + " playing track " + currentTrack + " of \"" + movie + "\"");
		}
	}

	public void stop() {
		currentTrack = 0;
		COUT.println(description + " stopped \"" + movie + "\"");
	}
 
	public void pause() {
		COUT.println(description + " paused \"" + movie + "\"");
	}

	public void setTwoChannelAudio() {
		COUT.println(description + " set two channel audio");
	}
 
	public void setSurroundAudio() {
		COUT.println(description + " set surround audio");
	}
 
	public String toString() {
		return description;
	}
}
