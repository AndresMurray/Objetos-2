package ar.edu.unlp.info.oo1.Ejercicio19;

public class ConfiguracionPromedio extends WeatherDataDecorator{
	
	
	
	
	public ConfiguracionPromedio(WeatherData component) {
		super(component);
	}


	public String displayData() {
		return super.component.displayData() + "Promedio : " + this.getPromedio();
		
	}
	
	
	public Double getPromedio() {	
	    return this.getTemperaturas().stream()
	            .mapToDouble(Double::doubleValue)
	            .average()
	            .orElse(0.0);
	  }		
	

}
