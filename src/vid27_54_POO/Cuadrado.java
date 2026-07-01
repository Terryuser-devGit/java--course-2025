package vid27_54_POO;

public class Cuadrado extends Figura{
	//atributos
	private double lado;
	//constructor
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	//metodos
	@Override
	public void dibujar() {
		System.out.println("Dibujando un Cuadrado");
	}
	@Override
	public double calcularArea() {
		return lado*lado;
	}
}
