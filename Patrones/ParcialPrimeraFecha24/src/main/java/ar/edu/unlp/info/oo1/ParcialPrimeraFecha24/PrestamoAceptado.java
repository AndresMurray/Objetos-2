package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

public class PrestamoAceptado implements EstadoPrestamo {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		prestamo.aumentarCuotasPagas();
		if(prestamo.finalizoPago()) {
			prestamo.setEstado(new PrestamoFinalizado());
		}
		
	}

	@Override
	public double gastoCancelacion(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return prestamo.gastosParaCancelar();
	}
	

}
