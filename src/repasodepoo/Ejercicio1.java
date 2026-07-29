package repasodepoo;
//Ejercicio 1: mostrar un Hola mundo
public class Ejercicio1 {
	//1 forma con POO
	public void mostrarmensaje() {
		System.out.println("Hola Mundo usando enfoque de POO");
	}
	//2 forma usando static
	public static void mostrarmensajes() {
		System.out.println("hola mundo desde la memoria osea static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 mensaje= new Ejercicio1();
		mensaje.mostrarmensaje();//1 forma
		
		mostrarmensajes(); //2 forma
	}

}
//N. una clase se pueda instanciar dentro de la misma clase, por eso dentro del metodo main de la misma clase , se esta instanciando la misma clase
//N. El método main es static: Esto significa que existe de forma independiente a cualquier objeto
//N. los metodos static pertenecen a la clase y no a los objetos
/*N. los metodos static son cargados directamente en la memoria desde el primer segundo
* entonces se pueden llamar entre metodos estaticos en la memoria, como main es static entonces por eso nuestro
* programa funciona pq se mudan al mismo nivel de existencia en la memoria y pueden hablarse directamente
*/
/* N.  la regla dice para llamar a un metodo estatico se debe asi asi:
	a.- desde otra clase
	NombreDeLaClase.nombreDelMetodo();	 
	ejem: Math.pow(2, 3) 				
	b.- desde la misma clase
	nombreDelMetodo();// desde la misma clase, el compilador ya sabe que te refieres a la clase, opcionalemente tambien sirve esto NombreDeLaClase.nombreDelMetodo(); 
	ejem: mostramensajes();
*/