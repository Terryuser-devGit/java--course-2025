package vid27_54_POO;
//USO DE INTERFACES ....VID 52
//HAREMOS UN PROGRAMA DE TEMPORIZADOR PARA QUE CADA CIERTO TIEMPO ENVIE LA HORA POR CONSOLA
//N. 1000 milisegundos = 1 segundo
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorRefuerzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ActionListener listenerhora=new MostradordeHora();
		ActionListener listenerfecha=new MostradordeFecha();
		ActionListener listenerubicacion=new MostradordeUbicacion();

		Timer hilo1=new Timer(1000,listenerhora);
		Timer hilo2=new Timer(1000,listenerfecha);
		Timer hilo3=new Timer(1000,listenerubicacion);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		JOptionPane.showInputDialog("ESCRIBE HOLA");
		System.exit(0);
		
		*/
		ActionListener[] arrayAL= {new MostradordeHora(),
									new MostradordeFecha(),
									new MostradordeUbicacion()};
	
		for(ActionListener i:arrayAL) {
			Timer t=new Timer(1000,i);
			t.start();
		}
		JOptionPane.showInputDialog("ESCRIBE HOLA");
		System.exit(0);
	}

}

class MostradordeHora implements ActionListener {
	//atributos .-  sin atributos
	//constructor.- sin constructor, cuando no le ponses cont
	//metodos (implementamos el unico metodo de la Interfaz ActionListener)
	public void actionPerformed(ActionEvent e) {
		LocalTime horahoy=LocalTime.now();
		System.out.println("la Hora es:"+horahoy);
				
	}

}

class MostradordeFecha implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		LocalDate diahoy=LocalDate.now();
		System.out.println("el dia es:"+diahoy);
	}
	

}

class MostradordeUbicacion implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Locale ubicacionhoy= Locale.getDefault();
		System.out.println("la ubicacion es:"+ubicacionhoy);
		System.out.println("----------------------------------------------");
	}
}
