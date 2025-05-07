package ar.edu.unlp.info.oo1.Ejercicio13;

public class ScriptPrueba {
	public static void main(String[] args) {
	
	Builder vegetarianoBuilder = new VegetarianoBuilder();
	Director d = new Director(vegetarianoBuilder);
	d.prepararSandwich();
	Sandwich v = vegetarianoBuilder.getSandwich();
	System.out.println("El precio del sandwich vegetariano es: "+ v.getPrecio());
	
	Builder clasicoBuilder = new ClasicoBuilder();
	d.cambiarSandwich(clasicoBuilder);
	d.prepararSandwich();
	Sandwich c = clasicoBuilder.getSandwich();
	System.out.println("El precio del sandwich clasico es: "+ c.getPrecio());
	
	
	
	
	}
	
	
	

}
