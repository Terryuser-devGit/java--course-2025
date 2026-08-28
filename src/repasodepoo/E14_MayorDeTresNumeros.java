package repasodepoo;

import java.util.Scanner;

//Ejercicio 14: haremos un programa que calcule el mayor de 3 numeros
public class E14_MayorDeTresNumeros {
	//1 metodo
	
	public static double mayorDeTresNumeros(double numero1, double numero2, double numero3) {
		
		if(numero1>=numero2) {
			if (numero1>numero3) {
				return numero1;
			}
			else {//numero1<numero3
				return numero3;
			}
		}
		else //if(numero1<numero2) {
				if (numero2<numero3) {
					return numero3;
				}
				else {//numero2>numero3
					return numero2;
				}
			

	}
	// 2 metodo
		public static double mayorDeTresNumeros2(double numero1, double numero2, double numero3) {
		return (E13_MayorDeDosNumeros.mayorDeDosNumeros
				(E13_MayorDeDosNumeros.mayorDeDosNumeros(numero1,numero2),numero3));
		
		}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa el numero1: ");
		double numero1=teclado.nextDouble();
		System.out.println("ingresa el numero2: ");
		double numero2=teclado.nextDouble();
		System.out.println("ingresa el numero3: ");
		double numero3=teclado.nextDouble();
		System.out.println("metodo 1:el mayor de los tres numeros es: "+mayorDeTresNumeros(numero1,numero2,numero3));
		System.out.println("metodo 2:el mayor de los tres numeros es: "+mayorDeTresNumeros2(numero1,numero2,numero3));
	}

}
