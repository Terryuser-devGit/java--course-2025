package vid27_54_POO;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehiculo1 miauto=new Vehiculo1();
			miauto.setColor("rojo");
			//Furgoneta starlet =new Furgoneta(); // N. esto da error pq el constructor de furgoneta esta preparado para recibir 2 parametros
			Furgoneta starex =new Furgoneta(1500,7);
			starex.setColor("azul");//N. aqui estamos usando metodo heredado, es la ventaja de la herencia
			starex.setAsientos("si");//N. aqui estamos usando metodo heredado, es la ventaja de la herencia
			starex.setClimatizador("si");
			System.out.println(miauto);
			System.out.println(starex);
	}

}
