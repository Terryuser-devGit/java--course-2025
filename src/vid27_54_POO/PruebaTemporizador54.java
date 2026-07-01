package vid27_54_POO;
//VID 54 .HAREMOS UN PROGRAMA QUE CADA 1 SEG, MUESTRE EL DIA EN PANTALLA
//LO HAREMOS USANDO UNA CLASES INTERNAS LOCALES, CLASES ANONIMAS Y LAMBDAS
import java.awt.Toolkit;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.Timer;//para el Timer
import java.awt.event.*;//para ActionListener
//*****************************OTRA CLASE***CLASE PRINCIPAL PQ TIENE EL METODO MAIN******OTRO .CLASS
public class PruebaTemporizador54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj3 mireloj= new Reloj3();
		mireloj.iniciar(1000, true);
		JOptionPane.showInputDialog("Hola inner class local");
		System.exit(0);
	}

}

//*********************************OTRA CLASE************PARA JVM OTRA ARCHIVO .CLASS
class Reloj3 {
	//atributos
	//constructor
	//metodos
		public void iniciar(int intervalo, final boolean valor) {
			class DamelaHora4 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("la fecha es: "+LocalDate.now());
					if(valor) {//se observa que solo esta accediendo al valor boolean por eso se declaro como final
						Toolkit.getDefaultToolkit().beep();
					}
				}
				
			}
			//-----------------fin de la clase interna----------------------------------------
			//sigue codigo del metodo	
			ActionListener oyente= new DamelaHora4();
			Timer t1= new Timer(intervalo,oyente);//aqui estamos usando el parametro intervalo que funciona como variable local
			t1.start();
			
			//N. DE ACUERDO A LA DEFINICION UNA INNER CLASS SE DEFINE DENTRO DE UN METODO
			
		}
			
}
