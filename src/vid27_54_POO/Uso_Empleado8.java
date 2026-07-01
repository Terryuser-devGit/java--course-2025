package vid27_54_POO;

import java.util.Arrays;

//USO DE INTERACES ....VID 51
//HAREMOS UN PROGRAMA DE GESTION DE EMPLEADOS(EMPLEADO(padre) Y JEFE (hija)) los cuales implementaran
//las interfaces Trabajadores y Jefes
public class Uso_Empleado8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado8[] employees= {
							new Empleado8("carla","44125468",8000,2020,10,1),
							new Empleado8("ricardo","48125468",3000,2020,10,1),
							new Empleado8("raul","42125468",4000,2020,10,1),
							new Jefe8("Javier","46710010",30000,2026,10,1,5000),
							new Jefe8("Katherin","67646674",10000,2026,10,1,5000),
		};
		Arrays.sort(employees);
		for(Empleado8 e:employees) {
			System.out.println(e);
			System.out.println(" el bono por navidad es: "+e.estableceBonus(1000));
													   //bonusBase 1500+ 1000=2500 (para empleado8)
													   //bonusBase 1500+prima2000+1000=4500(para jefes8)
			if (e instanceof Jefe8 jefe) {
					jefe.tomarDecision("dar premio vacaciones a todos");
					
				}
			//System.out.println(e);
		}
		
		//Jefe8 jefeinfo=(Jefe8)employees[3];
		//jefeinfo.tomarDecision("dar 15 dias de vacaciones por ser buenos");
	}

}


