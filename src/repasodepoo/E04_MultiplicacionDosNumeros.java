package repasodepoo;

import java.util.Scanner;

//Ejercicio 04. haremos un programa para multiplicar 2 numeros
public class E04_MultiplicacionDosNumeros {
	/*metodo 1.- usando un metodo static,, los métodos estáticos se cargan en la memoria en el momento exacto en que la clase es cargada por el JVM
	* antes de que se cree cualquier objeto o instancia de dicha clase y 
	* como el metodo main tambien es static (ambas se comunican porque estan al mismo nivel)
	* puede invocar directamente a otros métodos estáticos de la misma clase, no es necesario instanciar la clase.
	*/
	
	public static double multiplicar(double multiplicando, double multiplicador) {
		return multiplicando*multiplicador;
	}
	//metodo 2, creando un metodo para ser llamado desde la instancia
	public double multiplicar(double multiplicando, double multiplicador, String a) {
		return multiplicando*multiplicador;
	}
	
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			//metodo con static
			System.out.println("ingresa el multiplicando");
			double multiplicando = teclado.nextDouble();
			System.out.println("ingresa el multiplicador");
			double multiplicador=teclado.nextDouble();
			System.out.println("Metodo 1: el producto es: "+multiplicar(multiplicando, multiplicador));
			//teclado.close();
			//metodo con POO
			E04_MultiplicacionDosNumeros e4= new E04_MultiplicacionDosNumeros();
			System.out.println("Metodo 2: el producto es :"+e4.multiplicar(multiplicando, multiplicador, "respuesta"));
	}

}
