package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

public class PrestamoRechazado implements EstadoPrestamo{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		throw new Error ("error");
		
	}

	@Override
	public double gastoCancelacion(Prestamo prestamo) {
		throw new Error ("error");
	}
	

}
