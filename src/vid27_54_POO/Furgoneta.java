package vid27_54_POO;
//HERENCIA --vid 40,41
//Ejemplo. Esta clase hereda todo de Vehiculo porque es la clase hija
public class Furgoneta extends Vehiculo1 {
	//con extends esta herendado atributos y metodos
	//N. ahora solo debemos crear los atributos, constructor y metodos de esta clase
	private int capacidadcarga;
	private int plazasextra;
	public Furgoneta(int capacidadcarga, int plazasextra) {
		super();
		this.capacidadcarga=capacidadcarga;
		this.plazasextra=plazasextra;
	}
	public int getCapacidadCarga() {
		return capacidadcarga;
	}
	
	public int getplazasextra() {
		return plazasextra;
	}

	@Override
	public String toString() {
		return super.toString()+", capacidad de carga: "+getCapacidadCarga()+
				", plazas extra: "+getplazasextra();
	}
}
