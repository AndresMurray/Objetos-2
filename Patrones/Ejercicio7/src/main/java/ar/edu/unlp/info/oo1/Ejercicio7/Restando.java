package ar.edu.unlp.info.oo1.Ejercicio7;

public class Restando extends EsperandoValor{
	
    public void setValor(Calculadora c, double unValor) {	
    	c.setResultado(c.getValorAcumulado() - unValor);
    	c.setEstado(new EstadoInicio());
    
    }

}
