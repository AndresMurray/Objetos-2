package ar.edu.unlp.info.oo1.Ejercicio19;

import java.util.List;

public class ConfiguracionCelsius extends WeatherDataDecorator{
	
	
	
	


	public ConfiguracionCelsius(WeatherData component) {
		super(component);
	}

	@Override
	public String displayData() {
        return "Temperatura C: " + ((this.getTemperatura()-32)/1.8) +
                " Presión atmosf: " + this.getPresion() +
                " Radiación solar: " + this.getRadiacionSolar();
    }
	
	


	
	
	
}
