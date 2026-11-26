package repasodepoo;
import java.util.Scanner;
public class Calculadora {
    //atributos
    //constructor
    //metodos
    public static double sumar(double numero1, double numero2){
        return (numero1 + numero2);
    }
    public static double restar(double numero1, double numero2){
        return (numero1 - numero2);
    }
    public static double multiplicar(double numero1, double numero2){
        return (numero1 * numero2);
    }
    public static double dividir(double numero1, double numero2) {
        return (numero1 / numero2);
    }
    //metodo principal denominada main
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera=true;
        while (bandera) {
                System.out.println("bienvenidos a la calculadora \n" +
                        "presiona 1: sumar\n" +
                        "presiona 2: restar\n" +
                        "presiona 3: multiplicar\n" +
                        "presiona 4: dividir\n" +
                        "presiona 5: salir del programa \n" +
                        "------------------------------------");
                int opcioningresada = teclado.nextInt();
                if ((opcioningresada > 5) || (opcioningresada < 1)) {
                    //bandera = true;
                    System.out.println("ingrese una opcion valida\n");
                    continue; //N. rompe el ciclo alctual y pasa al siguiente
                } else if(opcioningresada==5){
                    break;    //N. rompe todo el while
                  }
                System.out.println("ingresa el primer numero");
                double numero1=teclado.nextDouble();
                System.out.println("ingresa el segundo numero");
                double numero2=teclado.nextDouble();
                switch (opcioningresada){
                    case 1:
                        System.out.println("la suma es: "+sumar(numero1,numero2)+"\n");
                        break;
                    case 2:
                        System.out.println("la resta es: "+restar(numero1,numero2)+"\n");
                        break;
                    case 3:
                        System.out.println("la multiplicacion es: "+multiplicar(numero1,numero2)+"\n");
                        break;
                    case 4:
                        if(numero2==0){
                            System.out.println("Error: no se puede dividir por cero");
                        }
                        else {
                            System.out.println("la division es: " + dividir(numero1, numero2) + "\n");
                            break;
                        }
                };
            }
        System.out.println("programa cerrado");
        teclado.close();
    }
}
