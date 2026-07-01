package vid27_54_POO;
// USO DE INTERFACES .....VID 50
//EJMPLO. crearemos programa de gestion de empleados que implementara la interfaz Decisiones
public class Empleado7 implements Comparable<Empleado7>{
	//atributos
	private final String nombre;
	private final String dni;
	private double sueldo;
	
	//constructor
	public Empleado7 (String nombre, String dni, double sueldo){
		this.nombre=nombre;
		this.dni=dni;
		this.sueldo=sueldo;
	}
	//metodos
	
	public String getNombre() {
		return nombre;
	}
	public String getDni(){
		return dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	@Override
	public String toString() {
		return "nombre: %s | dni: %s | sueldo: %.2f".formatted(getNombre(),getDni(),getSueldo());
	}
	@Override
	public int compareTo(Empleado7 otroEmpleado) {
		return Double.compare(this.getSueldo(), otroEmpleado.getSueldo());
	}
	
}
