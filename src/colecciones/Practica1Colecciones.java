package colecciones;

import java.util.ArrayList;

public class Practica1Colecciones {

	public static void main(String[] args) {
		//estructura<tipodedato> variable= new estructura<>();//no se le pone numero recuerda que arraylist su caracteristica es que es variable de tamaño
		ArrayList<String> nombres= new ArrayList<>();
		nombres.add("Miguel");
		nombres.add("Cesar");
		nombres.add("Daniel");
		nombres.add("Javier");
		nombres.add("Victor");
		System.out.println(nombres);
		nombres.add(2,"Danielito");
		nombres.add("Javier");
		System.out.println(nombres);
		System.out.println("nombre del indice 2 es: "+nombres.get(2));
		nombres.set(3, "Terryuser");//cambiar el elemento de la posicion 3
		System.out.println(nombres);
		nombres.remove(1);//remover el elemento de la posicion 1
		System.out.println(nombres);
		System.out.println("el tamaño del arreglo es:"+nombres.size());//imprime el tamaño de la lista
		for(int i=0;i<nombres.size();i++) {
			System.out.println(nombres.get(i));
		}
		//nombres.add(2,"Danielito");
		System.out.println(nombres);
		int[] arraynumero=new int[5]; //estructura primitiva que indica que los parentesis es el espacio que se reservara en la memoria

	}

}
