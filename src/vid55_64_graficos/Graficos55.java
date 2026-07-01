package vid55_64_graficos;
import javax.swing.*;
//VID 55 GRAFICOS. CREAREMOS NUESTRA PRIMERA VENTANA
//RECORDAR QUE VAMOS A USAR LA CLASE JFRAME Y CON ESTA CLASE CREAREMOS
//NUESTRA PIRMERA VENTANA, TENIENDO EN CUENTA
//1-EL TAMAÑO DE LA VENTANA QUE SE CREA POR DEFECTO ES ES 0x0 PIXELES Y ESO DEBEMOS MODIFICARLO
//2-LA VISIBILIDAD DE LA VENTANA ES OCULTO Y ESO DEBEMOS CAMBIARLO
//3.DEBEMOS DEFINIR LA SIGUIENTE ACCION UNA VEZ QUE LE DEMOS AL BOTON CERRAR DE LA VENTA
public class Graficos55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiVentana ventana1=new MiVentana();//por defecto se crea en la esquina superior derecha
		ventana1.setVisible(true);//definimos la visibilidad
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//definos la accion de Cerrar el programa una vez que se cierra la venta
	}

}
class MiVentana extends JFrame{
	
	//atributos
	//constructor
	MiVentana(){
		//setSize(500,300); //definimos tamaño, aunque esot se ha podido hacer en otra parte del codigo
		//setLocation(800,400);//metodo para cambiar la ubicacion de la pantalla
		setBounds(2800,400,250,250);//metodo de ubicacion y tamaño
		
		
	}
	//metodos
}
//notas se sabe que los metodos llamados en cualquier parte del codigo son ACCIONES
//y los metodos declarados son plantillas y esto se declaran en las clases como plantillas 

