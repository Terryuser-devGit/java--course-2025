package vid27_54_POO;
//USO de atributos tipo FINAL en clases (vid 36)
//Ejemplo. en la Clase Empleado2, el programa gestion de empleados, se desvirtuo un objeto inicial
//creado como trabajador1-->(alberto, administracion) y luego trabajador1-->(raul, logistica)
//perdiendose los datos del trabajador de nombre Alberto, lo que es incorrecto, entonces ahora lo corregiremos
//usando la palabra FINAL
public class Empleado3 {
	//atributos
	final private String nombre;
	private String area;
	//constructor
	public Empleado3(String nombre) {
		this.nombre=nombre;
		area="Administracion";
	}
	//metodos
	public String getNombre() {
		return nombre;
	}
	public String getArea() {
		return area;
	}
	public void estableceNombre(String nombre) {
		//this.nombre=nombre; //esto ya nos va dando error pq nombre no puede cambiar por el FINAL
	}
	public void estableceArea(String area) {
		this.area=area;
	}
	@Override
	public String toString() {
		return "Nombre del Empleado: "+getNombre()+", Area: "+getArea();
	}
	
}
