package vid27_54_POO;
//USO DE INTERFACES -------------vid 49 (moderno y mejorado -java 17)
//ejemplo. haremos un programa de gestion de empleados el cual como principal metodo 
//sera ordenar por sueldo a los empleado
public class Empleado6mod {
	//atributos
	private final String nombre;
	private final String dni;
	private double sueldo;
	//constructor 
	Empleado6mod(String nombre, String dni, double sueldo){
		this.nombre=nombre;
		this.dni=dni;
		this.sueldo=sueldo;
	}
	
	//metodos
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	
	@Override
	public String toString() {
		return "%s | DNI: %s | Sueldo: %.2f".formatted(getNombre(),getDni(),getSueldo());
	}
}
