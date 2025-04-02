
# Ejercicio 2

Para cada una de las siguientes situaciones, realice en forma iterativa los siguientes pasos:

(i) indique el mal olor,

(ii) indique el refactoring que lo corrige,

(iii) aplique el refactoring, mostrando el resultado final (código y/o diseño según corresponda).

Si vuelve a encontrar un mal olor, retorne al paso (i).

## 2.1 Empleados

```java
public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
				public double sueldo() {
						return this.sueldoBasico
									+(this.horasTrabajadas * 500) 
									+(this.cantidadHijos * 1000) 
									-(this.sueldoBasico * 0.13);
				}
}

public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
					+ (this.cantidadHijos * 2000)
					- (this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}

```

Bad Smell: duplicate code

Refactor: extract superclass

```java
public abstract class Empleado {
		public String nombre;
		public String apellido;
		public double sueldoBasico = 0;
		
		public double sueldo(){
			return this.sueldoBasico - (this.sueldoBasico*0.13);
		}
}

public class EmpleadoTemporario {
	  public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    
    public double sueldo() {
			return super.sueldo()
					+(this.horasTrabajadas * 500) 
					+(this.cantidadHijos * 1000) ;
					
		}
}

public class EmpleadoPlanta {
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return super.sueldo()
					+ (this.cantidadHijos * 2000);
				
    }
}

public class EmpleadoPasante {
   // .....    
    public double sueldo() {
        return super.sueldo();
    }
}

```

Bad Smell:  magic numbers 

Refactor: replace magic number with symbolic constant

```java
public abstract class Empleado {
		public String nombre;
		public String apellido;
		public double sueldoBasico = 0;
		private  static final double factorSueldo=0.13;
		
		public double sueldo(){
			return this.sueldoBasico*factorSueldo;
		}
}

public class EmpleadoTemporario {
	  public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    private static final double factorHijos=1000;
    private static final double factorHoras=500;
    
    public double sueldo() {
			return super.sueldo()+
					+(this.horasTrabajadas * factorHoras)
					+(this.cantidadHijos * factorHijos); 
		}
}

public class EmpleadoPlanta {
    public int cantidadHijos ;
    private static final double factorHijos=2000;
    // ......
    
    public double sueldo() {
        return super.sueldo()
					+ (this.cantidadHijos * factorHijos);
					
    }
}

public class EmpleadoPasante {
   // .....    
    public double sueldo() {
        return super.sueldo();
    }
}

```

Bad smell: variables de instancia publicas

refactor: encapsulate field

```java
public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected double sueldoBasico = 0;
    private static final double factorSueldo = 0.13;

    public double sueldo() {
        return this.sueldoBasico * factorSueldo;
    }
}

public class EmpleadoTemporario extends Empleado {
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    private static final double factorHijos = 1000;
    private static final double factorHoras = 500;

    @Override
    public double sueldo() {
        return super.sueldo() +
               (this.horasTrabajadas * factorHoras) +
               (this.cantidadHijos * factorHijos);
    }
}

public class EmpleadoPlanta extends Empleado {
    private int cantidadHijos;
    private static final double factorHijos = 2000;

    @Override
    public double sueldo() {
        return super.sueldo() + (this.cantidadHijos * factorHijos);
    }
}

public class EmpleadoPasante extends Empleado {
    @Override
    public double sueldo() {
        return super.sueldo();
    }
}
```

# Ejercicio 2.2

## 2.2 Juego

```java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.puntuacion = j.puntuacion + 100;
    }
    public void decrementar(Jugador j) {
        j.puntuacion = j.puntuacion - 50;
    }
}

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
}

```

Code smell:  feature envy. El que deberia incrementar o decrementar sus puntos es el jugador.  Y juego deberia llamar a dicho metodo del jugador en cada caso (decrementar o incrementar)

Refactor: move method

```java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.incrementar();
    }
    public void decrementar(Jugador j) {
        j.decrementar();
    }
    
    
}

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
    
    public void incrementar() {
       this.puntuacion +=100;
    }
    
    public void decrementar() {
        this.puntuacion-=50,
    }
}
```

Code smell: nombres de métodos para incrementar y decrementar poco descriptivos.

refactor: rename method

```java
public class Juego {
    // ......
    public void incrementarPuntosDe(Jugador j) {
        j.incrementarPuntuacion();
    }
    public void decrementarPuntosDe(Jugador j) {
        j.decrementarPuntuacion();
    }
    
    
}

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
    
    public void incrementarPuntuacion() {
       this.puntuacion +=100;
    }
    
    public void decrementarPuntuacion() {
        this.puntuacion-=50,
    }
}
```

Code smell: variables de instancia publicas, rompe el encapsulamiento

refactor: encapsulate field

```java
public class Juego {
    // ......
    public void incrementarPuntosDe(Jugador j) {
        j.incrementarPuntuacion();
    }
    public void decrementarPuntosDe(Jugador j) {
        j.decrementarPuntuacion();
    }
    
    
}

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion = 0;
    
    public void incrementarPuntuacion() {
       this.puntuacion +=100;
    }
    
    public void decrementarPuntuacion() {
        this.puntuacion-=50,
    }
}
```


# Ejercicio 2.4

[](https://lh7-rt.googleusercontent.com/docsz/AD_4nXcpRPL93jYFIaI0XbfOUubdQd6vD_lh5sShjArTCjZhpyrrWkFFvt-UVXxax3SOsJLNe8f13ZcbYg-UXOnC7qwN8XC1BaqVhWUAui6Cjrbdg8fi0D2UNuyPRoc1UkIp6eKYEIg6mw?key=c9sDTzatq0moM0lU9g-6aP7n)

```java
public class Producto {
    private String nombre;
    private double precio;
    
    public double getPrecio() {
        return this.precio;
    }
}

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {          ///
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

}

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
			return this.items.stream()
				.mapToDouble(item -> 
						item.getProducto().getPrecio() * item.getCantidad())
							.sum();
    }
}

```

Code Smell: feature envy. 

El método total() de la clase Carrito, le pide el producto a la clase ItemCarrito a través del método getProducto() para calcular el total del mismo, esto genera un “pasa manos”. ItemCarrito deberia devolver el total de ese item, es decir, el producto*cantidad del mismo, y total() de la clase Carrito usar ese total.

Refactor: move method

```java
public class Producto {
    private String nombre;
    private double precio;
    
    public double getPrecio() {
        return this.precio;
    }
}

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public double getTotalItem() {          ///
        return this.producto.getPrecio()*this.cantidad;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

}

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
			return this.items.stream()
				.mapToDouble(item -> 
						item.getTotalItem())
							.sum();
    }
}

```

Bad Smell: nombres de métodos poco descriptivos. El método total() en Carrito no deja en claro su propósito

Refactor: rename Method

```java
public class Producto {
    private String nombre;
    private double precio;
    
    public double getPrecio() {
        return this.precio;
    }
}

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public double getTotalItem() {          
        return this.producto.getPrecio()*this.cantidad;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

}

public class Carrito {
    private List<ItemCarrito> items;
    
    public double precioTotalCarrito() {
			return this.items.stream()
				.mapToDouble(item -> 
						item.getTotalItem())
							.sum();
    }
}
```