package vid27_54_POO;
// HERENCIA Y POLIMORFISMO-----vid 42,43 y 44
public class Uso_Empleado5 {
	public static void main(String[] args) {
		Jefe one= new Jefe("Javier",10000);
		one.setIncentivo(5000);
		System.out.println(one.getSueldo());
		Empleado5[] trabajadores = new Empleado5[6];//N. el arreglo recibira objetos de tipo Empleado5 y Jefe, esto es polimorfismo.
				trabajadores[0]=new Empleado5("juan",3000,1991,1,1);
				trabajadores[1]=new Empleado5("alber",4000,1992,2,2);
				trabajadores[2]=new Empleado5("yanet",5000,1993,3,3);
				trabajadores[3]=new Empleado5("luis",6000,1994,4,4);
				trabajadores[4]=one;//N. Este es polimorfismo, pirncipio de sustitucion, se usa jefe como Empleado5
				trabajadores[5]=new Jefe("dani",8000);
				((Jefe)trabajadores[5]).setIncentivo(5000);//ESTO ES downcasting controlado: pq el metodo existe para JEFE y no para Empleado5
				
		for(Empleado5 x:trabajadores) {
		x.subeSueldo(10); //N. polimorfismo real.-el metodo se comporta de acuerdo al tipo de objeto, ya sea jefe o emmpleado5 (ESTO SE LLAMA ENLAZADO DINAMICO) o (POLIMORFISMO DINAMICO) o Polimorfismo en tiempo de ejecución (Dynamic Binding) 
		System.out.println(x);//polimorfismo real.- Si x es Jefe → ejecuta el toString de Jefe. Si x es Empleado → ejecuta el toString del padre. Polimorfismo en tiempo de ejecución (Dynamic Binding)
		}
	}
}