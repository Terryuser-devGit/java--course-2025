package vid27_54_POO;
//USO de atributos STATIC ---vid 36
//ejemplo. haremos un programa de gestion de deportistas en el cual, en la cual cada deportista debe 
//ser identificado por un numero que empieza desde el 1 y tmb necesitamos saber 
//el total de deportistas, entonces para ello usaremos el atributo STATIC
public class Deportista2 {
	private static int id=0;
	//atributos
	private final String nombre;
	private String ciudad;

	//constructor
	public Deportista2(String nombre) {
		this.nombre=nombre;
		ciudad="Cusco";
		id++;

	}
	//metodos
	public String getNombre() {
		return nombre;
		
		
	}
	public String getCiudad() {
		return ciudad;
	}
	public int getId() {
		return id;
	}
	public void estableceCiudad(String ciudad) {
		this.ciudad=ciudad;
	}
	@Override
	public String toString() {
		return "Deportista:"+getNombre()+", ciudad:"+getCiudad()+", ID:"+getId();
	}
	
}

