package repasodepoo;

import java.util.Locale;
import java.util.Scanner;

//Ejercicio 3: Restar dos numeros
public class E03_RestarDosNumeros {
	public static double restar(double minuendo, double sustraendo) {
		return minuendo - sustraendo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("ingresa el minuendo");
		double minuendo = teclado.nextDouble();
		System.out.println("ingresa el sustraendo");
		double sustraendo=teclado.nextDouble();
		System.out.println("la diferencia es "+ restar(minuendo,sustraendo));
		teclado.close();
		
	}

}
/* N
 * 1. por convencion siempre debes cerrar el scanner con close;
 */