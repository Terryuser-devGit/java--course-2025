package vid27_54_POO;
//USO DE SETTERS Y GETTERS (vid 30)
/* EJEMPLO3. programa de administracion de coches, para que desde la clase principal se puede mostrar los atributos de un
 un objeto, ya que desde la clase coche2 no se puede mostrar los atributos
*/

public class Coche3 {
	//ATRIBUTOS
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color; 
	//CONSTRUCTOR
	public Coche3() {
		ruedas=4;
		largo=10;
		ancho=5;
		motor=1500;
		peso=2500;
	}
	//METODOS
	//setters
	public void establece_color() {
		color="azul";
	}
	
	//getters
	public String getcolor() {
		return color;
	}
	
	public int getmotor() {
		return motor;
	}
	
}
