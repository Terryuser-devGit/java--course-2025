package vid27_54_POO;

public class Circulo extends Figura {
	//atributos
	private double radio;
	//constructor
	public Circulo(double radio) {
		this.radio=radio;
	}
	//metodos
	public void dibujar() {
		System.out.println("Dibujando un Circulo");
	}
	@Override
	public double calcularArea() {
		return radio*radio*(Math.PI);
	}
	
}
