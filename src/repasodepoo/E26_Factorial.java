package repasodepoo;
import java.util.Scanner;
//Ejercicio 26: calcular el factorial de un numero
public class E26_Factorial {
	public static long calculaFactorial(int numero) {
		if(numero==1 || numero ==0) {
			return 1;
		}
		else {
			return numero*calculaFactorial(numero-1);
		}
	}
	public static long calculaFactorial2(int numero){
		long factorial=1;
		for(int i=2;i<=numero;i++) {
			factorial*=i; //factorial=factorial*i;
		}
		return factorial;
		
	}
	public static void main(String[] args) {
		System.out.println("Ingresa el numero factorial a calcular:");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		System.out.println("metodo 1: "+numero+"! = "+calculaFactorial(numero));
		System.out.println("metodo 2: "+numero+"! = "+calculaFactorial2(numero));
		teclado.close();
	}

}
/*N. public static int calculaFactorial2(int numero){
 * 	}
 *  si lo dejamos asi con el metodo tipo int estariamos cometiendo un terrible error porque
 *  el factorial de 13! es = 6,227,020,800 y en int el numero maximo que puedes guardar es 2,147,483,647
 *  por lo cual daria un error, por ello se debe definir como Long o un tipo de datos que acepte numeros grandes
*/
