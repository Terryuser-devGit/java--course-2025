package repasodepoo;

import java.util.Scanner;

public class E11_EsPositivo {
//Ejercicio 11: Determinar si un numero Es positivo
	public static String esPositivo(double numero) {
		if(numero>0) {
			return "El numero es positivo";
		}
		else if(numero <0) {
			return "El numero es negativo";
		}
			else {
				return "El numero es 0 y no tiene signo";
			}
		
	}
	public static void main(String[] args) {
		System.out.println("ingresa el numero:");
		Scanner teclado = new Scanner(System.in);
		double numeroIngresado=teclado.nextDouble();
		System.out.println(esPositivo(numeroIngresado));
		teclado.close();
	}

}
