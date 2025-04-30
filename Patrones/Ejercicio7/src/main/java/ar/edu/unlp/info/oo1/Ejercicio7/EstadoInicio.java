package ar.edu.unlp.info.oo1.Ejercicio7;

public class EstadoInicio implements EstadoCalculadora {

	@Override
	public String resultado(Calculadora calculadora) {
	
		return "Valor acumulado: " + calculadora.getValorAcumulado();
	}
	
	public void setValor (Calculadora calculadora, double unValor) {
		calculadora.setResultado(unValor);
	}
	
	public void mas(Calculadora c) {
		c.setEstado(new Sumando());
	}
	
	
	public void menos(Calculadora c) {
		c.setEstado(new Restando());
	}
	

	public void por(Calculadora c) {
		c.setEstado(new Multiplicando());
	}

	public void dividido(Calculadora c) {
		c.setEstado(new Dividiendo());
	}
	
	


	
}
