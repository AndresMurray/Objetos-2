package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

public class PrestamoFinalizado implements EstadoPrestamo{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		throw new Error ("error");
		
	}

	@Override
	public double gastoCancelacion(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
