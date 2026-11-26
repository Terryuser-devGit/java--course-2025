package repasodepoo;

public class Empleado {
    //atributos
    private int id;
    private String nombre;
    private double salario;
    private String departamento;
    //constructor
    public Empleado( int id, String nombre, double salario, String departamento){
        this.id=id;
        this.nombre=nombre;
        this.salario=salario;
        this.departamento=departamento;
    }
    //metodos
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return "El id: "+getId()+" El nombre es: "+getNombre()+" El salario es: "+getSalario()+" El departamento es: "+getDepartamento();
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }
    public void aumentarSalario(double porcentaje){
        if(porcentaje>0) {
            this.salario = (getSalario() * porcentaje / 100) + salario;
        }
        else {
            System.out.println("el porcentaje no debe ser negativo");
        }
    }


}
