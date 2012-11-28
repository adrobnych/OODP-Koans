package com.tdl.oodpkoans.behavioral.observer;

/*
 * 
 * The Observer Pattern defines a one-to-many
 * dependency between objects so that when one
 * object changes state, all of its dependents are
 * notified and updated automatically.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		assertEquals(
					"Current conditions: 0.0F degrees and 0.0% humidity.\n" +
					"Stat. data: 0.0F degrees T; 0.0% HMDT.\n" +
					"Those date were used for the forecast: 80.0F degrees temperature and 0.0% Hum.",
					COUT.getLastLines(3));
		
		weatherData.setMeasurements(82, 70, 29.2f);
		assertEquals(
				"Current conditions: 0.0F degrees and 0.0% humidity.\n" +
				"Stat. data: 0.0F degrees T; 0.0% HMDT.\n" +
				"Those date were used for the forecast: 80.0F degrees temperature and 0.0% Hum.",
				COUT.getLastLines(3));
		
		weatherData.setMeasurements(78, 90, 29.2f);
		assertEquals(
				"Current conditions: 0.0F degrees and 0.0% humidity.\n" +
				"Stat. data: 0.0F degrees T; 0.0% HMDT.\n" +
				"Those date were used for the forecast: 80.0F degrees temperature and 0.0% Hum.",
				COUT.getLastLines(3));
	}
}
