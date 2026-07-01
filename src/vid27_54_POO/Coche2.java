package vid27_54_POO;
	//USO DE LA ENCAPSULACION. donde se ocultan detalles internos de la clases
public class Coche2 {
	//EJEMPLO 2.- creacion de un programa de administracion coche2 donde se muestra abstraccion,modularizacion, encapsulacion
	// ya que desde Uso_Coche ya NO se puede modificar los atributos de Coche2 y eso es correcto 
	//ATRIBUTOS
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	//CONSTRUCTOR
	public Coche2() {
		ruedas=4;
		largo=10;
		ancho=5;
		motor=1500;
		peso=2500;
	}
	//METODOS
	//los atributos solo se puede modificar desde la misma clase ya que tienen el modificador PRIVATE.
}
