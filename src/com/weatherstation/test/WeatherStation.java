package com.weatherstation.test;

import com.weatherdata.CurrentConditionsDisplay;
import com.weatherdata.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(84, 80, 746);
		weatherData.setMeasurements(82, 85, 740);
		weatherData.setMeasurements(78, 75, 756);
	}

}
