package repasodepoo;
import java.util.Scanner;

//Ejercicio 7: Convertir grados Celsius a Fahrenheit
public class E07_ConvertirCelsiusaFahrenheit {
	public static double convertirAFahrenheit(double gradocelsius) {
		return (gradocelsius*9/5)+32;//N. para forzar la division (gradocelsius*9.0/5.0)+32 (correcto)

	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa los grados celcius que quieres convertir a Fahrenheit");
		double gradoCelsius=teclado.nextDouble();
		System.out.println(gradoCelsius+"°C convertido a Fahrenheit es: "+convertirAFahrenheit(gradoCelsius)+"°F");
		//System.out.println((8*9/5)+32);
		teclado.close();
		
	}

}

/*NOTA. aqui hay que tener cuidado porque la division se hace de acuerdo al tipo de datos 
*en este caso como el dato el dato que le estas pasando es double y por eso la division se convierte en division exacta
* (gradocelsius*9/5)+32; 
* 8.0 * 9/5 =  14.4+32= 14.4
*
*si lo hubiese definido el dato como int hubiera realizado la division como entera alli su hubiese problemas
* 8*9/5 14+32= 46 
*
*
*/