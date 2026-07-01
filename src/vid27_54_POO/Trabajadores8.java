package vid27_54_POO;
//USO DE INTERACES ....VID 51
//HAREMOS UN PROGRAMA DE GESTION DE EMPLEADOS(EMPLEADO(padre) Y JEFE (hija)) los cuales implementaran
//las interfaces Trabajadores y Jefes
public interface Trabajadores8{
	public abstract double estableceBonus(double bonus);//N. el metodo se define y no se implementa en interfaces
	double bonusBase=1500;//N nota todas las variables que declaras dentro de una interfaz son
						// public static y final y por ende las convierte en constantes
}
