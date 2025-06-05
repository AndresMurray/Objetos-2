package ar.edu.unlp.info.oo1.Ejercicio19;

public class ConfiguracionMaxMin extends WeatherDataDecorator {
	
	
	
	
	
	public ConfiguracionMaxMin(WeatherData component) {
		super(component);
	}

	public String displayData() {
		 return super.component.displayData() + "Minimo: " + this.getMinimo()+  " Maximo: " + this.getMaximo();
		
	}

	private Double getMaximo() {
	    return this.getTemperaturas().stream()
	        .max(Double::compare)
	        .orElse(null);
	}

	private Double getMinimo() {
	    return this.getTemperaturas().stream()
	        .min(Double::compare)
	        .orElse(null);
	}
}
