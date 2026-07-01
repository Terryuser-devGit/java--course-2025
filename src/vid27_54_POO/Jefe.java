package vid27_54_POO;
//HERENCIA Y POLIMORFISMO-----vid 42,43 y 44
//hereda de Empleado5 porque cumple la regla de "ES UN"--> Jefe es un Empleado
public class Jefe extends Empleado5{
	private double incentivo;
	
	public Jefe(String nombre, double sueldo) {
		super(nombre,sueldo,1990,6,17);//N. el Super tiene que ser la 1 instruccion, asimismo
										//completamos los datos pq el constructor recibe 5 parametros

		//N. tal vez po equivocacion pensaste poner 
		// this.nombre=nombre;
		// this.sueldo=sueldo;
		//Esto es un error pq 1ro. no son atributos directos de Jefe, son heredados
		//2do. estarias violando la integridad de Empleado5, pq es PRIVATE nombre,
		// y entonces para acceder a ellos lo hacemos desde su constructor que ademas
		//es PUBLIC
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo=incentivo;
	}
	@Override
	public double getSueldo() {
		return super.getSueldo()+incentivo;
		//N. aqui pudimos ponerle otro nombre al metodo getsueldoJefe() y no pasaba nada
		//pero le ponemos getSueldo() para sobreescribir el metodo del Padre y haga de acuerdo
		//a las instrucciones del metodoSobreescrito.
	}
	
	@Override
	public String toString() {
		return super.toString()+", incentivo:"+incentivo;
	}
}
