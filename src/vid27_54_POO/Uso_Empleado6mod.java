package vid27_54_POO;
import java.util.Comparator;
//USO DE INTERFACES -------------vid 49 (moderno y mejorado -java 17)
//ejemplo. haremos un programa de gestion de empleados el cual como principal metodo 
//sera ordenar por sueldo a los empleado
import java.util.List;
public class Uso_Empleado6mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var empleados = List.of(
                new Empleado6mod("Ricardo", "41224455", 8000),
                new Empleado6mod("Alberto", "23417458", 5000),
                new Empleado6mod("Micaela", "24145478", 4000),
                new Jefe6mod("Javier", "46710010", 30000, 5000),
                new Jefe6mod("Luis", "74221475", 10000, 2000)
        );
		
		 // Copiamos a lista mutable
        var listaOrdenable = new java.util.ArrayList<>(empleados);
     // Ordenar por sueldo ascendente
        listaOrdenable.sort(Comparator.comparingDouble(Empleado6mod::getSueldo));

        listaOrdenable.forEach(System.out::println);
	}

}
