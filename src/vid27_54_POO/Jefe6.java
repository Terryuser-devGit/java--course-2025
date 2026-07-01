package vid27_54_POO;
//USO DE INTERFACES -------------vid 49 (CLASES USADAS EMPLEADO6, JEFE6, USO_EMPLEADO6)
//ejemplo. haremos un programa de gestion de empleados el cual como principal metodo 
//sera ordenar por sueldo a los empleados
public class Jefe6 extends Empleado6 {
	private double incentivo;
	Jefe6(String nombre,String dni,double sueldo, double incentivo){
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
		return "nombre:"+getNombre()+", dni:"+getDni()+", sueldo:"+getSueldo()+", incentivo: "+incentivo;
	}
}
