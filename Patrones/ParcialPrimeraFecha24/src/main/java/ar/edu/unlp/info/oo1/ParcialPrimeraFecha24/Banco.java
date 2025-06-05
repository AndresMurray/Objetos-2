package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<Prestamo> prestamos;
	private double tasaInteres;
	
	
	
	
	public Banco(double tasaInteres) {
		super();
		this.clientes = new ArrayList();
		this.prestamos = new ArrayList();
		this.tasaInteres = tasaInteres;
	}

	public void registrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public Prestamo crearPrestamoSimple(double montoSolicitado, int cantidadCuotas, Cliente cliente) {
		Prestamo p = new PrestamoSimple(montoSolicitado,cantidadCuotas,cliente,this.tasaInteres);
		this.prestamos.add(p);
		verificarSituacionCliente(p,cliente);
		return p;
	}

	public Prestamo crearPrestamoUva(double montoSolicitado, int cantidadCuotas, Cliente cliente) {
		Prestamo p = new PrestamoUva(montoSolicitado,cantidadCuotas,cliente);
		this.prestamos.add(p);
		verificarSituacionCliente(p,cliente);
		return p;
	}
	
	private void verificarSituacionCliente(Prestamo p,Cliente cliente) {
		if(cliente.getSalario()*0.30 < p.valorCuota()) {
			p.setEstado(new PrestamoRechazado());
		}
		else {
			p.setEstado(new PrestamoAceptado());
		}
	}
	
	

}
