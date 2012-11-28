package com.tdl.oodpkoans.behavioral.observer;

import com.tdl.oodpkoans.COUT;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		COUT.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity.");
	}
}