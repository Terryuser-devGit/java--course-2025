package vid27_54_POO;
//uso de Enum --(vid48 REFUERZO)
//Un enum no solo son constantes, también puede tener:
//atributos
//constructor
//métodos
public class Uso_Semaforo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaforo s=Semaforo.ROJO;//aqui no se crea el objeto → solo lo usas, aqui solo estamos haciendo una asignacion
		System.out.println(s.getAccion());// ambas son iguales pq es una asignacion simple
		System.out.println(Semaforo.ROJO.getAccion());//ambas son iguales pq es una asignacion simple
		for(Semaforo x:Semaforo.values()) {//values() en un enum de Java devuelve un array (T[]) que contiene todas las constantes definidas en el enum, en el mismo orden en que fueron declaradas
			System.out.println(x);
			System.out.println(x.getAccion());
			System.out.println(x+"->"+x.getAccion());
		}
		
	}

}
