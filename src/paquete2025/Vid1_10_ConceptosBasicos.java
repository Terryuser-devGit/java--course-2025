package paquete2025;

public class Vid1_10_ConceptosBasicos {

	public static void main(String[] args) {
		
		/** TIPOS DE DATOS
		 --ENTEROS
		 BYTE - 1 byte (127)
		 SHORT- 2 byte (32 k)
		 INT -  4 byte (2 M)
		 LONG - 8 byte (INFINITO CON L)
		 --DECIMALES
		 FLOAT- 4 byte (7 cifras decimales con sufijo F)
		 DOUBLE-8 byte (15 cifras decimales) 
	    */
		
		/**
		 * LA REGLA QUE NO DEBES OLVIDAR EN QUE LAS ASIGNACIONES DEBEN SER DEL MISMO TIPO 
		 *********************/
		
		//operadores importantes division
		
		int a=5;int b=2;
		double c=3;
		long d=8L;
		float e=9F;
		byte f=12;
		
		int x=a/b;
		double y=a/b;//y=2.0 , la division se hace entera porque los dos operandos son enteros y luego se hace una conversion 
					//implicita de 2  int a 2.0 double, porque asi funciona la conversion implicita
		//int y=a/c;  error pq C es double y una division con double deber ser asignado a otro double
		double z=a/c; // y=1.666 pq C es double 
		double w=a+b; // w=7.0 porque hace una consversion implicita
		double p=a/d; //p=0.0, por 5/8L es una division entera (el 8L velo como el 8 normal, solo que ocupa 8 byte (nota: solo se pone L al momento de asignar )
		float q=d+e; //17.0 sin F, solo al asignar se pone F, sale asi d=8L(8 normal) y f=9F( como 9.0, pero con valor 4 byte)
		double r=c+q;//20.0 porque q=17.00 float(internamente 4 byte)+ c=3.0 double
		float s=e+f;//21.00 sin F internamente tiene F, porque  e=9F( como 9 normal) y f=12 byte ( como 12 normal)
		
		System.out.println("x :" +x);
		System.out.println("y :" +y);
		System.out.println("z :" +z);
		System.out.println("w :" +w);
		System.out.println("p :" +p);
		System.out.println("q :" +q);
		System.out.println("r :" +r);
		System.out.println("s :" +s);
		
  		/** lo que desbes recordar es que la conversion implicita se da siempre del menor al mayor
		 recibe o absorve double<-float<-long<-int<-short<-bite (<--- en este sentido)
		 */
		
		/**LA PALABRA FINAL SIRVE PARA ASIGNAR CONSTANTES YA SE EN VARIALES, METODOS Y CLASES
		    con ello estamos indicando que los valores asignados no se podran cambiar con la ejecucion del programa
		 */
		final int h=10;
		      int k=10;
		      //h=h+k; esto es un error pq h ya no puede cambiar de valor
		
		
	}

}
