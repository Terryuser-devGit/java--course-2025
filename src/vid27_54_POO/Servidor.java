package vid27_54_POO;
//hereda de Class Persona--vid 45 y 46
public class Servidor extends Persona {
	private String departamento;
	private int id;
	
	public Servidor(String nombre, String departamento, int id) {
		super(nombre);
		this.departamento=departamento;
		this.id=id;
	}
	@Override
	public String getDescripcion() {
		return "nombre: "+getNombre()+", departamento:"+departamento+", Id:"+id;
	}
}
//N. pudiste poner super.getNombre() pero esta con getNombre()
//Ambas funcionan porque: getNombre() es heredado y como sabes se heredan metodos y se vuelven suyos
//En este caso usar super. no es necesario.