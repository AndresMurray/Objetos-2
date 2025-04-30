package ar.edu.unlp.info.oo1.Ejercicio7;

public class EnError implements EstadoCalculadora {


	@Override
    public void mas(Calculadora c) {}

    @Override
    public void menos(Calculadora c) {}

    @Override
    public void por(Calculadora c) {}

    @Override
    public void dividido(Calculadora c) {}

    @Override
    public void setValor(Calculadora c, double valor) {}

    @Override
    public String resultado(Calculadora c) {
        return "Error";
    }
	
	

}
