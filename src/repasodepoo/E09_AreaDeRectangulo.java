package repasodepoo;
import java.util.Scanner;
//Ejercicio 9: calcularemos el area de un rectangulo 


/*N. recuerda todos los metodos deben estar dentro de una clase, jamas jamas fuera*/
public class E09_AreaDeRectangulo {
	public static double calcularArea(double base, double altura) { //1 forma: creando un metodo static para llamarlo de frente
		return base*altura;
	}
	public double calcularAreaT(double base, double altura) { // 2 forma: instanciado la clase y llamando al metodo
		return base*altura;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("ingresa la base del rectangulo");
		double base=teclado.nextDouble();
		System.out.println("ingresa la altura del rectangulo");
		double altura=teclado.nextDouble();
		double resultado=calcularArea(base,altura);
		System.out.println("(Metodo 1) El area de rectangulo es:"+resultado);
		
		E09_AreaDeRectangulo o1=new E09_AreaDeRectangulo();
		double resultado2=o1.calcularAreaT(base, altura);
		System.out.println("(Metodo 2) El area de rectangulo es:"+resultado2);
	}

}
