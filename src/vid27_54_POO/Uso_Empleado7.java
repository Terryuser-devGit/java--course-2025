package vid27_54_POO;

import java.util.Arrays;

public class Uso_Empleado7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado7[] workers= {
					new Empleado7("Juan","23124567",2000),
					new Empleado7("maria","42154215",2500),
					new Empleado7("hugo","25256363",2500),
					new Jefe7("Javier","46710010",30000,5000),
					new Jefe7("Katherine","74760660",20000,2000)
			};
			Jefe7 jefeInfo=(Jefe7)workers[3];
			jefeInfo.tomarDecision("dar vacaciones por 10 dias a todos");
			//((Jefe7)(workers[3])).tomarDecision("dar vacaciones por 10 dias a todos"); --esto es otra foorma de hacer
			Arrays.sort(workers);
			for(Empleado7 x:workers) {
				System.out.println(x);
			}
		

	}
	
}
