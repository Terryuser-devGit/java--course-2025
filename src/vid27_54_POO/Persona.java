package vid27_54_POO;
//CLASE ABSTRACTA -----vid 45 y 46
//haremos un programa de gestion de empleados los cuales se agruparan en la 
//clase Persona
//N. regla si tienes un metodo abstracto en una clase, automaticamente debes renombrar
//la clase como abstracta
public abstract class Persona {
	private final String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public abstract String getDescripcion();//N. los Metodos abstract no se implementan en la clase abstrac
											// por eso no tienen cuerpo, ya se implementan en los hijos	
}
//N. como viste Una clase abstracta puede tener métodos normales y abstractos.
//pero si al menos tienes un metodo abstracto la Clase debe ser Abstracta