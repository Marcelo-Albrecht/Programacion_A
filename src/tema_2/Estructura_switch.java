package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_switch {
    public static void main(String[] args) {

        //La estructura switch evalúa una expresión y ejecuta el bloque correspondiente
        //al valor de la expresión

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número de 1 hasta 7:");
        int dia = scan.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }
    }
}
