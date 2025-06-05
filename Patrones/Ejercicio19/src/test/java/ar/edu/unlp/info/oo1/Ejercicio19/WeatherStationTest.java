package ar.edu.unlp.info.oo1.Ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherStationTest {
	
	
	private WeatherData homeWeather;
	private WeatherData celsius;
	private WeatherData promedio;
	WeatherData maxMin;
	private List<Double> temps;
	
	
	
	@BeforeEach
	public void setUp() {
	this.temps = new ArrayList();
		
	}
	
	


	@Test
	public void displayDataTest() {
    	temps.add(20.0); temps.add(40.0);
    	this.homeWeather = new HomeWeatherStation(86,200,1008,temps);
    	this.celsius = new ConfiguracionCelsius(homeWeather);
    	this.promedio = new ConfiguracionPromedio(celsius);
    	this.maxMin = new ConfiguracionMaxMin(promedio);
    	assertEquals("Temperatura C: 30.0 Presión atmosf: 1008.0 Radiación solar: 200.0Promedio : 30.0Minimo: 20.0 Maximo: 40.0",maxMin.displayData());
    	
	
		
	}

}
