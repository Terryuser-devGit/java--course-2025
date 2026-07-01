package vid27_54_POO;
//USO DE INTERACES ....VID 52
//HAREMOS UN PROGRAMA DE TEMPORIZADOR PARA QUE CADA CIERTO TIEMPO ENVIE LA HORA POR CONSOLA
//N. 1000 milisegundos = 1 segundo
import javax.swing.*;//para la clase Timer y JoptionPane

import java.awt.Toolkit;
import java.awt.event.*;//para la interfaz ActionListner 
import java.util.*;//para la clase Date, OJO tmb tiene un clase Timer entonces se genera un conflicto 
//en la linea Timer mi temporizador=new Timer(5000, oyente) pq eclipse no sabe a que paquete 
//pertenece el Timer (al swing o util), entonces la solucion es importar precisando el paquete y la clase que usaremos 
import javax.swing.Timer;//y con esto se borra el error del Timer,pq usaremos esta Clase Timer 
//N. recuerda que las clases y las interfaces pertenecen a paquetes
//N. recuerda que cuando una claseA implementa una Interfaz (osea materializas la interfaz)
//ya puedes hacer esto
// INTERFAZ X= new ClaseA() que es lo mismo que ClaseA x= new ClaseA();

public class PruebaTemporizador {

	public static void main(String[] args) {
		DameLaHora oyente=new DameLaHora();
		//ActionListener oyente= new DameLaHora()////Esto tambien funcionaria, es similar a la sentencia de arriba 
		Timer mitemporizador=new Timer(1000, oyente); //este oyente es un objeto tipo I ActionListener 
		//y ya sabes que para materializar una I necesitas un clase que implemente esta interfaz
		
		mitemporizador.start();//usamos el metodo star de la INTERFAZ Timer
		//nota, si terminamos aqui el programa no veremos nada porque todo ocurre
		//muy rapido e internamente, y para poder verlo vamos a usar
		//joptionPane y mostrar un panel y no terminara (cuadrito rojo) hasta que no/
		//cerremos el panel en (aceptar) y solo asi podremo ver los mensajes de hora en consola
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		//paralelamente internamete seguira ejecutandose el metodo start. 
		System.exit(0);
		
	}

}

class DameLaHora implements ActionListener{//implementar todos los metodos de la I ActionListener
	@Override //implementamos el unico metodo de la Interfaz ActionListener
	public void actionPerformed(ActionEvent e) {
		Date ahora=new Date();    //N. aqui nosotros personalizamos el comportamiento del evento
		System.out.println("Te digo la Hora casa 5 segundos:" +ahora);
		
	//nota esta clase no tiene constructor y tampoco tiene atributos y es normal
		//entonces java le pone el constructor por defecto;
	}
}
/*la ejecucion del programa cuando llega al new Timer, cada 5 segundo llama
	al metodo actionPerformed,cuando veamos los eventos en profundidad, descubriremos
	siempre que se desencadena un evento, esa accion ese evento tiene que llamar
	a un metodo actionPerfomed, debido a esto todas esas clases que desencadenen
	eventos tienen que implementar la I ActionListener simplemente para asegurarse
	que construimos o sobrescribimos el metodo actionPerfomed
	Es decir pq la API de java en la Clase Timer, en el Constructor de Timer, como 2 
	parametro nos obliga a pasar un parametro de Tipo  I ActionListener
	simplemente para asegurarse que a la hora de construir nuestros programas
	este metodo actionPerfomed que es invocado siempre que ocurre un evento
	siempre que se desencadene una accion esta desarrollado.
	y como ya sabes uno de los obejtivos de las interfaces es marcar
	el diseño de tienen que tener aquellas clases que implementen las I
	
	
*/