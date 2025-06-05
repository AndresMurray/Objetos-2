package ar.edu.unlp.info.oo1.Ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Prenda {
	
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private double costoMensual;
	
	
	
	
	
	public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
		super();
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}
	
	
	@Override
	public double calcularValorPrendario() {
		return this.calcularValor()*this.calcularCoeficienteLiquidez();
		
	}
	@Override
	public double calcularValor() {
		return this.costoMensual*(ChronoUnit.MONTHS.between(finContrato, LocalDate.now()));
	}
	@Override
	public double calcularCoeficienteLiquidez() {
		// TODO Auto-generated method stub
		return 0.9;
	}
	
	
	

}
