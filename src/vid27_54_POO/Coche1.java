package vid27_54_POO;

public class Coche1 {
	/* POO.- la programacion orientada es un enfoque de programacion en el cual lleva la naturaleza de los objetos de la vida real a la programacion
	 * ventaja es que se divide en Clases o modulos o partes que trbajan jununidos entre si par que todo funcione como uno
	 * CLASE.- Es el molde o modelo en la cual se define la estructura y el comportamiento de los objetos. EJEM. PERRO
	 * 		   Y tiene atributos, constructor, metodos
	 * OBJETO.-Es la ejemplarizacion de la CLASE, tambien llamado INSTANCIA DE CLASE, EJEMPLO. PASTOR ALEMAN
	 * 
	 * PILARES DE LA POO
	 * 
	 * 1.ABSTRACCION.-REPRESENTAR CARACTERISTICAS ESENCIALES, creacion se clases que representan conceptos del mundo real (libro)
	 * 2.ENCAPSULACION.- OCULTAR DETALLES INTERNOS, datos protegidos ( acceso mediante Setters y getters)
	 * 3.HERENCIA.- CREAR NUEVAS CLASES BASADAS EN EXISTENTES, reutilizacion de codigo, jerarquia de clases 
	 * 4.POLIMORFISMO.- MULTIPLES FORMAS DE REALIZAR UNA ACCIONES, un objeto puedo tomar multiples formas.
	 *-------------------------------------------------------------------------------------------
	 * INTERFACES.- CONTRATO QUE DEBER CUMPLIR LAS CLASES, multiples herencias
	 * 
	 * NOTITAS
	 * 1.- EL CONTRUCTOR (o METODO CONSTRUCTOR)  tiene el mismo nombre de la CLASE que lo contiene, esa su caracteristica principal que lo diferencia de otros metodos
	 * 2.- Los valores de los ATRIBUTOS se asigan en el CONSTRUCTOR
	 * 3.- el CONSTRUCTOR es el que da el estado inicial a un objeto.
	 * 4.- pueden haver varias clases en un programa, pero solo existe una UNICA CLASE PRINCIPAL y este contiene un UNICO METODO main(que es el punto de ejecucion el programa)
	 * 5.- las clases se nombran con primera letraMayuscula, sin espacion, sin caracteres, nunca numero al inicio (Coche, Libro, etc)
	 * 6.- los paquetes se nombran todos con letra minuscula, sin espacios, sin carateres, nunca numero al inicio (paquete2025, vid7_28, etc)
	 */
		
		//EJEMPLO 1.- creacion de un programa de administracion coche1 donde se muestra abstraccion,modularizacion, pero no existe encapsulacion
		//            ya que desde Uso_Coche se puede modificar los atributos de Coche y eso es incorrecto (para evitar eso se usa encapsulacion)
	//------------------------------------------------------------------------------------------------------------
	//ATRIBUTOS
		int ruedas;
		int largo;
		int ancho;
		int motor;
		int peso;
	//CONSTRUCTOR
		public Coche1() {
			ruedas=4;
			largo=10;
			ancho=5;
			motor=1500;
			peso=2500;
		}
	//METODOS
		
}
