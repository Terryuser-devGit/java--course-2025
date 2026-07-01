package empresa.app;
//MODIFICADORES DE ACCESO----  vid 47 
import empresa.modelo.*;
import empresa.servicio.RRHH;//N. cuando vas a usar una clase de otro paquete debes importar ese paquete, asi como haces con la clase Scanner y otros

public class Principal {
		public static void main(String[] args) {
			Empleado dev= new Desarrollador("Juan",10000,3,"Java");
			Empleado ger= new Gerente("Carlos",5000,5,2000);
			
			RRHH rrhh=new RRHH();
			rrhh.aplicarAumento(dev, 0.10);
			
			System.out.println(dev.getNombre()+" gana: "+dev.calcularSalario());
			System.out.println(ger.getNombre()+" gana: "+ger.calcularSalario());
		}
}
