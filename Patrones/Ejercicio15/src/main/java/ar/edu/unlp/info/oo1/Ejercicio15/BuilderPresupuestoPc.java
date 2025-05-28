package ar.edu.unlp.info.oo1.Ejercicio15;

public interface BuilderPresupuestoPc {
	
	public void reset();
	public void setNombre(String nombre);
	public void setProcesador();
	public void setMemoriaRam();
	public void setDisco();
	public void setTarjetaGrafica();
	public void setGabinete();
	public Presupuesto getPresupuesto();
	
	

}
