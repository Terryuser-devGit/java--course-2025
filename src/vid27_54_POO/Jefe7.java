package vid27_54_POO;
//USO DE INTERFACES .....VID 50
//EJMPLO. crearemos programa de gestion de empleados que implementara la interfaz Decisiones
public class Jefe7 extends Empleado7 implements Jefes7tomadordeDecisiones{
	//atributos
	private double incentivo;
	//constructor
	public Jefe7(String nombre, String dni, double sueldo, double incentivo){
		super(nombre,dni,sueldo);
		this.incentivo=incentivo;
	}
	//metodos
	public double getIncentivo() {
		return incentivo;
	}
	public void tomarDecision(String decision) {
		System.out.println("la decision del jefe :"+decision);
	}
		
	@Override
	public double getSueldo() {
		return super.getSueldo()+incentivo;
	}
	@Override
	public String toString() {
		return super.toString()+"| incentivo: %.2f".formatted(getIncentivo());
	}
}
