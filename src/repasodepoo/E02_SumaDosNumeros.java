package repasodepoo;

import javax.swing.JOptionPane;

//Ejercicio 2: Sumaremos dos numeros
public class E02_SumaDosNumeros {
	public static double sumar(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textoNumero1=JOptionPane.showInputDialog("ingresa el primer numero");
		double numero1=Double.parseDouble(textoNumero1);
		String textoNumero2=JOptionPane.showInputDialog("ingresa el segundo numero");
		double numero2=Double.parseDouble(textoNumero2);
		double resultado=sumar(numero1,numero2);
		System.out.println("la suma es: "+resultado);
	}

}
/*N. 
 *1 En java los nombres de los metodos es en minuscula y de las clases es en empieza con Mayuscula
 *2 los metodos static puede ser void o no void ( string, double, int)
 *3 cada método tenga una sola responsabilidad, no mesclar, osea sumar devuelve un valor y el main decide qué hacer con ese valor (cada uno con su responsabilidad) 
*/
