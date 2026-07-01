package vid27_54_POO;

public class Uso_Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejemplo.- solo como ejemplo veremos como seria la gestion de un programa de Figuras sin Polimorfismo
		System.out.println("----------SIN POLIMORFISMO-----------------");
		Circulo c1= new Circulo(10);
		Cuadrado r1= new Cuadrado(10);
		c1.dibujar();//dibujando un circulo
		System.out.println("el area del circulo: "+c1.calcularArea());
		r1.dibujar();//dibujando un cuadrado
		System.out.println("el area del cuadrado: "+r1.calcularArea());
		/* Aqui hemos creado objetos de tipo Circulo y Cuadrado directamente.
			No hay polimorfismo, ya que no estamos utilizando una superclase (Figura) para referenciar 
			objetos de las subclases.
			y hasta funciona porque son dos datos, y SI fueran miles de datos esto no Funciona
			Para subsanar ello vamos a Usar el Verdadero poder de Polimorfismo en ITERACIONES,
			para ello lo agrupamos en una clase Figura y teniendo ello vamos manejarlas en grupo como Figura ( y 
			y ya en cada iteracion cada operacion sera como cuadrado o triangulo, etc 
		*/
		
		System.out.println("----------POLIMORFISMO EN ACCION-----------");
		//N. vamos a juntar todas a las clases hijas como si fueran padres (en un arreglo)
		//y luego al momento de iterar USAREMOS LA VENTAJA REAL DE POLIMORFISMO
		//Y realizara los metodos de golpe distiguiendo quien es el Padre o quien son los hijos
		//(ESTE ES EL VERDADERO PODER DEL POLIMORFISMO)
		Figura[] arrayfig= {new Cuadrado(5),
							new Cuadrado(7),
							new Cuadrado(11),
							new Circulo(2),
							new Circulo(6),
							new Circulo(8),
							new Figura(),
							new Figura()
		};
		
		for(Figura x: arrayfig) {
			x.dibujar(); //N. dynamic binding o Enlace Dinamico, En tiempo de ejecución, Java decide qué método (dibujar o calcularArea) ejecutar,
						//basándose en el tipo real del objeto (Circulo o Cuadrado), no en el tipo de la referencia (Figura)
			System.out.println("El area es: "+x.calcularArea());;
		}
		/*N. Puedes tratar objetos de diferentes clases (Circulo, Cuadrado, etc.) de manera uniforme 
		     a través de una superclase común (Figura).
		 *  Esto hace que el código sea más flexible y extensible. Por ejemplo, si añades una nueva clase Triangulo,
		    no necesitas modificar el código que usa Figura.
		 */
	}

}
