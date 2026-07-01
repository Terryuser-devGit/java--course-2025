package empresa.servicio;
//MODIFICADORES DE ACCESO----  vid 47 
import empresa.modelo.Empleado;//N. cuando vas a usar una clase de otro paquete debes importar ese paquete, asi como haces con la clase Scanner y otros

public class RRHH {
		public void aplicarAumento(Empleado emp, double porcentaje) {
			//emp.aumentarSalario(porcentaje);
			//N. esto nos da error porque el metodo aumentarSalario es protected(accesible solo desde su mismo package) pero estamos en otro package
			//Esto es seguridad empresarial

			emp.solicitarAumento(porcentaje); //N. se accede pq es public el metodo. Ahora RRHH usa el método público controlado.
		}
}
