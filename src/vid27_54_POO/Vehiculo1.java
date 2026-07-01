package vid27_54_POO;
//HERENCIA -----vid 40,41
//Haremos la clase Vehiculo1 (clase padre), y la Clase Furgoneta(clase Hija), la cual hereda todo
//lo de la clase furgoneta y lo mostraremos en la Clase Uso_vehiculo
//N. la clase hija hereda todo de la clase padre, menos el constructor 
//por eso debes llamar con SUPER() al constructor de la clase padre
public class Vehiculo1 {
	private int motor;
	private int ruedas;
	private String color;
	private boolean asientoscuero, climatizador;
	public Vehiculo1() {
		motor=1500;
		ruedas=4;
	}
	public int getMotor() {
		return motor;
	}
	public int getRuedas() {
		return ruedas;
	}
	public String getColor() {
		return color;
	}
	public String getDimeAsientos() {
		if(asientoscuero) {
			return "si tiene asientos de cuero";
		}
		else {
			return "no tiene asientos de cuero";
		}
	}
	public String getDimeclimatizador() {
		if(climatizador) {
			return "Si tiene climatizador";
		}
		else {
			return "no tiene climatizador";
		}
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setAsientos(String asientoscuero){
		if(asientoscuero.equalsIgnoreCase("si")) {
			this.asientoscuero=true;
		}
		else {
			this.asientoscuero=false;
		}
	}
	public void setClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}
		else {
			this.climatizador=false;
		}
	}
	@Override
	public String toString() {
		return "motor: "+getMotor()+", ruedas: "+getRuedas()+ ", color:"+getColor()+
				", asientos: "+getDimeAsientos()+ ",Climatizador: "+ getDimeclimatizador();
	}
}
