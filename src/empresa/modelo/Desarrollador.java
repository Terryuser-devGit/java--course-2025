package empresa.modelo;
//MODIFICADORES DE ACCESO----  vid 47 
public class Desarrollador extends Empleado{
	private String lenguaje;
	
	public Desarrollador(String nombre, double salarioBase, int anios, String lenguaje) {
		super(nombre, salarioBase,anios);
		this.lenguaje=lenguaje;
	}
	
	@Override
	public double calcularSalario() {
		double bono=aniosAntiguedad*100;
		return getSalarioBase()+bono;
	}
}
