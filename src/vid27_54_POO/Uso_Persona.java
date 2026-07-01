package vid27_54_POO;
//----- vid 45 y 46
public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] gente = { 
						new Alumno("Juan Torres","derecho"),
						new Alumno("Elvis Cruz","electricidad"),
						new Servidor("Adolfo ruiz", "Recursos Humanos",1),
						new Servidor("Luisa quispe", "Patrimonio",2),
				
		};
		for(Persona x: gente) {
			System.out.println(x.getDescripcion());
		}
	}

}
