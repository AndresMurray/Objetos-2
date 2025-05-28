package ar.edu.unlp.info.oo1.Ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		
		
		Componente procesadorBasico = new Componente("Procesador Básico", "Procesador de gama baja", 50.0, 35.0);
        Componente ram8gb = new Componente("8 GB", "Memoria RAM de 8 GB", 25.0, 3.0);
        Componente hdd500 = new Componente("HDD 500 GB", "Disco duro mecánico de 500 GB", 30.0, 6.0);
        Componente graficaIntegrada = new Componente("Gráfica integrada", "No posee tarjeta dedicada", 0.0, 0.0);
        Componente gabineteBasico = new Componente("Gabinete Estándar", "Gabinete con fuente incluida " , 40.0, 0.0);
        List<Componente> c = new ArrayList();
        c.add(procesadorBasico);
        c.add(ram8gb);
        c.add(hdd500);
        c.add(graficaIntegrada);
        c.add(gabineteBasico);
        Catalogo cat = new Catalogo ();
        cat.setComponentes(c);
        
		
		
		BuilderPresupuestoPc builder = new PresupuestoBasicoBuilder();
		DirectorPresupuestosPc director = new DirectorPresupuestosPc(builder);
		director.crearPreupuesto("Andrés");
		Presupuesto p = builder.getPresupuesto();
		System.out.println("El consumo de este equipo es: " + p.getConsumoEquipo());
		System.out.println();
		System.out.println("El precio de este equipo es: " + p.getPrecioEquipo());

	}

}
