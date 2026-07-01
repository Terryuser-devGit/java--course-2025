package vid27_54_POO;

import java.util.Scanner;

import javax.swing.JOptionPane;

//uso de Enum --(vid48)
//haremos un programa que solo pueda tner cierto conjunto de datos posibles, en
//este caso pondremos los dias de la semana
//N. los enum veelo como una clase, su tratamiento y la sintaxis son casi iguales
//1 TRATATIVA
//osea declaras como clase (en otro archivo (en eclipse: new->enum ) y lo llamas en otro archivo Uso_dias
//2 ANALOGIA COMO MEMOTECNIA
//public class Dias -> en vez de class se pone enum 
//public enum  Dias 
public class Uso_Dias {

	public static void main(String[] args) {
		System.out.println("---------Ejemplito 1: usando el valor exacto de las Instancias, ejem: LUNES----------");
		Dias hoy=Dias.LUNES;
		//hoy es tipo dia y solo puede tomar los valores que le dimos,
		//osea las instancias ya vienen creadas y solo pueden tomar esos valores
		System.out.println(hoy);
		if(hoy==Dias.LUNES) {
			System.out.println("ES INICIO DE SEMANA");
		}
		else {
			System.out.println("ES UN DIA NORMAL");
		}
		
		System.out.println("---------Ejemplito 2: de un String a Enum----------");
		String text="domingo";
		// convertimos a enum
		Dias diaConvertido=Dias.valueOf(text.toUpperCase());//pero antes lo convertimos a MAYUS y luego a ENUM
		System.out.println(diaConvertido);
		if(diaConvertido==Dias.DOMINGO) {
			System.out.println("ES DIA DE ALABANZA");
		}
		else {
			System.out.println("ES UN DIA NORMAL");
		}
		
		System.out.println("--------Ejemplito 3: enum en switch (muy usado)");
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa un dia de la semana");
		String diaingresado=entrada.next();
		Dias diaConvertido2=Dias.valueOf(diaingresado.toUpperCase());
		switch(diaConvertido2) {
			case LUNES://N. En un switch con enums, Java ya conoce el tipo de la variable evaluada,
				       //por lo que los case san directamente los nombres de las constantes 
				      //sin necesidad de calificarlas con el tipo del enum.
				      //OJO. pero solo dentro del switch en otras partes usar Dias.LUNES
				System.out.println("Hoy es el primer dia de la semana");
				break;
			case VIERNES:
				System.out.println("es fin de semana");
				break;
			case DOMINGO:
				System.out.println("hoy es día de adorar al SEÑOR");
				break;
			default:
				System.out.println("Hoy es un dia normal");
				break;
				
		}
	}

}
/*
 * 💡 Importante los enums:
	Se compara con == (no con .equals()).
	
	💡 Si haces esto 
	if (hoy == "LUNES") // ❌ ERROR
	👉 NO funciona porque: hoy es tipo Dia y "LUNES" es tipo String
    Son tipos diferentes → Ja va no los compara
	
	🔥 REGLA DE ORO
	❌ No compares enum con String directamente
	✅ Mejor convierte:
	enum → String (.name())
	o 
	String → enum (valueOf())
	👉 Y en sistemas reales SIEMPRE se prefiere:
	✔ trabajar con enum, no con String

 */
