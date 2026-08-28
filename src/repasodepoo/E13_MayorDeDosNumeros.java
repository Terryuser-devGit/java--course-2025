package repasodepoo;
import java.util.Scanner;
// Ejercicio 13 : obtendremos el mayor de dos numeros
public class E13_MayorDeDosNumeros {
	public static double mayorDeDosNumeros(double numero1, double numero2) {
		
	   if(numero1>=numero2)
		return numero1;
		 else {
			return numero2;
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa el primer numero");
		double numero1=teclado.nextDouble();
		System.out.println("ingresa el segundo numero");
		double numero2=teclado.nextDouble();
		System.out.println("el mayor de los numeros es :"+mayorDeDosNumeros(numero1,numero2));
		teclado.close();
	}

}
