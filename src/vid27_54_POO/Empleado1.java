package vid27_54_POO;
import java.time.LocalDate;
// USO DE CONSTRUCTORES CON PASO DE PARAMETROS (vid 33,34,35)
//EJEMPLO. En este ejemplo al constructor le daremos parametros para que inicialize los atributos del objeto, hasta ahora solo
//creamos objetos coche en ejemplos anteriores pero no le pasabamos nada, internamente le asignabamos parametros fijos
//pero ahora le pasaremos Parametros e inicializaremos los atributos con esos parametros.
//N. asi como existe el Tipo String (no es tipo primitivo de dato como int, double sino es Clasem mejor TIPO CLASE)
//tambien existe el tipo Date
//entonces las variables pueden ser tipo primitivo, tipo clase
public class Empleado1 {
	//atributos
	private String nombre;	
	private double sueldo;					
	private LocalDate altaContrato;
	//constructor
	public Empleado1(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		altaContrato=LocalDate.of(anio, mes, dia);
	}
	//metodos
	public String getNombre() {
		return nombre;
	}
	public double getSueldo(){
		return sueldo;
	}
	public LocalDate getAltaContrato() {
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {
		
		sueldo+=sueldo*(porcentaje/100);//sueldo=sueldo+sueldo*(porcentaje/100);
	}
	@Override //N. buena practica que indica que vamos a sobrescribir el metodo
	public String toString() {
		return "nombre: "+getNombre()+", sueldo: "+getSueldo()+", fecha de contrato: "+getAltaContrato();		
	}
	
}
