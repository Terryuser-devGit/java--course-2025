package empresa.modelo;
//MODIFICADORES DE ACCESO----  vid 47
public class Gerente extends Empleado{
	private double bonoFijo;
	
	public Gerente(String nombre, double salarioBase, int aniosAntiguedad,double bonoFijo) {
		super(nombre,salarioBase,aniosAntiguedad);
		this.bonoFijo=bonoFijo;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase()+bonoFijo;
	}
}
