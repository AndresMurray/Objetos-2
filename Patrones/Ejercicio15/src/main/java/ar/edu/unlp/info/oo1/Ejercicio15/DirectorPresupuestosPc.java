package ar.edu.unlp.info.oo1.Ejercicio15;

public class DirectorPresupuestosPc {
	
	private BuilderPresupuestoPc builder;
	
	
	public DirectorPresupuestosPc(BuilderPresupuestoPc builder) {
		this.builder = builder;
	}
	
	
	public void crearPreupuesto(String nombre) {
		
		builder.reset();
		builder.setNombre(nombre);
		builder.setProcesador();
		builder.setMemoriaRam();
		builder.setGabinete();
		builder.setDisco();
		builder.setTarjetaGrafica();
			
	}

}
