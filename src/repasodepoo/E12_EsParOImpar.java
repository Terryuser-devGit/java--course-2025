package repasodepoo;
import java.util.Scanner;
//Ejercicio 12 : determinar si un numero es Par o Impar
public class E12_EsParOImpar {
	public static String esParOImpar(double numero) {
		if(numero%1!=0) {
			return "El numero es Decimal";	
		}
		else if (numero%2==0){
			return "El numero es par";
		}
			else {
			return "El numero es impar";
			}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el numero:");
		double numeroingresado=teclado.nextDouble();
		System.out.println(esParOImpar(numeroingresado));
		teclado.close();

	}

}
