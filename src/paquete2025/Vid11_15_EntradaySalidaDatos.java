package paquete2025;
import java.util.*;


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
        /* N.
         * ==   	   se usa comparar referencias
         * .equals()   se usa para comparar referencias SINO LO SOBRESCRIBES, SI RESSCRIBES tmb rescribir hashCode()				
         * la Clase String sobrescribio el metodo .equals() por eso que compara contenido
         * Si quieres que tu clase se comporte como String en igualdad lógica, tienes que sobrescribir equals() (y hashCode())	
         * String s1 = new String("Hola"); 
         * String s2 = new String("Hola");
         * System.out.println(s1 == s2);		//false NO SON OBJETOS IGUALES pq sus referencias son distintas
         * System.out.println(s1.equals(s2));   //true porque string sobrescribio y ahora compara contenido
         * Empleado1 e1 = new Empleado1("Juan", 2000, 2020, 5, 10);
         * Empleado1 e2 = new Empleado1("Juan", 2000, 2020, 5, 10);
         * System.out.println(e1 == e2);      //false NO SON OBJETOS IGUALES pq sus referencias son distintas
         * System.out.println(e1.equals(e2)); //false porque NO se ha sobrescribio, y si no se sobrescrito trabaja igual que  == 
         notita aparte
         NUNCA USAR == PARA COMPARA STRINGS PARA ELLO SE DISEÑO EL EQUALS Y ES FORMAL
         *pero como ejemplito pondre esto para explicar el String Pool
         String var1="hola";
	     String var2="hola";
	     System.out.println(var1==var2); // true, pq en Strings existe el String Pool que dice que si
	     creas una variable texto, ejemplo String var1="hola", es como si creara un espacio(referencia) llamado hola 
	     y si despues creas otra variable String var2="hola", este automaticamente apunta a la referencia existente hola
	     y asi todas las que se asignan como hola, APUNTAN A UNA SOLO REFERENCIA( por eso es true)
	     pero OJO esto pasa solo si al momento de crear el String lo haces de frente sin el new
	     pq String s1 = new String("Hola");  es diferente a String s1 = "Hola" (osea con el new mandas a otra referencia)
	         
        */
        //ejemplo 12. COMPARACIONES, comparar sin distincion con texto3="hola mundo"
        boolean igualIgnoreCase=texto2.equalsIgnoreCase("hola mundo");//true pq no distingue M
        System.out.println(igualIgnoreCase);
        
        //ejemplo 13. Extraer como arrays de Strings, un String grande, separado cada cierto simbolo
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
        //ejemplo 15. TRIM. eliminar espacios al inicio y la final, no los espacios del medio, ahora a partir de java 11 se usa STRIP es lo mismo pero poderoso
        String texto8=" Hola Java ";
        String sinEspacios=texto8.trim();
        System.out.println(sinEspacios);//hola java
        String texto8a="   ";
        String sinEspacios1=texto8a.trim();//quita todos los espacios en blanco cuando solo hay espacios en un String
        System.out.println(sinEspacios1);//""
       
        //ejemplo 16. reemplazar una palabra de una frase
        String texto9="Hola Peru, Peru, Peruvian";
        String reemplazado=texto9.replace("Peru", "Cusco");
        System.out.println(reemplazado);//Hola Cusco, Cusco, Cuscovian
        
        String texto10="a.b.c";
        String reemplazoall=texto10.replaceAll(".","-");// "------" (porque . significa “cualquier carácter”)
        System.out.println(reemplazoall);
        
        /*NOTA.Usa replace() cuando quieras reemplazar texto literal,y replaceAll() cuando necesites patrones (regex).
         * Una expresión regular es como una fórmula que describe un tipo de texto
         * \\d Un dígito (0–9)
         * \\D No es dígito
         * \\s Espacio, tabulación o salto de línea
         * \\S No es espacio
         * \\w Letra o número (A–Z, a–z, 0–9, _)
         * \\W No es letra ni número
         * .   Cualquier carácter
         * +   Uno o más     (\\d+ → varios números)
         * *   Cero o más    (a* → "", "a", "aa")
         * ?   Cero o uno    (a? → "", "a")
         * [abc]  Uno de esos caracteres  (a, b o c)
         * [^abc] Cualquier cosa excepto esos  (d, e, etc.)
         * {n} 	  Exactamente n repeticiones   (\\d{3} → tres dígitos)
         */ 
        
        //ejemplo 17. extraer solo el numero telefonico de texto
        String texto11="Mi teléfono es 947958770";
        String numero=texto11.replaceAll("\\D","");//reemplaza todo lo que no es digito
        System.out.println(numero);//947958770
        
        //ejemplo 18. convertir texto a Mayuscula
        String texto12="Javier Amache Loncone";
        String mayus=texto12.toUpperCase();// JAVIER AMACHE LONCONE
        System.out.println(mayus);
        String minus=texto12.toLowerCase();// javier amache loncone
        System.out.println(minus);
        
        //ejemplo 19. CONCATENAR 
        String texto14="siempre juntos";
        String resultado=texto14.concat(" siempre los dos");//siempre juntos siempre los dos
        System.out.println(resultado);
        /*NOTA: el metodo concat solo acepta como parametro un String, si quisieras unir un numero como texto con un string
        deberias ese numeron convertirlo a un string con el metodo String.value(numero) */ 
        int año=2025;
        System.out.println(resultado.concat(String.valueOf(año)));//siempre juntos siempre los dos2025
        /*No olvidar que tambien se usa el simbolo + para concatenar y trabaja igual en java*/
        /*ATENCION. concat() y el operador +
         * Ambos sirven para unir cadenas, pero cada vez que los usas, se crea un nuevo objeto String.
         * Recordemos: los String en Java son inmutables (no cambian su contenido).
         * Después de cada concat(), se crea una nueva cadena en memoria: "Hola", "Hola mundo", etc ( cada vez que usas un metodo en el String)
         * Esto es ineficiente si haces muchas concatenaciones, por ejemplo en un bucle.
         * 
         * StringBuilder (o StringBuffer)
         * StringBuilder es una clase que permite modificar cadenas sin crear nuevos objetos cada vez.
         * Es mutable, lo que significa que puedes agregar texto directamente sobre el mismo objeto
         */
        
        //ejemplo 20. StringBuilder
        StringBuilder texto15= new StringBuilder("Java");
        texto15.append(" ya casi te domino");
        texto15.append(" me falta poco");
        String resultado1=texto15.toString(); // se convierte a String por buenas practicas pq el texto15 es un Stringbuilder
        System.out.println(resultado1);
        
        //ejemplo 21. isEmpty(). determinar si una cadena esta vacia o no
        String texto16="hola Peru";
        System.out.println(texto16.isEmpty());//false
        String texto17=" ";
        System.out.println(texto17.isEmpty());//false, PQ NO OLVIDAR QUE LOS ESPACIOS VACIOS SON CONSIDERADOS STRINGS JAVA
        String texto18="";
        System.out.println(texto18.isEmpty());//true, PQ esta vacio sin espacios
        
        //ejemplo 22. isBlank(). determina si una cadena esta en blanco, o tiene puro espacios vacios (disp Java11)
        String texto19=" ";
        System.out.println(texto19.isBlank());// true  
        String texto20="";
        System.out.println(texto20.isBlank());// true
        String texto21="      a";
        System.out.println(texto21.isBlank());//false
        
        //ejemplo 23. Stringformat:SINTAXIS
        // "%(argument_index$)(flags)(width)(.precision)(TIPO DE DATO)"     ojo (No todos los campos son obligatorios)
        String texto23="hola";
        String t1=String.format("%10s",texto23);//escribir en la derecha en un ancho de 10 espacios
        // "%10s" : %(sin argument)(sin flag)(10 es el with es el 10 ancho que ocupara en pantalla)(sin precision)(s es tipo de dato String) 
        //(06)espaciosenblanco(04)Hola ->total 10 espacios del with
        System.out.println(t1);//......hola
        
        String t2=String.format("%-10s",texto23);//escribir a la izquierda en un acho 10 espacios
        // "%-10s" : sin argument,- es el flag que es escribir a la izquierda,10 es el with es el 10 ancho que ocupara en pantalla, sin precision, s es tipo String
        // (04)hola(06)espaciosenblanco ->total 10 espacios del with
        System.out.println(t2);//hola......
        
        int num=42;
        String t3=String.format("%010d",num);//escribir con 0s adelante el numero en un ancho 10 espacios
        // "%010d" : sin argument, 0 es el flag(en este caso se autocompletara con 0 los espacios vacios solo para tipo de datos numero entero),
        // 10 es el with es el 10 ancho que ocupara en pantalla, sin precision, d es tipo numeric(valido para datos numero entero)
        System.out.println(t3); //0000000042
        
        int num2=-323;
        String t4=String.format("%+d",num2);//escribir el numero entero con signo
        //"%+d" : sin argument, + es el flag (que pone signo + o - a todos los numeros enteros), sin width, sin precision, d es tipo numeric(valido para datos numero entero)
        System.out.println(t4);//-323
        
        double num3=34325245.214876;
        String t5=String.format("%,.3f",num3);//escribir el decimal con 3 decimales despues de la coma
        //"%,.d" : sin argument,es el flag (que pone , a los miles a todos los numeros float double),sin width,(.3 es precision 3 decimales), f es tipo numeric(valido para datos numero float y double)
        System.out.println(t5);//34,325,245.214
        
        String texto22="ABCDEFG";
        String t6=String.format("%.2s",texto22);//para tipo de datos String limita caracteres
        System.out.println(t6);//AB
        
        //imprimir con argument no es otra cosa que indicarle el orden en las cuales va imprimir los parametros pasados(empieza desde 1 hasta n)
        String t7=String.format("%2$s %1$d",25,"edad:");
        //"%2$s %1$d" : 2$ es el argument que se refiere al segundo parametro tipo s y 1$ se refiere al primer parametro tipo d,sin flags,sin width,sin prec
        System.out.println(t7);//edad: 25 
        
         /* RECUERDA
         * Conversión	Significado
         *		s		String
         *		d		Entero
         *		f		Decimal (float/double)
         *		b		Boolean
         *		c		Carácter
         *		%		Imprime un % literal
         *
         NOTA
         1. String.format()✔️ Devuelve un String formateado. ❌ No imprime nada por sí mismo.
         	usar cuando : Necesitas guardar el texto, Haces reportes, Trabajas con interfaces gráficas, Trabajas con archivos
         
         2. System.out.printf() ✔️ Imprime directamente en la consola. ❌ No devuelve un String (retorna un PrintStream, no usable como texto).
         	usar cuando: Solo quieres ver el resultado en consola,Haces pruebas rápidas
         */	
        
        //ejemplo 24. String.join ->Es un metodo que une varias cadenas (acepta list, set,etc) usando un delimitador (ya sea coma ,guion -, barra |, salto \n)
        String csv= String.join(",","Id","Nombre","Edad");
        System.out.println(csv);//Id,Nombre,Edad
        
       List<String> distritos=List.of("cusco","santiago","wanchaq");
        String juntos=String.join("|", distritos);
        System.out.println(juntos);//cusco|santiago|wanchaq
        
        
        
        
        

	}

}
