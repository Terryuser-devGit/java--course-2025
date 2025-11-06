package paquete2025;

public class Vid11_15_EntradaySalidaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * hablaremos de la clase String y sus principales metodos
		 NOTAS PUNTUALES
		 * 1. EL TAMAÑO O LONGUITUD DE UN STRING ES UN NUMERO ENTERO ARIMETICO
		 * 2. LA POSICION DE LOS CARACTERES DE UN STRING EMPIEZA DESDE O, LA ULTIMA SERIA (TAMAÑO-1)
		 * 3. PARA DEFINIR UN CHAR SE PONE ENTRE '' y siempre tiene 1 solo caracter tamaño=1 Y UN STRING ES ENTRE "" y tiene varios caracteres y su tamaño es variable
		 * 4. COMO ES UNA CLASE LA S ES CON MAYUSCULA String
		 * 5. LOS ESPACIOS EN BLANCO SON CONSIDERADOS String
		 * 6. TENER CUIDADO CON LOS INDICES EN SUBCADENAS SIEMPRE DEBE ESTAR EN EL RANGO, CUANDO MENCIONAS INDICES FUERA O INCORRECTOS APRECE ERROR DE COMPILACION
		 * 7. LOS CHAR NO PUEDE SER VACIOS char vacio = '' Error de compilación, ASI SI   char espacio = ' ' // Espacio en blanco CORRECTO
		 
		  PRINCIPALES METODOS
		  
		 * length() :devuelve la longuitud de una cadena de caracteres (INT)
		 * substring(x) :devuelve una nueva SUBCADENA de una cadena, desde la posicion X hasta el final 
		 * substring(x,y) :devuelve una nueva SUBCADENA de una cadena, desde la posicion X hasta la posicion (Y-1) 
		 * charAt(x)	:devuelve el CARACTER O CHAR de la posicion X de de una cadena (las posiciones empieza desde 0, no lo olvides) (CHAR)
		 
		  	OJO: el metodo substring combínalo con indexOf(), lastIndexOf() para que sean potentes.
		 * IndexOf(int caracter) :devuelve la posicion de un caracter dentro de una cadena (va izquier a derech--> )  (INT) 
		 * IndexOf(String subcadena) :devuelve la posicion de un String dentro de una cadena (va izquier a derech--> )  (INT) 
		 * IndexOf(int caracter, int x) :devuelve la posicion de un caracter dentro de una cadena a partir x (va izquier a derech--> )  (INT) 
         * IndexOf(String subcadena, int desdeIndice) :devuelve la posicion de un String dentro de una cadena a partir x (va izquier a derech--> )  (INT)
		 * lastIndexOf(int caracter), lastIndexOf(String subcadena),  lastIndexOf(int caracter, int desdeIndice), lastIndexOf(String subcadena, int desdeIndice)
		   estos metodos hace lo mismo que INDEXOF solo que el recuento es desde el FINAL AL INICIO (<--- osea de Derec a Izquierda) OJO SI NO ENCUENTRAN RETURN -1
		 
		 * equals(cadena) : devuelve un BOOLEAN , compara si dos cadenas son iguales DISTINGUIENDO MAYUS y min
		 * equalsIgnoreCase(cadena) : devuelve un BOOLEAN , compara si dos cadenas son iguales SIN DISTINGUIR MAYUS y min 
		*/
		// casos especiales con substring
		
		String texto = "Java";

		// Índice igual al largo - devuelve cadena vacía ( a pesar de que el indice llega a 3, con 4 te acepta pero return blanco
		System.out.println(texto.substring(4)); // ""
		// Error común - StringIndexOutOfBoundsException
		// System.out.println(texto.substring(5)); // ERROR!

		// Índices iguales - cadena vacía
		System.out.println(texto.substring(2, 2)); // ""
			
		//ejemplo 1. imprimir un nombre completo, su tamaño, su ultima letra, y desglosar por apellidos a traves de substring
			String name="Javier Amache Loncone";
			System.out.println("mi nombre completo es :"+name+"; tamaño de texto :"+name.length()+"; "
					+ "la ultima letra de mi nombre completo es :"+name.charAt((name.length()-1))+
					"; mi apellido paterno :"+name.substring(7, 13)+"; mi apellido materno :"+name.substring(14, 21));
		 	
		//ejemplo 2. extraer el nombre de archivo sin su extension
		String documento="reportemarzo.2025.xls";
		System.out.println("el documento se denomina :"+documento);
		System.out.println("el nombre del archivo sin extension es :"+documento.substring(0, documento.lastIndexOf('.')) );//recuerda [ , >
		//ejemplo 3. extraer la extension del archivo
		System.out.println("la extension del archivo es "+documento.substring(documento.lastIndexOf('.')+1));
			
		//ejemplo 4.Extraer el dominio de email
		String email="dgt@cusco.gob.pe";
		int arroba=email.indexOf("@");
		System.out.println("el dominio de "+email+" es:"+email.substring(arroba+1));
		
		//ejemplo 5.Extraer usuario de email del ejercicio anterior
		System.out.println("el usuario de "+email+" es:"+email.substring(0,arroba));
	
		//ejemplo 6.contar cuantas veces se repite una palabra en una frase
		
        String texto1 = "jajajajaj";
        String palabra = "aj";
        int contador1 = 0;
        int index1 = 0;
        
        while ((index1 = texto1.indexOf(palabra, index1)) != -1) {//ojo no confunfir Asignacion= y esto es Comparacion==
        	 
            contador1++;
            System.out.println("Encontrado en posición: " + index1);
            index1 += palabra.length(); // Avanzar después de la palabra encontrada
        }
        
        System.out.println("La palabra '" + palabra + "' aparece " + contador1 + " veces");	
			
		//ejemplo 7.Extraer la primera letra de una cadena
        String texto2="Hola Mundo";
        char letra=texto2.charAt(0);
        System.out.println("la primera letra de "+texto2+"es "+letra);
        
        //ejemplo 8. verificar que el texto2 contiene un Hola
        boolean contiene=texto2.contains("Hola"); //true
        System.out.println(contiene);
        //ejemplo 9. verificar que el texto2 empieza con Hola
        boolean empiezaCon=texto2.startsWith("Hola");//true
        System.out.println(empiezaCon);
        //ejemplo 10. verificar que el texto2 termina con Mundo
        boolean terminaCon=texto2.endsWith("Mundo");//true
        System.out.println(terminaCon);
        //ejemplo 11. COMPARACIONES, comparar estricto texto2, con texto3="hola mundo"
        boolean igualestricto=texto2.equals("hola mundo");//false pq texto2 tiene May
        System.out.println(igualestricto);
        //ejemplo 12. COMPARACIONES, comparar sin distincion con texto3="hola mundo"
        boolean igualIgnoreCase=texto2.equalsIgnoreCase("hola mundo");//true pq no distingue M
        System.out.println(igualIgnoreCase);
        
        //ejemplo 13. Dividir en partes cuando ve un indicador y lo lleva a un array
        //NOTA “(simbolos especiales) Si el separador es . | * + ? ( ) [ ] { } ^ $ entonces usa \\ antes. En los demás casos, no.”
        String texto4="1,Hola,Java";
        String[] partes=texto4.split(","); // no esta entre los simbolos especiales
        for(String x:partes) {
        	System.out.println(x);
        }
        String texto5="1.Hola.Java";
        String[] partes2=texto5.split("\\."); // si esta entre los simbolos especiales
        for(String x:partes2) {
        	System.out.println(x);
        }
        String texto6="1 Hola Java";
        String[] partes3=texto6.split(" "); // espacio no esta entre los simbolos especiales
        for(String x:partes3) {
        	System.out.println(x);
        }
        //ejemplo 14. Extraer como arrays de CHARS
        
        String texto7="java programming";
        char[] caracteres=texto7.toCharArray();
        for(int i=0;i<caracteres.length;i++) {
        	System.out.println("posicion "+i+" valor "+caracteres[i]);
        }
        
        for(char x:caracteres) {
        	System.out.println(x);
        }
        //ejemplo 15. eliminar espacios
        String texto8=" Hola Java ";
        String sinEspacios=texto8.trim();
        System.out.println(sinEspacios);
       
        

	}

}
