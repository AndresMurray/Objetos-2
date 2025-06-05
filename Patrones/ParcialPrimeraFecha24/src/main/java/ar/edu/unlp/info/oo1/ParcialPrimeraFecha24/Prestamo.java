package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

public abstract class Prestamo {
	
	private double montoSolicitado;
	private int cantidadCuotasSolicitadas;
	private int cantidadCuotasPagadas;
	private double montoAbonado;
	private Cliente cliente;
	private EstadoPrestamo estado;
	
	
	
	public Prestamo(double montoSolicitado, int cantidadCuotas, Cliente cliente) {
		super();
		this.montoSolicitado = montoSolicitado;
		this.cantidadCuotasSolicitadas = cantidadCuotas;
		this.cantidadCuotasPagadas = 0;
		this.montoAbonado = 0;
		this.cliente = cliente;
	}
	
	public void setEstado(EstadoPrestamo estado) {
		this.estado = estado;
	}
	
	
	
	public double valorCuota() {
		return (this.montoSolicitado/this.cantidadCuotasSolicitadas)*this.getTasaInteres(); //template method
	}
	
	
	public abstract double getTasaInteres();
	
	
	public void pagarCuota() {
		estado.pagarCuota(this);
	}
	
	public void aumentarCuotasPagas() {
		this.cantidadCuotasPagadas++;
		this.montoAbonado+= this.valorCuota();
	}
	
	public boolean finalizoPago() {
		return (this.cantidadCuotasPagadas==this.cantidadCuotasSolicitadas);
	}
	
	public double montoPagado() {
		return this.montoAbonado;
	}
	
	public double montoRestante() {
		return this.valorCuota()*(this.cantidadCuotasSolicitadas - this.cantidadCuotasPagadas);
	}
	
	public double gastosCancelacion() {
		return this.estado.gastoCancelacion(this);
	}
	
	public double gastosAdministrativos() {
		return this.montoRestante()*0.10;
	}
	
	public abstract double gastosSellado();
	
	
	public double gastosParaCancelar() {
		return this.montoRestante()+this.gastosSellado()+this.gastosAdministrativos();
	}
	
	public EstadoPrestamo getEstado() {
		return this.estado;
	}
	

}
