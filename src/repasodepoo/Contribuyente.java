package repasodepoo;

public class Contribuyente implements Comparable<Contribuyente> {
	private String codigo;
	private String nombre;
	private String domicilioreal;
	private String domiciliofiscal;
	private String rubro;
	private double impuesto;
	public Contribuyente(String codigo, String nombre, String domicilioreal,String domiciliofiscal,String rubro, double impuesto) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.domicilioreal=domicilioreal;
		this.domiciliofiscal=domiciliofiscal;
		this.rubro=rubro;
		this.impuesto=impuesto;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDomicilioReal() {
		return domicilioreal;
	}
	public String getDomicilioFiscal() {
		return domiciliofiscal;
	}
	public String getRubro() {
		return rubro;
	}
	public double getImpuesto() {
		return impuesto;
	}
	//sobreesbrimos el metodo compareto de la interfaz Comparable
	@Override
	public int compareTo(Contribuyente otroContribuyente) {
		return Double.compare(getImpuesto(),otroContribuyente.getImpuesto());
	}
	//sobreescribimos el metodo toString de la Clase Object
	public String toString() {
		return "codigo:%s|, nombre:%s,| domicio real:%s|, domicilio fiscal:%s|, rubro:%s|, Impuesto: %.2f"
				.formatted(getCodigo(),getNombre(),getDomicilioReal(),getDomicilioFiscal(),getRubro(),getImpuesto());
	}
}
