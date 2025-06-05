package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

public class PrestamoSimple extends Prestamo{
	
	private double tasaInteres;

	public PrestamoSimple(double montoSolicitado, int cantidadCuotas, Cliente cliente,double tasaInteres) {
		super(montoSolicitado, cantidadCuotas, cliente);
		this.tasaInteres = tasaInteres;
	}

	@Override
	public double getTasaInteres() {
		// TODO Auto-generated method stub
		return this.tasaInteres;
	}

	@Override
	public double gastosSellado() {
		return 5000;
	}
	

}
