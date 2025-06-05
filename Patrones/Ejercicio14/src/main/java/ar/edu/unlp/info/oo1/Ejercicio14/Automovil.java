package ar.edu.unlp.info.oo1.Ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil implements Prenda{
	
	
	private LocalDate modelo;
	private double kilometraje;
	private double costo0km;
	
	
	
	
	
	public Automovil(LocalDate modelo, double kilometraje, double costo0km) {
		super();
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costo0km = costo0km;
	}

	@Override
	public double calcularValorPrendario() {
		return this.calcularValor()*this.calcularCoeficienteLiquidez();
	}
	
	@Override
	public double calcularValor() {
		
	    long aniosAntiguedad = ChronoUnit.YEARS.between(modelo, LocalDate.now());
	    double depreciacion = 1 - (0.10 * aniosAntiguedad);
	    return costo0km * depreciacion;
	}

	@Override
	public double calcularCoeficienteLiquidez() {
		// TODO Auto-generated method stub
		return 0.7;
	}
	
	
	
	

}
