package vid27_54_POO;
import java.time.LocalDate;
// HERENCIA Y POLIMORFISMO-----vid 42,43 y 44
//N. un objeto se puede comportar de distinta forma dependiendo del contexto
// Ejemplo haremos un programa de gestion de empleados, donde la Clase Empleado5 (padre)
//y la clase Jefe (Hija) y se mostraran desde la clase Uso_Empleado5
public class Empleado5 {
	private final String nombre;
	private double sueldo;
	private LocalDate fechaContrato;
	private int idObjeto;
	private static int totalEmpleados=0;
	
	public Empleado5(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.fechaContrato=LocalDate.of(anio, mes, dia);
		totalEmpleados++;
		idObjeto=totalEmpleados;
	}
	
	public String getNombre() {
		return nombre;
	}
	 public double getSueldo() {
		 return sueldo;
	 }
	 public LocalDate getFechaContrato() {
		 return fechaContrato;
	 }
	 public int getIdObjeto() {
		 return idObjeto;
	 }
	 
	 public static int getTotalEmpleado() {
		 return totalEmpleados;
	 }
	 
	 public void subeSueldo(double porcentaje) {
		 sueldo+=sueldo*porcentaje/100;
	 }
	 @Override
	 public String toString() {
		 return "nombre: "+getNombre()+", sueldo: "+getSueldo()+", fecha contrato: "+
				 getFechaContrato()+", idObjeto: "+getIdObjeto();
	 }
	 
}
