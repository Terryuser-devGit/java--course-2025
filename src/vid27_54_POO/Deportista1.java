package vid27_54_POO;
//USO de atributos STATIC ---vid 36
//ejemplo. haremos un programa de gestion de deportistas en el cual, en la cual cada deportista debe 
//ser identificado por un numero que empieza desde el 1
public class Deportista1 {
	//atributos
	final private String nombre;
	private String ciudad;

	//constructor
	public Deportista1(String nombre) {
		this.nombre=nombre;
		ciudad="Cusco";

	}
	//metodos
	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void estableceCiudad(String ciudad) {
		this.ciudad=ciudad;
	}
}
