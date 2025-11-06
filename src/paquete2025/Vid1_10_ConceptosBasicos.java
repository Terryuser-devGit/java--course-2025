package paquete2025;

public class Vid1_10_ConceptosBasicos {

	public static void main(String[] args) {
		
		/** TIPOS DE DATOS
		 --ENTEROS
		 BYTE - 1 byte (127)
		 SHORT- 2 byte (32 k)
		 INT -  4 byte (2 M)-----mas usado-------
		 LONG - 8 byte (INFINITO CON L)
		 --DECIMALES
		 FLOAT- 4 byte (7 cifras decimales con sufijo F)
		 DOUBLE-8 byte (15 cifras decimales) ----mas usado---
	    */
		
		/**
		 * LA REGLA QUE NO DEBES OLVIDAR EN QUE LAS ASIGNACIONES DEBEN SER DEL MISMO TIPO 
		 */
		
		//operadores importantes division
		
		
		/* OJO AQUI ESTE ES EL RESUMEN 
		 * Nota: la division realiza de acuerdo al tipo de datos del dividendo(d)/Divisor(D) y este resultado cociente(ya sea del tipo d o D) recien se asigna o(conversion implicita)
		 * al tipo de variable que desear asignar 
		 * NOTA DIVISION DE ENTEROS (BYTE, SHORT, INT, LONG ) COMO EN ARITMETICA TODOS SON ENTEROS 
		 * NOTA DIVISION EN DECIMALES( FLOAT, DOUBLE) COMO EN ARITMETICA TODOS SON DECIMALES
		 * SI COMBINAS AMBOS EN EL d o D SE CONVIRTE EN UNA DIVISION EN DECIMALES
		 * Y LUEGO APLICAS LA CONVERSION IMPLICITA DE Java promociona al tipo más grande y a ese tipo debes asignar la igualdad, jamas a un tipo menor
		*/
		/** lo que debes recordar es que la conversion implicita se da siempre del menor al mayor
		 recibe o absorve 
		 double<-float<-long<-int<-short<-bite (<--- en este sentido)
		 */
		int a=5;int b=2;
		double c=3;
		long d=4L;
		float e=9F;
		byte f=12;
		
		int x=a/b; // x=2, la division es entera pq el d/D son enteros y esta asignado a un entero
		double y=a/b;//y=2.0 , la division se hace entera pq el d/D son enteros y luego se hace una conversion implicita de 2  int a 2.0 double,
		//porque asi funciona la conversion implicita
		
		//int y=a/c;  error pq C es double y una division con double (ya sea d o D double) deber ser asignado a otro double y no a un int
		double z=a/c; // z=1.666 pq C es double, la division se hace double pq el d o D son double y luego es asignado a un double
		double w=a+b; // w=7.0 porque hace una consversion implicita
		long p=a/d; //p=1, por 5/4L ambos son enteros aritmeticamente,es una division entera (el 4L velo como el 4 normal, solo que ocupa 8 byte (nota: solo se pone L al momento de asignar )
		float q=d+e; //13.0 sin F, (FLOAT<-LONG) solo al asignar se pone F, sale asi d=4L(4 normal) y f=9F( como 9.0), OJO: no olvidar Java promociona al tipo de dato más grande");
		double r=c+q;//16.0 porque q=13.00 float(internamente 4 byte)+ c=3.0 double
		float s=e+f;//21.00 sin F internamente tiene F, porque  e=9F( como 9 normal) y f=12 byte ( como 12 normal)
		
		System.out.println("int a=5;int b=2; int x=a/b \n x :="+x+ " la division es entera pq el d/D son enteros y esta asignado a un entero");
		System.out.println();
		System.out.println("int a=5;int b=2; double y=a/b \n y :="+y+ " la division se hace entera pq el d/D son enteros y luego se hace una conversion implicita de 2  int a 2.0 double porque asi funciona la conversion implicita");
		System.out.println();
		System.out.println("int a=5;double c=3; int y=a/c;  \nERROR  pq C es double y una division con double (ya sea d o D double) deber ser asignado a otro double y no a un int");
		System.out.println();
		System.out.println("int a=5;double c=3; double z=a/c \n z :="+z+ " la division se hace double pq el d o D son double y luego es asignado a un double");
		System.out.println();
		System.out.println("int a=5;int b=2; double w=a+b \n w :="+w+ " porque hace una consversion implicita de menor a mayor (double<-int) pq asi funciona la conversiona implicita");
		System.out.println();
		System.out.println("int a=5;long d=4L; long p=a/d \n p :="+p+ " por 5/4L(ambos son enteros aritmeticamente) es una division entera (el 4L velo como el 4 normal, solo que ocupa 8 byte (nota: solo se pone L al momento de asignar )");
		System.out.println();
		System.out.println("long d=4L; float e=9F; float q=d+e \n q :="+q+ " (FLOAT<-LONG) solo al asignar se pone F, sale asi d=4L(4 normal) y f=9F( como 9.0), OJO: no olvidar Java promociona al tipo de dato más grande");
		System.out.println();
		System.out.println("double c=3; float q=13; double r=c+q \n r :="+r+ " (DOUBLE<-FLOAT), OJO: no olvidar Java promociona al tipo de dato más grande");
		System.out.println();
		System.out.println("float e=9F; byte f=12; float s=e+f \n s :="+s+ " (FLOAT<-BYTE), OJO: no olvidar Java promociona al tipo de dato más grande");
  	
		
		/**LA PALABRA FINAL SIRVE PARA ASIGNAR CONSTANTES YA SE EN VARIALES, METODOS Y CLASES
		    con ello estamos indicando que los valores asignados no se podran cambiar con la ejecucion del programa
		 */
		final int h=10;
		      int k=10;
		      //h=h+k; esto es un error pq h ya no puede cambiar de valor
		  
		
	}

}