package ar.edu.unlp.info.oo1.Ejercicio7;

public abstract class EsperandoValor implements EstadoCalculadora {
	

	public void mas(Calculadora c) {
		c.setEstado(new EnError());
	}
	
	
	public void menos(Calculadora c) {
		c.setEstado(new EnError());
	}
	

	public void por(Calculadora c) {
		c.setEstado(new EnError());
	}

	public void dividido(Calculadora c) {
		c.setEstado(new EnError());
	}
	
	@Override
    public abstract void setValor(Calculadora c, double unValor);
	
	@Override
	public String resultado(Calculadora c) {
		c.setEstado(new EnError());
		return "Error";
	}
	
	
	
}
