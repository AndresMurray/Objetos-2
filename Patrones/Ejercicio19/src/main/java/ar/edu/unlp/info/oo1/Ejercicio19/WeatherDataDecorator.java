package ar.edu.unlp.info.oo1.Ejercicio19;

import java.util.List;

public abstract class WeatherDataDecorator implements WeatherData {
	
	protected WeatherData component;
	
	
	public WeatherDataDecorator (WeatherData component) {
		
		this.component = component;
	}

	 public String displayData() {
		 return this.component.displayData();
	 }
	 
	 public double getTemperatura() {
		 
		 return this.component.getTemperatura();
	 }

	 public double getPresion() {
		 return this.component.getPresion();
	 }

	 public double getRadiacionSolar() {
		 return this.component.getRadiacionSolar();
	 }

	 public List<Double> getTemperaturas(){
		 return this.component.getTemperaturas();
	 }
	 
	 

	
	
	
	
	

}
