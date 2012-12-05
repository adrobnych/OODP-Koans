package com.tdl.oodpkoans.structural.facade;

/*
 * 
 * The Facade Pattern provides a unified interface to a
 * set of interfaces in a subsytem. Facade defines a higherlevel
 * interface that makes the subsystem easier to use.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		assertEquals(___, COUT.getLastLines(5));
		homeTheater.endMovie();
		assertEquals(___, COUT.getLastLines(5));
	}
}