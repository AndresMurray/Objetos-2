package ar.edu.unlp.info.oo1.Ejercicio15;

public class PresupuestoIntermedioBuilder implements BuilderPresupuestoPc{
	
	private Presupuesto presupuesto;

	@Override
	public void setProcesador() {
		
		presupuesto.setComponente("Procesador Intermedio");
		
	}

	@Override
	public void setMemoriaRam() {
		presupuesto.setComponente("16 GB");
		
	}

	@Override
	public void setDisco() {
		presupuesto.setComponente("SSD 500 GB");
		
	}

	@Override
	public void setTarjetaGrafica() {
		presupuesto.setComponente("GTX 1650");
		
	}

	@Override
	public void setGabinete() {
		presupuesto.setComponente("Gabinete Intermedio");
		presupuesto.setComponente("Fuente 800 w");
		
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
