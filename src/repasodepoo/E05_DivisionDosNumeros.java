package repasodepoo;

import java.util.Scanner;

//ejercicio 5: hare la division de dos numeros
public class E05_DivisionDosNumeros {
	public static double division(double dividendo, double divisor) {
		return dividendo/divisor;
	}
	
	public static String divisionEntera(double dividendo, double divisor) {
		//int cociente = (int)dividendo/(int)divisor; //N. tener cuidado al castear
		int cociente = (int)(dividendo/divisor); 
		double residuo = dividendo%divisor; 
		return "el cociente es: "+cociente+ " y el residuo es :"+residuo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa el dividendo");
		double dividendo =teclado.nextDouble();
		System.out.println("ingresa el divisor");
		double divisor = teclado.nextDouble();
		System.out.println("la division exacta es:"+division(dividendo,divisor));
		System.out.println("la division entera es:"+divisionEntera(dividendo,divisor));
	}

}
/* N. en los casteos revisar bien si estas truncando datos, porque al truncar estas quitando decimales que una sola linea no habria problemas
 * pero cuando ya son dos lineas o ya hay otras operaciones los decimales perdidos juegan un papel importante en el resultado
 * mira 
 *  dividendo 10,1           --> (int)dividendo 10 
 *  divisor 2,2              --> (int) divisor 2
 *  q=4 y r=1.3 (correcto)        q= 5 y r=1.3  (con el casteo y luego operacion se pierde decimales y te sale q errado)
 *  por eso es mejor revisa bien, y los casteos mejor hacer cuando ya es dato final que ya no se operara
 */
