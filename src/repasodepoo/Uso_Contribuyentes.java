package repasodepoo;

import java.util.Arrays;

public class Uso_Contribuyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contribuyente[] arraycontribuyentes= { new Persona_Natural("01","frq","av baja 102","calle maruri 102","normal",
												5000,"41414142","fredy","rayos","quispe",2001,12,1),
				new Persona_Natural("02","jgg","av sol 302","calle marquez 21","normal",
						7200,"24242441","juan","garces","garces",1995,6,2),
				new Persona_Natural("03","brv","calle belen 225","calle maruri 102","normal",
						1500,"23417852","braulio","ramirez","valcarcel",1998,4,2),
				new Persona_Natural("04","eev","apv sol inka e-4","calle maruri 102","normal",
						700,"74747474","elvis","enriquez","valdivia",2000,1,1),
				new Persona_Natural("05","aes","calle mariscal gamarra 124","calle maruri 102","normal",
						9000,"24241241","alberto","elaez","sarmiento",1995,7,4),
				new Persona_Juridica("06","ws","av cultura 24","av el sol 102","construccion",
						14000,"24242410104","corporacion masters",2005,7,4),
				new Persona_Juridica("07","msd","av cultura 20","av el sol 102","supermercado",
						12000,"20242410103","orion mercados",2001,1,1),
				new Persona_Juridica("08","pdg","av cultura 21","av el sol 102","consultorio legal",
						10000,"2222241104","estudio juridico lms",2010,3,2),
				new Persona_Juridica("09","atq","av cultura 14","av el sol 102","venta de motocicletas",
						2000,"23232410104","atoq motorcycles",2004,5,1)
		};
		
		Arrays.sort(arraycontribuyentes);
		for(Contribuyente x:arraycontribuyentes) {
			System.out.println(x); 
		}
	}

}
