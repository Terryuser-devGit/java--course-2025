package vid27_54_POO;
//USO DE INTERFACES -------------vid 49 (moderno y mejorado -java 17)
//ejemplo. haremos un programa de gestion de empleados el cual como principal metodo 
//sera ordenar por sueldo a los empleado
public class Jefe6mod extends Empleado6mod {
	private double incentivo;
	Jefe6mod(String nombre,String dni,double sueldo, double incentivo){
		super(nombre,dni,sueldo);
		this.incentivo=incentivo;
	}
	public double getIncentivo() {
		return incentivo;
	}
	@Override
	public double getSueldo() {
		return super.getSueldo()+incentivo;
	}
	@Override
	public String toString() {
		return super.toString()+"| incentivo: %.2f".formatted(getIncentivo()) ;
	}
}
