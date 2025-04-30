package ar.edu.unlp.info.oo1.Ejercicio7;

public class Sumando extends EsperandoValor{
	
	
    public void setValor(Calculadora c, double unValor) {
    	c.setResultado(unValor + c.getValorAcumulado());
    	c.setEstado(new EstadoInicio());
    }
	

}
