package vid27_54_POO;
//uso de Enum --(vid48)
//haremos un programa que solo pueda tner cierto conjunto de datos posibles, en
//este caso pondremos los dias de la semana
//N. los enum veelo como una clase, su tratamiento y la sintaxis son casi iguales
// 1 TRATATIVA
//osea declaras como clase (en otro archivo propio (en eclipse: pacakge->new->enum ) y lo llamas en otro archivo Uso_dias
// 2 ANALOGIA COMO MEMOTECNIA
// public class Dias -> en vez de class se pone enum (clase)
// public enum  Dias 								(enum)

public enum Dias {
	LUNES,			
	MARTES,
	MIERCOLES,
	JUEVES,
	VIERNES,
	SABADO,
	DOMINGO
} //Aquí estás diciendo: una variable de tipo Dia solo puede tomar uno de esos valores.

/* ¿veamoos que pasa realmente cuando creamos   un enum?
  	Cuando escribes:
    enum Dias {
    LUNES, MARTES, MIERCOLES }
 	
 	Java internamente hace algo como esto:
    public final class Dias {
    public static final Dias LUNES = new Dias();
    public static final Dias MARTES = new Dias();
    public static final Dias MIERCOLES = new Dias();
   
    👉 O sea:
	Los objetos ya están creados automáticamente
	Son únicos (tipo Singleton)
}
 * */
