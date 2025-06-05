package ar.edu.unlp.info.oo1.Ejercicio14;

public class Inmbuele implements Prenda{
	
	private String direccion;
	private double superficie;
	private double costoM2;
	
	

	
	public Inmbuele(String direccion, double superficie, double costoM2) {
		super();
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoM2 = costoM2;
	}


	@Override
	public double calcularValorPrendario() {
		return this.calcularValor()*this.calcularCoeficienteLiquidez();
	}
	
	
	@Override
	public double calcularValor() {
		return this.superficie*this.costoM2;
	}


	@Override
	public double calcularCoeficienteLiquidez() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	
}
