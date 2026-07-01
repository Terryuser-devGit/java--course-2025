package vid27_54_POO;
//USO DE INTERFACES -------------vid 49 (CLASES USADAS EMPLEADO6, JEFE6, USO_EMPLEADO6)
//ejemplo. haremos un programa de gestion de empleados el cual como principal metodo 
//sera ordenar por sueldo a los empleado
public class Empleado6 implements Comparable<Empleado6>{
	//atributos
	private final String nombre;
	private final String dni;
	private double sueldo;
	
	//constructor 
	Empleado6(String nombre, String dni, double sueldo){
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
		return "nombre:"+getNombre()+", dni:"+getDni()+", sueldo:"+getSueldo();
	}
	@Override//estamos sobreescribiendo el unic metodo de la interfaz Comparable
	public int compareTo(Empleado6 otroEmpleado) {//N. Debe ser public para que sea de la accesible desde otro lugar
		return Double.compare(this.getSueldo(),otroEmpleado.getSueldo());
	}
}
