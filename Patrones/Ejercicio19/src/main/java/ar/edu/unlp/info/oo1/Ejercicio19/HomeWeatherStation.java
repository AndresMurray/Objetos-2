package ar.edu.unlp.info.oo1.Ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{
	
	
    private List<Double> temperaturas;
    private double presion;
    private double radiacionSolar;
    private double temperatura;

    public HomeWeatherStation(double temperatura, double radiacionSolar, double presion, List<Double> temperaturas) {
    	this.temperatura = temperatura;
    	this.presion = presion;
    	this.radiacionSolar = radiacionSolar;
    	this.temperaturas = temperaturas;
    }

    @Override
    public double getTemperatura() {
        return this.temperatura;
    }

    @Override
    public double getPresion() {
        return presion;
    }

    @Override
    public double getRadiacionSolar() {
        return radiacionSolar;
    }

    @Override
    public List<Double> getTemperaturas() {
        return new ArrayList<>(temperaturas);
    }

    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() +
               " Presión atmosf: " + this.getPresion() +
               " Radiación solar: " + this.getRadiacionSolar();
    }


	

}
