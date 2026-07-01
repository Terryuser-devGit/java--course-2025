package vid27_54_POO;

import java.time.LocalDate;

//SOBRECARGA DE CONSTRUCTORES-----vid39
//la sobrecarga de metodos te permite crear constructores de acuerdo al numero de parametros
//y el programa responde de acuerdo a la cantidad de parametros que le pases.
//Ejemplo. haremos un programa para gestionar empleados, en los cuales
//al momento de crear algunos empleados tendran datos completos y otros no, para 
//ello usaremos la sobrecarga de metodos
public class Empleado4 {
	private final String nombre;
	private String seccion;
	private double sueldo;
	private LocalDate fechacontrato;
	
	public Empleado4(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.seccion="Administracion";
		fechacontrato=LocalDate.of(anio, mes, dia);
	}  //constructor con 5 parametros
	
	public Empleado4(String nombre) {
		this.nombre=nombre;
	}	//constructor con 1 parametro
	//N. exite lo que se llama el constructor por defecto en JAVA, sino declaras 
	//ningun constructor este automatica se crea
	//pero si al menos declaraste un constructor, debes ponerlo explicitamente(escribirlo)
	//este contructor por defecto
	
	/* N. aqui estamos poniendole explicitamente el constructor, pero hay error
	 * esto sucede pq tenemos un atributo FINAL el cual debe ser inicializado
	 * y sl tener el contructor por defecto nunca inicializa por eso nos da error y
	 * y por eso lo estamos comentando.
	public Empleado4() { 
	}
	*/
	public Empleado4(String nombre, double sueldo) {
		this(nombre, sueldo, 1990,1,1); 
		//Si un constructor puede llamar a otro → debe hacerlo
		//this(...)  Solo se usan en constructores, Deben ser la primera línea, this() y super() No pueden usarse juntos
	}
	
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	
	public String getSeccion() {
		return seccion;
	}
	public LocalDate getFechaContrato() {
		return fechacontrato;
	}
	public void estableceSeccion(String seccion) {
		this.seccion=seccion;
	}
	@Override
	public String toString() {
		return "nombre: "+getNombre()+", Sueldo: "+getSueldo()+", Seccion: "+getSeccion()+
		", Fecha de contrato: "+getFechaContrato();		
	}
}
