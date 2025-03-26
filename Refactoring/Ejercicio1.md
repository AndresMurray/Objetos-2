# Práctica Refactoring Ej 1

Creadas: 26 de marzo de 2025 11:17
Asignatura: Objetos2

# Ejercicio 1: Algo huele mal

Indique qué malos olores se presentan en los siguientes ejemplos.

## 1.1 Protocolo de Cliente

La clase Cliente tiene el siguiente protocolo. ¿Cómo puede mejorarlo?

```java
/** 
* Retorna el límite de crédito del cliente
*/
public double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
private double mtCbE(LocalDate f1, LocalDate f2) {...
```

Malos olores detectados: 

- Comments
- nombres de parámetros poco descriptivos

Extracto de código que presenta el smeel Comments 

```java
/** 
* Retorna el límite de crédito del cliente
*/
public double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
private double mtCbE(LocalDate f1, LocalDate f2) {...
```

El refactoring que resuelve dicho mal olor es rename method, ya que los comentarios son utilizados porque el método en si mismo no describe claramente cual es su funcionalidad. Con dicho refactoring aplicado el código queda de la siguiente manera:

```java
**public** **double** **limiteDeCredito**() {...
**protected** **double** montoFacturadoEntreFechas(LocalDate f1, LocalDate f2) {...
**private double** **montoCobradoEntreFechas**(LocalDate f1, LocalDate f2) {...
```

Ahora refactorizo el nombre de los parámetros poco descriptivos con rename parameter

```java
**public** **double** **limiteDeCredito**() {...
**protected** **double** montoFacturadoEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {...
**private double** **montoCobradoEntreFechas**(LocalDate fechaInicio, LocalDate fechaFin) {...
```

---

---

## 1.2 Participación en proyectos

Al revisar el siguiente diseño inicial (Figura 1), se decidió realizar un cambio para evitar lo que se consideraba un mal olor. El diseño modificado se muestra en la Figura 2. Indique qué tipo de cambio se realizó y si lo considera apropiado. Justifique su respuesta.

**Diseño inicial:**

[](https://lh7-rt.googleusercontent.com/docsz/AD_4nXfttsEkmEQH8L6Qa7Ic00cs5Xs59dnwTzU2jEVbzN2xSvDB-H9T-SELxoLwZGoL0ZX7JLajYYBtzgQ0ijAWW_YY3LUmTFD77mEd-7xJFf9FP3X8DwdL_3CopHFlbaoDTIJIHbYVOg?key=c9sDTzatq0moM0lU9g-6aP7n)

Figura 1: Diagrama de clases del diseño inicial.

**Diseño revisado:**

[](https://lh7-rt.googleusercontent.com/docsz/AD_4nXfB5CDumA_KxKXs9kztRGq9uQ2gdQG53Ou7nlWAZQ4LvWoHplUHJE2qnpBNvBVgpIJP5UoRUIRPJphOPCzpSW4pJmzywrfX2ya4rZivqrqPh2CXoobwiVfczN04hzIDSk13MUFm?key=c9sDTzatq0moM0lU9g-6aP7n)

Figura 2: Diagrama de clases modificado.

El cambio es apropiado. El siguiente método:

```java
public boolean participaEnProyecto (Proyecto p){
	return p.getParticipantes().contains(this);
}
```

ubicado en la clase Persona generaba el smell feature envy,  ya que le estaba realizando un get de la lista de participantes del proyecto para ver si la persona se encontraba en dicho proyecto, cuando la responsabilidad de saber que personas participan del proyecto, es del proyecto. 

El cambio aplicado es Move Method y lleva el método a la clase Proyecto.

También se realizo rename Method, no esta mal, pero me parecía más el nombre inicial del método.

La variable de instancia id en la clase Persona es pública, genera un bad smeel dado que rompe el encapsulamiento.

```java
+id : String
```

El refactoring propuesto es pasar la variable a privada y de ser necesario agregar los getters y setters.

```java
private String id;

public String getId(){...
```

---

---

## 1.3 Cálculos

Analice el código que se muestra a continuación. Indique qué *code smells* encuentra y cómo pueden corregirse.

```java
public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
}
```

Code Smells detectados:

- temporary field
- reinventar la rueda
- long method
- God Method
- nombre de método poco explicativo

Reinventando la rueda para calcular el total de salarios

```java
	double totalSalarios = 0;
	for (Empleado empleado : personal) {
		totalSalarios = totalSalarios + empleado.getSalario();
		
		
		
```

El refactoring a aplicar es replace loop with pipeline

```java
public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios =  this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
}
```

Reinventando la rueda para calcular el promedio de edades

```java
	int totalEdades = 0;
	double promedioEdades = 0;	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
	}
	promedioEdades = totalEdades / personal.size();
```

El refactoring a aplicar es replace loop with pipeline

```java
public void imprimirValores() {
	
	double promedioEdades = this.personal.stream().mapToDouble(e -> e.getEdad()).sum();
	double totalSalarios =  this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
```

Temporary field y long method

promedio de edades y total salarios se pueden reemplazar por un metodo para cada una que devuelva dichos calculos y luego llamar al mismo para imprimir el mensaje

 El refactoring es Extract method para el promedio de edades 

```java
public void imprimirValores() {
	
	double totalSalarios =  this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", calcularPromedioEdades(), totalSalarios);
	
	System.out.println(message);
	}
	
	public double calcularPromedioEdades(){
		return this.personal.stream().mapToDouble(e -> e.getEdad()).sum();
	}
```

Extract method para total salarios

```java
public void imprimirValores() {

	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", calcularPromedioEdades(), calcularTotalSalarios());
	
	System.out.println(message);
	}
	
	public double calcularPromedioEdades(){
		return this.personal.stream().mapToDouble(e -> e.getEdad()).sum();
	}
	public double calcularTotalSalarios(){
		 return this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	}
```

Nombre de método poco explicativo

```java
public void imprimirValores()
```

Aplicar el refactoring rename Method

```java
public void imprimirPromedioEdadesYSalario() {
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", calcularPromedioEdades(), calcularTotalSalarios());
	
	System.out.println(message);
	}
	
	public double calcularPromedioEdades(){
		return this.personal.stream().mapToDouble(e -> e.getEdad()).sum();
	}
	public double calcularTotalSalarios(){
		 return this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	}
```

Bad Smeel Temporary Field message

Refactoring aplicado

Directamente se puede imprimir el resultado del formateo en el System.out.println. Replace Temp With Query ??

```java
public void imprimirPromedioEdadesYSalario() {
		
	System.out.println(String.format("El promedio de las edades es %s y el total de salarios es %s", calcularPromedioEdades(), calcularTotalSalarios()););
	}
	
	public double calcularPromedioEdades(){
		return this.personal.stream().mapToDouble(e -> e.getEdad()).sum();
	}
	public double calcularTotalSalarios(){
		 return this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	}
```

Bad smeel God Method:

El metodo tiene la responsabilidad de imprimir la edad y salario, podría separarse en dos metodos

Extract Method para separar la impresión 

```java
public void imprimirPromedioEdades() {
	
	System.out.println(String.format("El promedio de las edades es %s ", calcularPromedioEdades()););
}
	
public void imprimirTotalSalario() {
		
		System.out.println(String.format("El total de salarios es %s", calcularTotalSalarios()););
}
	
	public double calcularPromedioEdades(){
		return this.personal.stream().mapToDouble(e -> e.getEdad()).sum();
	}
	public double calcularTotalSalarios(){
		 return this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	}
```