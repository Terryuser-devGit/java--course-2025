package vid27_54_POO;
//VID 53 REFUERZO .HAREMOS UN PROGRAMA QUE CADA 1 SEG, MUESTRE EL DIA EN PANTALLA
//LO HAREMOS USANDO UNA CLASES INTERNAS, CLASES ANONIMAS Y LAMBDAS
import javax.swing.JOptionPane;
import javax.swing.Timer;//para el timer
import java.awt.Toolkit;
import java.awt.event.*;//para el action listener
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
//------------OTRA CLASE, PERO PRINCIPAL PQ TIENE EL METODO MAIN--------------
public class PruebaTemporizador53mejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj2 mireloj=new Reloj2(1000,true);
		mireloj.iniciar();//con clase interna
		mireloj.ejecutar();//con clase anonima
		mireloj.lanzar();//con lambdas
		JOptionPane.showInputDialog("hola lambda");
		System.exit(0);
	}

}
//---------------OTRA CLASE----------------------------------------------
class Reloj2 {
	//atributos
	private int tiempo;
	private boolean valor;
	//constructor
	Reloj2(int tiempo, boolean valor){
		this.tiempo=tiempo;
		this.valor=valor;
	}
	//metodos
	public void iniciar() {//metodo .-usando CLASES INTERNAS (1)
		ActionListener oyente= new DamelaHora3();  //2
		//DamelaHora3 oyente=new DamelaHora3();
		Timer t1=new Timer(tiempo,oyente);//1 //oyente es de tipo ActionListener (materializado en la clase Damelahora3)
		t1.start();
		//JOptionPane.showInputDialog("escribe hola");
		//System.exit(0);
	}
	//clase interna
	private class DamelaHora3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("el dia de hoy es:"+LocalDate.now());
			if(valor) {
			
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
	
	public void ejecutar() {//metodo.- usando Clases anonimas(2)
		ActionListener oyentito=new ActionListener() 
		{//materializamos la interfaz al vuelo, implementando el codigo 
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 System.out.println("la hora es "+LocalTime.now());
				 if(valor) {
					 Toolkit.getDefaultToolkit().beep();
				 }
			 }
				
		};//N. al implementar el cuerpo de la interfaz de frente, internamente java esta creando 
		//una clase, la cual es anonima y de alli su nombre clase anonima, la cual funciona igual
		//que una clase normal, solo que no podras volver a instanciar esta clase en otra parte del codigo
		Timer t2=new Timer(tiempo,oyentito);
		t2.start();
		//JOptionPane.showInputDialog("Hola denuevo");
		//System.exit(0);
	}
	
	public void lanzar() { //metodo.- usando Lambdas (3)
		Timer t3=new Timer(tiempo,(e)->{
								   		System.out.println("la ubicacion es: "+Locale.getDefault());
					               		if(valor) {
					            	   Toolkit.getDefaultToolkit().beep();
					               		}
								   }
					      );
				//N.los lambdas funcionan sobre las Interfaces Funcionales, como estas tienen un unico metodo
               //, Java intuye que el cuerpo de ese metodo unico es el que le estas indicando con ->
				// y por ende ejecuta ese codigo que esta en ->{}
				//al trabajar con Interfaces Funcionales java tambien intuye el tipo de parametros del unico metodo
				// osea ActionEvent e es igual e, como tiene un unico metodo, java tambien sabe que el
				// parametro es de un tipo , por eso permite omitir el tipo de dato del parametro
		t3.start();
					
	}
}

