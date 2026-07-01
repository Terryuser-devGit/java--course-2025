package vid27_54_POO;
//USO DE INTERACES ....VID 51
//HAREMOS UN PROGRAMA DE GESTION DE EMPLEADOS(EMPLEADO(padre) Y JEFE (hija)) los cuales implementaran
//las interfaces Trabajadores y Jefes
public class Jefe8 extends Empleado8 implements Jefes8 {
	//atributos
	private double incentivo;
	//constructor
	public Jefe8(String nombre, String dni, double sueldo, int anio, int mes, int dia, double incentivo) {
		super(nombre,dni,sueldo,anio,mes,dia);
		this.incentivo=incentivo;
	}
	//metodos
	public double getIncentivo() {
		return incentivo;
	}
	@Override
	public double getSueldo() {
		return super.getSueldo()+incentivo;
	}
	@Override//el metodo de la interfaz Jefe8
	public void tomarDecision(String decision) {
		System.out.println("Decision tomada por el jefe "+getNombre()+" :"+decision);
	}
	@Override//el metodo de la interfaz Trabajadores8 pq Jefe8 es hija de Trabajadores8
	public double estableceBonus(double bonus) {
		double prima=2000;
		return Trabajadores8.bonusBase+prima+bonus;//N. Trabajadores8.bonusBase es un K que pertenece a la interfaz
	}
	@Override
	public String toString() {
		return super.toString()+" |incentivo: %.2f".formatted(getIncentivo());
	}

}
