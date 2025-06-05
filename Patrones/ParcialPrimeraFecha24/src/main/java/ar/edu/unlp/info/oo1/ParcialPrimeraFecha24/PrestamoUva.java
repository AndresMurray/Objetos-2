package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

public class PrestamoUva extends Prestamo{
	

	public PrestamoUva(double montoSolicitado, int cantidadCuotas, Cliente cliente) {
		super(montoSolicitado, cantidadCuotas, cliente);
	}

	@Override
	public double getTasaInteres() {
		//double indiceActual = Indec.getIndiceInflacion();
		double indiceActual = 1.2;
		return indiceActual;
	}

	@Override
	public double gastosSellado() {
		// TODO Auto-generated method stub
		return 0;
	}


}
