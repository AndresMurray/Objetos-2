package ar.edu.unlp.info.oo1.Ejercicio7;

public class Dividiendo extends EsperandoValor{
	
	
    public void setValor(Calculadora c, double unValor) {
    	if(unValor == 0) {
    		c.setEstado(new EnError());
    	}
    	else {
    	c.setResultado(c.getValorAcumulado() / unValor);
    	c.setEstado(new EstadoInicio());
    	}
    }

}
