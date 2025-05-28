package ar.edu.unlp.info.oo1.Ejercicio15;

public class PresupuestoBasicoBuilder implements BuilderPresupuestoPc {
	
	private Presupuesto presupuesto;

	@Override
	public void setProcesador() {
		
		presupuesto.setComponente("Procesador Básico");
		
	}

	@Override
	public void setMemoriaRam() {
		presupuesto.setComponente("8 GB");
		
	}

	@Override
	public void setDisco() {
		presupuesto.setComponente("HDD 500 GB");
		
	}

	@Override
	public void setTarjetaGrafica() {
		presupuesto.setComponente("Gráfica integrada");
		
	}

	@Override
	public void setGabinete() {
		presupuesto.setComponente("Gabinete Estándar");
		
	}

	@Override
	public Presupuesto getPresupuesto() {
	
		return this.presupuesto;
	}

	@Override
	public void setNombre(String nombre) {
		presupuesto.setNombre(nombre);
		
	}

	@Override
	public void reset() {
		presupuesto = new Presupuesto ();
		
	}
	


}
