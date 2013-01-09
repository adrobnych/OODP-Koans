package com.tdl.badcode;

interface DisplayElement {
	public void display();
}

class ForecastDisplay implements DisplayElement, Runnable {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	WeatherData weatherData;
	

	public ForecastDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
	}

	public void update() {
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void run() {
		while(true)
			if(weatherData.isMeasurementsChanged()){
				update();
				weatherData.setMeasurementsChanged(false);    // but how about other displays?
			}	                                              // display dictate weatherData how to work?
	}
}

class StatisticsDisplay implements DisplayElement, Runnable {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	WeatherData weatherData;
	

	public StatisticsDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
	}

	public void update() {
			float temp = weatherData.getTemperature();
			tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
 
			if (temp < minTemp) {
				minTemp = temp;
			}

			display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
	
	@Override
	public void run() {
		while(true)
			if(weatherData.isMeasurementsChanged()){
				update();
				weatherData.setMeasurementsChanged(false);
			}
	}
}


class WeatherData {
	private float temperature;
	private float humidity;
	private float pressure;
	boolean measurementsChanged;
	
	public WeatherData() { }

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged = true;
	}
	
	public synchronized float getTemperature() {
		return temperature;
	}
	
	public synchronized float getHumidity() {
		return humidity;
	}
	
	public synchronized float getPressure() {
		return pressure;
	}

	public synchronized void setMeasurementsChanged(boolean measurementsChanged) {
		this.measurementsChanged = measurementsChanged;
	}

	public synchronized boolean isMeasurementsChanged() {
		return measurementsChanged;
	}
	
	
}


public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		(new Thread(statisticsDisplay)).start();
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		(new Thread(forecastDisplay)).start();
		// more displays - more threads?

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
