package vid27_54_POO;

public class Uso_Empleado4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado4[] arrayempleados= {
				new Empleado4("juan",4000,2000,1,1),
				new Empleado4("alberto",3000,2010,2,2),
				new Empleado4("pedro"),
				new Empleado4("juan"),
				new Empleado4("Javier",10000),
				new Empleado4("Cesar",10000)
		};
		for(Empleado4 x:arrayempleados) {
			System.out.println(x);
		}
				
		
		
	}

}
