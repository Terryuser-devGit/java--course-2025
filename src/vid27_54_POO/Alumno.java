package vid27_54_POO;
//hereda de Class Persona--vid 45 y 46
public class Alumno extends Persona {
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera=carrera;
	}
	
	@Override
	public String getDescripcion() {
		return "nombre: "+getNombre()+", Carrera: "+carrera;
		//N. pudiste poner super.getNombre() pero esta con +getNombre()
		//Ambas funcionan porque: getNombre() es heredado y como sabes se heredan metodos y se vuelven suyos
		//En este caso usar super. no es necesario.
	}
}
