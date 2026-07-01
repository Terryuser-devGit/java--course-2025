package repasodepoo;

import java.time.LocalDate;

public class Persona_Juridica extends Contribuyente{
	private String ruc;
	private String nombre;
	private LocalDate fechadecreacion;
	public Persona_Juridica(String codigo, String nombre, String domicilioreal,String domiciliofiscal,String rubro, double impuesto,
			String ruc, String nombrehija,int anio, int mes, int dia) {
		super(codigo,nombre,domicilioreal,domiciliofiscal,rubro,impuesto);
		this.ruc=ruc;
		this.nombre=nombrehija;
		this.fechadecreacion=LocalDate.of(anio, mes, dia);				
		
	}
	public String getRuc() {
		return ruc;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getFechaCreacion() {
		return fechadecreacion;
	}
	@Override
	public String toString() {
		return super.toString()+" ,ruc: %s| nombre:%s |fecha de creacion:%s".formatted(getRuc(),getNombre(),getFechaCreacion());
	}
}
