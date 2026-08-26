package repasodepoo;

import java.util.Scanner;

//Ejercicio 08: Convertir de Km a millas
public class E08_ConvertirKmAMillas {
	public static double convertirKmAMillas(double numero) {
		return 0.621371*numero;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa los kilometros que desea convertir");
		double numeroIngresado=teclado.nextDouble();
		System.out.printf("%.2f km convertido en millas es: %.2f millas%n"
						,numeroIngresado,convertirKmAMillas(numeroIngresado));
		teclado.close();
	}

}
