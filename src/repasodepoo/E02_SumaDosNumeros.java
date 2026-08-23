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
 *4 En sistemas reales los calculos se hacen Leendo los datos en forma de String y luego los llevas a la clase BigDecimal(ejecuta los calculos como son en la vida real)
 * ejem (sin bigdecimal)  
 * double a = 0.1;
 * double b = 0.2;
 * System.out.println(a + b); // Imprime: 0.30000000000000004 (lo cual en la vida real es un error)
 * ejem (con bigdecimal)
 * BigDecimal x = new BigDecimal("0.1");
 * BigDecimal y = new BigDecimal("0.2");
 * System.out.println(x.add(y)); // Imprime: 0.3  (Exacto) (asi es en la vida real)
*/
