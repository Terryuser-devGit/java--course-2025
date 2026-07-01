package vid27_54_POO;
import javax.swing.*;
public class Uso_Coches {
 public static void main(String[] args) {
	/*
	 Coche1 toyota=new Coche1();
	 System.out.println("---------ESTAMOS EN LA CLASE COCHE1-------------------");
	 System.out.println("este carro tiene: "+toyota.ruedas+" ruedas");// el carro toyota tiene 4 ruedas
	 toyota.ruedas=3; //se esta accediendo desde Uso_coche a los atributos de coche el cual es incorrecto y no se deberia acceder asi por se usa el encapsulamiento
	 System.out.println("este carro tiene: "+toyota.ruedas+" ruedas");//el carro toyota tiene 3 ruedas
	 //Esta inconsistencia lo solucionaremos usando el el modificador private en los atributos de COCHE2 para ver la diferencia
	 
	 //resumen.- coche 1 deja modificar los atributos desde el main, el cual es incorrecto
	 
	 System.out.println("---------ESTAMOS EN LA CLASE COCHE2-------------------");
	 Coche2 renault=new Coche2();
	 //System.out.println("este carro tiene:"+renault.ruedas+" ruedas"); //ERROR no permite acceder a renault.ruedas Y asi debe ser por que cada clase debe tener integridad
	 //renault.ruedas=3; //ERROR renault.ruedas, no permite acceder a renault.ruedas y asi debe ser Y asi debe ser por que cada clase debe tener integridad
	 
	 //resumen.- coche2 arregla los errores de coche1, pero ya tambien NO se puede leer o mostrar los atributos de coche 2 desde el main
	 //entonces como se puede acceder(visualizar) a los atributos de otra clase, se realiza a traves de los metodos SETTER y GETTERS que veremos en COCHE3
	 
	 System.out.println("---------ESTAMOS EN LA CLASE COCHE3-------------------");
	 Coche3 kia=new Coche3();
	 System.out.println("el coche kia tiene motor de "+kia.getmotor());//el coche kia tiene motor de 1500
	 System.out.println("el coche kia tiene color "+kia.getcolor()); //el coche kia tiene color null. NOTA. esto sale asi pq cuando no asignas valor se considera el valor por defecto null
	 kia.establece_color();
	 System.out.println("el coche kia tiene color "+kia.getcolor()); //el coche kia tiene color azul. NOTA. aqui ya salio el color poque antes usamos el metodo establece color y se puso azul a la variabel color
	 //resumen. coche 3 ya tiene encapsulacion sus atributos no se tocan ya estan establecidos, y se puede leer(visualizar) esos atributos desde el main pero no modificar lo que es correcto
	 //entonces ahora como hacemos para poder crear objetos pero que cada uno tengo su propio color etc, para ello se usa METODOS con parametros que veremos en la clase Coche4
	 */
	 System.out.println("----------ESTAMOS EN LA CLASE COCHE4-------------------");
	 Coche4 audi=new Coche4();
	 audi.setColor("rojo");//se establece el color rojo con el metodo
	 System.out.println("el color del audi es "+audi.getColor());// el color del audi es rojo
	 
	 audi.setAsientosCuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero? (si/no)"));//se establece que tiene asientos de cuero
	 System.out.println("el audi tiene asientos de cuero: "+audi.getAsientosCuero());
	 audi.setClimatizador(JOptionPane.showInputDialog("¿Tiene asientos de cuero? (si/no)"));//se establece climatizador"
	 System.out.println("el peso del coches es"+ audi.getPesocoche());
	 System.out.println("el precio final del coche es "+ audi.getPrecioFinal());
	 //resumen. coche4 cumple con la encapsulacion y se usa metodos con parametros para personalizar el objeto creado.
 
 }
}
 