package repasodepoo;
//Ejercicio 6: calcularemos el promedio de 03 notas

import java.util.Scanner;

public class E06_CalcularPromedio {
	public static double promedio(double nota1, double nota2, double nota3) {
		return (nota1+nota2+nota3)/3;
	}
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("ingresa el numero 1");
		double nota1=teclado.nextDouble();
		System.out.println("ingresa el numero 2 ");
		double nota2=teclado.nextDouble();
		System.out.println("ingresa el numero 3");
		double nota3=teclado.nextDouble();
		System.out.println("el promedio de las 3 notas es :"+promedio(nota1,nota2,nota3));
		teclado.close();
	}

}
