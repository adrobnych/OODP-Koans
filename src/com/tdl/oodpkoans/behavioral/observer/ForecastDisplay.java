package com.tdl.oodpkoans.behavioral.observer;

import com.tdl.oodpkoans.COUT;

public class ForecastDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		COUT.println("Those date were used for the forecast: " + temperature
				+ "F degrees temperature and " + humidity + "% Hum.");
	}
}