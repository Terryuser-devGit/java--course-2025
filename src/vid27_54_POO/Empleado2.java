package vid27_54_POO;
//USO de atributos tipo FINAL en clases (vid 36)
//Ejemplo. En este ejemplo haremos la creacion de empleados y sus areas, luego con un rotacion
//que parece simple desvirturemos la integridad de la clase, luego eso corregiremos con la palabra FINAL en otro ejemplo
public class Empleado2 {
	//atributos
	private String nombre;
	private String seccion;
	//constructor
	public Empleado2(String nombre) {
		this.nombre=nombre;
		seccion="administracion";
	}
	//metodos
	public void estableceNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void estableSeccion(String seccion) {
		this.seccion=seccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getSeccion() {
		return seccion;
	}
}
