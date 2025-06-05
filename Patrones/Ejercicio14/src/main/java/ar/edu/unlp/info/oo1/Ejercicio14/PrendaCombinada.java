package ar.edu.unlp.info.oo1.Ejercicio14;

import java.util.List;

public class PrendaCombinada implements Prenda{
	
	private List<Prenda> componentes;
	
	
	
	

	public PrendaCombinada(List<Prenda> componentes) {
		this.componentes = componentes;
	}

	@Override
	public double calcularValorPrendario() {
		// TODO Auto-generated method stub
		return this.calcularValor()*this.calcularCoeficienteLiquidez();
	}

	@Override
	public double calcularValor() {
		return this.componentes.stream()
				.mapToDouble(c ->c.calcularValorPrendario())
				.sum();
	}

	@Override
	public double calcularCoeficienteLiquidez() {
		// TODO Auto-generated method stub
		return 0.5;
	}
	
	

}
