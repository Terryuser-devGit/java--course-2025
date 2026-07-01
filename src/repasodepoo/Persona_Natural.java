package repasodepoo;

import java.time.LocalDate;

public class Persona_Natural extends Contribuyente{
	private String dni;
	private String nombre;
	private String apellidopaterno;
	private String apellidomaterno;
	private LocalDate fechanacimiento;
	public Persona_Natural(String codigo, String nombre, String domicilioreal,String domiciliofiscal,String rubro, double impuesto,
			String dni, String nombrehija, String apellidopaterno, String apellidomaterno,int anio, int mes, int dia) {
		super(codigo,nombre,domicilioreal,domiciliofiscal,rubro,impuesto);
		this.dni=dni;
		this.nombre=nombrehija;
		this.apellidomaterno=apellidopaterno;
		this.apellidomaterno=apellidomaterno;
		this.fechanacimiento=LocalDate.of(anio, mes, dia);
	}
	
}
