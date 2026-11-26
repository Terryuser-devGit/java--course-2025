package repasodepoo;

public class Empleado_Main {

    public static void main(String[] args) {
        Empleado e1= new Empleado(1,"juan ",3500,"sistemas");
        Empleado e2= new Empleado(2,"pedro ",2800,"contabilidad");
        Empleado e3= new Empleado(3,"Maria ",3200,"recursos humanos");
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();
        e1.aumentarSalario(15);
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();
    }

}
