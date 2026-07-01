package vid27_54_POO;
//VID 53 .HAREMOS UN PROGRAMA QUE CADA 1 SEG, MUESTRE EL DIA EN PANTALLA
//LO HAREMOS USANDO UNA CLASES INTERNAS
import java.awt.Toolkit;
import java.awt.event.*;
import java.time.LocalDate;
//import javax.management.timer.Timer;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj mireloj=new Reloj(1000,true);
		mireloj.iniciar();
		JOptionPane.showInputDialog("escribe hola");
		System.exit(0);	
	}

}

class Reloj {
	//atributos
	private int intervalo;
	private boolean sonido;
	//constructor
	Reloj(int intervalo, boolean sonido){
		this.intervalo=intervalo;
		this.sonido=sonido;
	}
	//metodos
	public void iniciar() {
		ActionListener oyente= new DamelaHora2();//2
		//DamelaHora2 oyente= new DamelaHora2();
		Timer t1=new Timer(intervalo,oyente); //1 //oyente es de tipo ActionListener (materializado en la clase Damelahora2)
		t1.start();
		//JOptionPane.showInputDialog("escribe hola");
		//System.exit(0);	
	}
	//clase interna 
	private class DamelaHora2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			LocalDate fechahoy=LocalDate.now();
			System.out.println("la fecha es:"+fechahoy);
			if(sonido) { 
			Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
}
