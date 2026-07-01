package vid27_54_POO;

import java.util.Arrays;

//USO DE INTERFACES -------------vid 49 (CLASES USADAS EMPLEADO6, JEFE6, USO_EMPLEADO6)
//ejemplo. haremos un programa de gestion de empleados el cual como principal metodo 
//sera ordenar por sueldo a los empleado
public class Uso_Empleado6 {
	public static void main(String[] args) {
		Empleado6[] arrayempleados= {
									new Empleado6("Ricardo","41224455",8000),
									new Empleado6("Alberto","23417458",5000),
									new Empleado6("Micaela","24145478",4000),
									new Jefe6("Javier","46710010",30000,5000),
									new Jefe6("Luis","74221475",10000,2000)
		};
		/*N. vamos a ordenar el arreglo usando la Clase Arrays el cual que tiene un metodo sort(object[] x)
		y metodo ordenada de menor a mayor o en Orden Ascedente
		y ademas se ve que en la descripcion del metodo pide que los elementos del arrays en este caso los objetos
		deben implementar la Interfaz Comparable ( o dicho de otra forma los metodos la Interfaz Comparable
		se deben implementar(sobrescribir) en la clase Jefe6)
		(todo esto se ve en la API de JAVA, ademas este metodo STATIC( clase.metodo) void ( no devuelve nada)
		
		*yendo a la API de java en nos encontramos la interfaz Comparable y se ve un solo metodo
		compareTo(compara objectos especificando un orden) devuelve -1 , 0 , 1 si es objeto es menor, igual, mayor 
		correspondientemente
		*/
		
		Arrays.sort(arrayempleados);//N. como ya sobrescribimos el compareTo , los return -1,0.1 ya hicimos,
									//ya internamente estos valores son usados en el algoritmo que 
									//el programador que hizo el metodo sort para ordenar los objetos
				
		for(Empleado6 x:arrayempleados) {
			System.out.println(x);//imprime en el orden de sueldo
		}
	   
		// USO DE INSTAN OF como PLUS
		Empleado6 director= new Jefe6("miguel","42244386",500000,10000);
		Comparable trabajador=new Empleado6("carlos","41425264",50000); //N. por el principio de sustitucion si se puede
		if(director instanceof Empleado6) {
			System.out.println("es de instancia de jefe , es instancia de Empleado");
		}
		if(trabajador instanceof Comparable) {
			System.out.println("implementa la interfaz comparable");
		}
	}
}
/*N. las clases que ves en CURSIVA en la API de JAVA son interfacez
 * N. las Interfaces no se pueden instanciar 
 * 		Comparable ejemplo2=new Comparable(); error No se puede instanciar las interfaces, pq internamente el objeto seria una interfaz, algo que es un error
 * 		Comparable ejemplo2= new Empleado(); si se puede, pq internamente es objeto es un empleado 
 */
