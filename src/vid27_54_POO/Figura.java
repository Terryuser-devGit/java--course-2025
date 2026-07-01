package vid27_54_POO;
//REFUERZO DE POLIMORFISMO --(vid POO hasta vid44)
//ejemplo. Esta vez, usaremos una jerarquía de clases relacionadas con figuras geométricas.
//Esto te ayudará a entender mejor cómo el polimorfismo permite tratar objetos 
//de diferentes clases de manera uniforme
public class Figura {
	//atributos   --no tiene //N. una clase puede NO Tener atributos
	//constructor --no tiene //N. Una clase puede NO tener constructor
							//cuando no escribes ni un constructor, java crea el 
							//constructor por defecto implicitamente , 
							//el cual no hace nada, ademas sabes que el constructor 
							//inicializa los atributos, en este caso como no tienes atributos lo dejamos en blanco
							//para que por defecto internamente se use el constructor por defecto
	//metodos
	void dibujar() {
		System.out.println("Esto es una figura geometrica");
	}
	
	double calcularArea() {
		return 0.0;
	}
	//N. implementamos estos metodos asi, pq vamos a juntar todas a las clases hijas
	//como si fueran padres (en un arreglo) y luego al momento de iterar USAREMOS
	//LA VENTAJA REAL DE POLIMORFISMO Y realizara los metodos de golpe distiguiendo
	//quien es el Padre o quien son los hijos (ESTE ES EL VERDADERO PODER DEL POLIMORFISMO)
}
	
	/*N. Es una clase base: La clase Figura está diseñada para ser heredada por otras clases 
	 * (como Circulo y Cuadrado). Las subclases pueden tener sus propios constructores
	 *  para inicializar sus atributos específicos.
	 */

	/*N. ¿Por qué la clase Figura tiene métodos vacíos o genéricos?
	 * Son métodos comunes a todas las figuras: Todos los objetos que hereden de 
	 * Figura (como Circulo y Cuadrado) deben poder dibujarse y calcular su área. 
	 * Sin embargo, la implementación específica de estos métodos depende de la
	 *  figura concreta.
	 
	 *  Permiten el polimorfismo: Al definir métodos en la clase base (Figura),
	 *  podemos garantizar que todas las subclases tengan estos métodos. 
	 *  Esto permite tratar objetos de diferentes subclases de manera uniforme 
	 *  a través de una referencia de tipo Figura
	 */

	/*. ¿Qué pasa si no defines métodos en la clase base?
	 * Si la clase base (Figura) no tuviera métodos como dibujar() o calcularArea(), 
	 * no podrías usarlos de manera polimórfica
	 * El polimorfismo solo funciona si el método está definido en la clase base(Clase Padre)
	 */
	 
	/* Resumen
		La clase Figura no tiene un constructor explícito porque no tiene atributos 
		que necesiten inicialización.

		Los métodos en Figura son genéricos para permitir el polimorfismo y garantizar 
		que todas las subclases los implementen.

		Puedes mejorar la clase Figura haciéndola abstracta, agregando atributos comunes
		o proporcionando implementaciones por defecto.

		El polimorfismo funciona porque los métodos están definidos en la clase base (Figura)
		, lo que permite tratar objetos de diferentes subclases de manera uniforme.
    */
