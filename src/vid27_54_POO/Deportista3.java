package vid27_54_POO;
//USO de atributos STATIC ---vid 37,38
//ejemplo. haremos un programa de gestion de deportistas en el cual, en la cual cada deportista debe 
//ser identificado por un numero que empieza desde el 1 y tmb necesitamos saber 
//el total de deportistas, entonces para ello usaremos el atributo STATIC
public class Deportista3 {
	private static int Idgeneral=0; //atributo que no pertece a los objetos sino a la clase
	private final String nombre;
	private String ciudad;
	private final int Idcorredor;
	
	public Deportista3(String nombre) {
		this.nombre=nombre;
		this.ciudad="cusco";
		Idgeneral++;
		this.Idcorredor=Idgeneral;
	}
	
	public String getNombre() {
		return nombre;
				
	}
	public String getCiudad() {
		return ciudad;
	}
	
	public static int getIdgeneral() {//esto es static para que lo llames desde el main, sin estanciar la clase
		return Idgeneral;
	}
	
	public int getIdcorredor() {
		return Idcorredor;
	}
	
	public void estableceCiudad(String ciudad) {
		this.ciudad=ciudad;
	}
	@Override
	public String toString() {
		return "Deportista: "+getNombre()+", Id :"+getIdcorredor();
	}
	
}
/*N.  por qué los setters no deben tocar static (REGLA) 
* porque un setter hacen cambios en UN OBJETO, y 
* pq una variable static NO pertenece al OBJETO, pertenece a la CLASE
* por eso nunca debes SETTEAR aun STATIC
* N. static se modifica solo desde métodos static
*/