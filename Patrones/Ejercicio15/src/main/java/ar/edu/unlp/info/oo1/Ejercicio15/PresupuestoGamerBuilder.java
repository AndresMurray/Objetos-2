package ar.edu.unlp.info.oo1.Ejercicio15;

public class PresupuestoGamerBuilder implements BuilderPresupuestoPc {
	private Presupuesto presupuesto;

	@Override
	public void setProcesador() {
		
		presupuesto.setComponente("Procesador Gamer");
		presupuesto.setComponente("Pad Termico");
		presupuesto.setComponente("Cooler");
	}

	@Override
	public void setMemoriaRam() {
		presupuesto.setComponente("32 GB");
		presupuesto.setComponente("32 GB");
		
	}

	@Override
	public void setDisco() {
		presupuesto.setComponente("SSD 500gb");
		presupuesto.setComponente("SSD 1TB");
		
	}

	@Override
	public void setTarjetaGrafica() {
		presupuesto.setComponente("RTX 4090");
		
	}

	@Override
	public void setGabinete() {
		double consumo =presupuesto.getConsumoEquipo()*1.50;
		presupuesto.setComponente("Gabinete Gamer");
		presupuesto.setComponente("fuente" + consumo + "w");
		
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
