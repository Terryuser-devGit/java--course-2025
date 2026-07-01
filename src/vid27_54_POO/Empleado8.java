package vid27_54_POO;
import java.time.LocalDate;
// USO DE INTERACES ....VID 51
//HAREMOS UN PROGRAMA DE GESTION DE EMPLEADOS(EMPLEADO(padre) Y JEFE (hija)) los cuales implementaran
//las interfaces Trabajadores y Jefes
public class Empleado8 implements Comparable<Empleado8>, Trabajadores8{
	//atributos
	private final String nombre;
	private final String dni;
	private double sueldo;
	private LocalDate fechaIngreso;
	//constructor
	public Empleado8(String nombre, String dni, double sueldo, int anio, int mes, int dia) {
		this.nombre=nombre;
		this.dni=dni;
		this.sueldo=sueldo;
		this.fechaIngreso=LocalDate.of(anio, mes, dia);
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
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	//sobrescribir el metodo compareTo de la Interfaz Comparable
	@Override
	public int compareTo(Empleado8 otroEmpleado) {
		return Double.compare(this.getSueldo(), otroEmpleado.getSueldo());
	}
	//sobrescribir el metodo estableceBonus de la Interfaz Trabajadores8
	@Override
	public double estableceBonus(double bonus) {
		return Trabajadores8.bonusBase+bonus;
	}	
	@Override
	public String toString() {
		return "el nombre: %s | dni: %s | sueldo: %.2f| fecha de contrato: %s"
				.formatted(getNombre(),getDni(),getSueldo(),getFechaIngreso());
	}
}
