package vid27_54_POO;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("----------------------------------video 33,34,35----------------------------Class Empleado1");	
	Empleado1 worker1= new Empleado1("fredy sosaya",2000,1980,12,10);
	Empleado1 worker2= new Empleado1("carlos araujo",3000,1990,11,9);
	Empleado1 worker3= new Empleado1("raul pomastre",4000,2000,10,8);
	worker1.subeSueldo(10);
	worker2.subeSueldo(10);
	worker3.subeSueldo(10);
	System.out.println("empleado 1: "+worker1.getNombre()+", sueldo: "+worker1.getSueldo()+", fecha de contrato: "+worker1.getAltaContrato());
	System.out.println("empleado 2: "+worker2.getNombre()+", sueldo: "+worker2.getSueldo()+", fecha de contrato: "+worker2.getAltaContrato());
	System.out.println("empleado 3: "+worker3.getNombre()+", sueldo: "+worker3.getSueldo()+", fecha de contrato: "+worker3.getAltaContrato());
	System.out.println(worker1);// vid27_54_POO.Empleado1@31befd9f (sale asi antes de sobreescibir el metodo toString()
	//vid27_54_POO.Empleado1@31befd9f    N.te sale asi porque si o si cuando le das system.out.println("objeto")
	//java lo lleva a un system.out.println(objeto.toString()) y sino reescribiste el toString() java usa el de la clase
	//object del cual todos heredan y este metodo retorna el nombredeclase+@+numeroheaxadecimal(identificador);
	//por eso debes sobreescribir el toString en las clases que creadas, para que cuando le pases al println(objeto)
	//use el metodo sobreescrito.
	/*
	 * pero que pasa si system.out.println("texto"), la respuesta es que se sabe que los metodos son sobrecargados 
	 * y actuan de acuerdo al parámetro pasado, entonces solo imprime el string y ya, estos parametros puede recibir
	 *  println(String x) , Imprime el texto tal cual
	 *  println(int x) println(double x), Imprime el numero tal cual
	 *  println(Object x) AQUI SI USA x.toString(), si lo sobrescribiste bien sino el de OBJECT
	 *  println("texto " + object x) AQUI SI USA x.toString(), por el tipo object (ojaso pq + convierte todo a to String())
	 --entonces en esta misma clase sobreescribiremos el metodo toString();
	 */
	System.out.println("--------VAMOS CON toString()--------------");
	System.out.println(worker1);
	System.out.println(worker2);
	System.out.println(worker3);
	//nota hasta aqui el programa funciona para subir el sueldo de unos cuantos empleados
	//pero si quiero aumentar el sueldo de 400 empleados a todos en un 10%, como hacemos para no hacer uno por uno
	//aqui usamos los arrays tipo clase 
	System.out.println("------------vamos con Arrays tipo Empleado------------");
	Empleado1[] arrayempleado= new Empleado1[3];// N. 10 es el tamaño del array
	arrayempleado[0]=new Empleado1("fredy sosaya",2000,1980,12,10); //N. Ahora cada posición contiene un objeto
	arrayempleado[1]=new Empleado1("carlos araujo",3000,1990,11,9);
	arrayempleado[2]=new Empleado1 ("raul pomastre",4000,2000,10,8);
	//arrayempleado[0]=("fredy sosaya",2000,1980,12,10); 
	//ERROR PQ ("fredy sosaya",2000,1980,12,10) NO es un objeto, Java no sabe qué hacer con esa tupla de valores
	//Java NO permite asignar valores así.
	
	/*N. Un array de objetos en Java NO guarda objetos
	 *   👉 Guarda REFERENCIAS a objetos
	 *   
	      arrayempleado ──► [ ref ] [ ref ] [ ref ] [ null ] ...
                   			   │      │      │
                   		       ▼      ▼      ▼
                			Empleado Empleado Empleado
	 .Primero creas el array
	 .Luego creas cada objeto con new
	 OJO.
	 NO OLVIDAR En Java SIEMPRE debes usar new para objetos.
	 */
	for(Empleado1 x:arrayempleado) {
		x.subeSueldo(10);  
		System.out.println(x);
	}
	/*N. lo que hace java en on foreach es equivalente a esto
	 *  for (int i = 0; i < arrayempleado.length; i++) {
	 *  	empleado1 x=arrayempleado[i] //esto lo es todo
	 *  	x.subesueldo(10)
	 *  	System.out.println(x);
	 */
	System.out.println("---------------------fin class--video 33,34,35----------------------------Class Empleado1");
	//--------------------------fin class Empleado1------------------------------------
	
	System.out.println("-----------Class Empleado2-------video 36");
	Empleado2 trabajador1= new Empleado2("Alberto");
	Empleado2 trabajador2= new Empleado2("Rosa");
	System.out.println("nombre :"+trabajador1.getNombre()+", area:"+trabajador1.getSeccion());//nombre: alberto, area: administracion
	System.out.println("nombre :"+trabajador2.getNombre()+", area:"+trabajador2.getSeccion());//nombre: rosa, area: administracion
	trabajador1.estableSeccion("Logistica");//al trabajador1 (ALBERTO), le cambiamos el area a LOGISTICA (VALIDO)
	trabajador1.estableceNombre("Raul");//al trabajador1 (ALBERTO), le cambiamos el nombre a RAUL (es INCONSISTENTE)
	//ENTONCES ahora el trabajador1 -->Raul, Logistica ( totalmente distinto a ) Alberto, Administracion
	//en otrads palabras se ha desvirtuado la integridad el programa pq no se puede eliminar o manejar asi la gestion de empleados
	//para solucionar este tipo de incosistencias se usa la palabra FINAL y lo veremos en la clase Empleado3
	System.out.println("-----------fin class Empleado2-------------------------vid 36");
	//--------------------------fin class Empleado2------------------------------------
	System.out.println();
	System.out.println("-----------Class Empleado3-------video 36");
	Empleado3 chamber1=new Empleado3("Alberto");//Alberto, Area: Administracion
	Empleado3 chamber2=new Empleado3("Rosa");//Rosa, Area: Administracion
	System.out.println(chamber1);//se sobresescribio el metodo ToString de la clase Object, por eso el de nuestra clase
	System.out.println(chamber2);//se sobresescribio el metodo ToString de la clase Object, por eso el de nuestra clase
	chamber1.estableceArea("Logistica");//si se puede cambiar el Area
	chamber1.estableceNombre("Raul");//esto no hace NADA, pq en la misma clase no dejaba asignar nombre por el FINAL, por eso este metodo esta en blanco comentado 
	System.out.println(chamber1);//Alberto, Area: Logistica (CORRECTO)
	System.out.println(chamber2);//Rosa, Area: Administracion (CORRECTO)
	System.out.println("-----------fin class Empleado3---------------------------");
	//--------------------------fin class Empleado2------------------------------------
	}

}
