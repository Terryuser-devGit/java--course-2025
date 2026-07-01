package vid27_54_POO;
//USO DE METODOS CON PASE DE PARAMETROS (vid 31,32)
/*Ejemplo 4. programa de administracion de coches, para que desde la clase main se pueda mostrar los atributos de un objeto
 * tambien que mediante un metodo con parametros podamos establecer el color del objeto
*/
	public class Coche4 {
//atributos
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private int pesoCoche;
	private int pesoTotal;
	private String color;
	private boolean asientos_cuero;
	private boolean climatizador;
	//constructor 
	public Coche4() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
	}
	//metodos setters
	public void setColor(String color) {
		this.color=color;
	}

	public void calcularPesototal(int pesoExtraCarga) {
		pesoTotal=pesoTotal+pesoExtraCarga;
	}

	public void setAsientosCuero(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}
		else {
			this.asientos_cuero=false;
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
	

	//metodos getters
	public String getColor(){
		return color;
	}
	public int getPesoTotal() {
		return pesoTotal;
	}
	public String getAsientosCuero() {
		if(asientos_cuero) {
			return "el coche si tiene asientos de cuero";
		}
		else {
			return "el coche no tiene asientos de cuero";
		}
	}
	public String getClimatizador() {
		if(climatizador) {
			return "el coche si tiene climatizador";
		}
		else {
			return "el coche no tiene climatizador";
		}
	}
	public String getPesocoche() {
		int pesoCarroceria=500;
		pesoCoche=pesoCarroceria+pesoPlataforma;
		if(asientos_cuero) {
		pesoCoche=pesoCoche+50;
		}
		if(climatizador) {
		pesoCoche=pesoCoche+50;
		}
		return "el peso del coche es:"+pesoCoche;
	}
	public int getPrecioFinal() {
		int preciofinal=1000;
		if(asientos_cuero) {
			preciofinal+=200;
		}
		if(climatizador) {
			preciofinal+=500;
		}
		return preciofinal;
	}
	
}
