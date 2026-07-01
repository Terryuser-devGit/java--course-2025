package empresa.modelo;
// MODIFICADORES DE ACCESO----  vid 47 
/* ejemplo. Vamos a hacer un ejercicio estilo empresa real, La empresa tiene:
   Empleados, Desarrolladores, Gerentes, Recursos Humanos (RRHH) que puede modificar salarios
   
 * Queremos: Proteger el salario, Permitir herencia, Evitar que cualquiera modifique datos críticos,
  Aplicar reglas de negocio
 
 * Estructura de paquetes
 * empresa.modelo
 * empresa.servicio
 * empresa.app
 * */
public abstract class Empleado {//N. si declaras como abstract al menos uno de los metodos deber ser abstrac
	//atributos
	private String nombre;
	private double salarioBase;
	protected int aniosAntiguedad;//N. cuando veas un protectec es casi seguro que va ser para heredar y sera llamado desde otro paquete
	//constructor
	Empleado( String nombre, double salarioBase, int aniosAntiguedad){ //N. modificador por default(cuando no esta escrito), 
																		//accesible dentro del mismo paquete OSEA solo las clases del
																		//paquete pueden crear empleados
		this.nombre=nombre;
		this.salarioBase=salarioBase;
		this.aniosAntiguedad=aniosAntiguedad;}
	//metodos
	public String getNombre() {
		return nombre;
	}
	protected double getSalarioBase() {//N. cuando veas un protectec es casi seguro que va ser para heredar y sera llamado desde otro paquete
		return salarioBase;
	}
	protected void aumentarSalario(double porcentaje) {
		if(porcentaje >0) {
			salarioBase+=salarioBase*porcentaje;
		}
	}
	public void solicitarAumento(double porcentaje) {//N. metodo publico controlado, (usado desde afuera)
		aumentarSalario(porcentaje);				// para luego hacer un aumento real dentro de la clase Empleado
	}
	public abstract double calcularSalario();//los metodos abstract no tienen implementacion
}
