package vid27_54_POO;
//uso de Enum --(vid48 REFUERZO)
//Un enum no solo son constantes, también puede tener:
//atributos
//constructor
//métodos
public enum Semaforo {
	//instancias
	ROJO("detener"),// "Detener" es un parámetro, q instanemante el valor del parametro se 
	//convertira en atributo, ya que en esta linea se esta llamando al constructor y 
	// en el constructor se inicializa los atributos
	//N y a esta parte ya estaria creado el objeto(o instancia)
	//por eso en la otra clase de frente usas ya las objetos como tal ( instancias)
	AMARILLO("precaucion"),
	VERDE("avanzar");
	//atributos
	private String accion; //accion es el atributo, lleva el mismo nombre del parametro pasado, pq es asi como se inicializa con contructor
	//constructor
	Semaforo(String accion){
		this.accion=accion;
	}
	//metodos
	public String getAccion() {
		return accion;
	}
}
