package vid27_54_POO;
public class Uso_Deportista {

	public static void main(String[] args) {
		
		//ejemplo: hacer un programa para que gestione deportistas, sepas cual es su numero de ID  y cuantos deportistas hay
		//asi como aprendimos seria muy dificil, porque desvirturiamos muchas cosas, mezclariamos muchas cosas,
		//como ejemplo lo haremos
		System.out.println("----clase Deportista1------------------------");
		int id=0;
		Deportista1 corredor1=new Deportista1("Alberto");
		id++;
		Deportista1 corredor2=new Deportista1("Juan");
		id++;
		Deportista1 corredor3=new Deportista1("Carlos");
		id++;
		Deportista1 corredor4=new Deportista1("Raul");
		id++;
		Deportista1 corredor5=new Deportista1("Alberto");
		id++;
		Deportista1 corredor6=new Deportista1("Juan");
		id++;
		System.out.println("nombre :"+ corredor6.getNombre()+", Id: "+id);
		/*N. AQUI VISUALMENTE SALE, PERO se cometio muchisimos errores y formas desansejadas de programación
		 * 1. el main debe ser limpio de logica
		 * 2. como enlazas el id a cada objeto si lo hiciste afuera aparte en otra clase(main)
		 * 3. no se supone que id deberia estar incrustado en la Clase
		 * 4. para miles de datos ya no funciona esta estructura
		 * ENTONCES para dar solucion a esto se creo la palabra STATIC
		 * que es una variable que pertenece a la CLASE y NO al al OBJETO y con eso se soluciona el problema
		 * y lo veremos en la Clase Deportista2
		 */
		System.out.println("----fin clase Deportista1---------------------");
		System.out.println();
		System.out.println("----clase Deportista2------------------------");
		Deportista2[] arrayruner= {
							new Deportista2("Alberto"),
							new Deportista2("Juan"),
							new Deportista2("Carlos"),
							new Deportista2("Raul"),
							new Deportista2("Alberto"),
							new Deportista2("Juan")
							};
		for( Deportista2 x:arrayruner) {
			System.out.println(x);
			//Deportista:Alberto, ciudad:Cusco, ID:6
			//Deportista:Juan, ciudad:Cusco, ID:6
			//Deportista:Carlos, ciudad:Cusco, ID:6
			//Deportista:Raul, ciudad:Cusco, ID:6
			//Deportista:Alberto, ciudad:Cusco, ID:6
			//Deportista:Juan, ciudad:Cusco, ID:6
		}
		//N. si se observa efectivamente el STATIC esta haciendo su trabajo se esta comportando como variable global
		// osea no pertenece al objeto sino a la clase y desde alli hace los calculos
		//ahora el unico problemita es que nos falta sacar el Id de cada corredor
		//pq el ID total ya nos saca ( total de deportistas) eso lo solucionaremos con en la Clase Deportista3
		System.out.println("----fin clase Deportista2---------------------");
		System.out.println();
		System.out.println("----clase Deportista3------------------------");
		Deportista3[] arraycorredores= {
				new Deportista3("Alberto"),
				new Deportista3("Juan"),
				new Deportista3("Carlos"),
				new Deportista3("Raul"),
				new Deportista3("Alberto"),
				new Deportista3("Juan")
				};
		for(Deportista3 y:arraycorredores) {
			System.out.println(y);
			//Deportista: Alberto, Id :1
			//Deportista: Juan, Id :2
			//Deportista: Carlos, Id :3
			//Deportista: Raul, Id :4
			//Deportista: Alberto, Id :5
			//Deportista: Juan, Id :6
		}
		System.out.println("total de deportistas: "+Deportista3.getIdgeneral());//total de deportistas: 6
		//N. tambien como son static defrente sin instanciar podemos acceder al atributo static pq no pertenece al objeto
		//siempre en cuando el atributo este como public static int Idgeneral
		//System.out.println("total de deportistas: "+Deportista3.Idgeneral());// esto da error pq esta private static int Idgeneral
	}

}
