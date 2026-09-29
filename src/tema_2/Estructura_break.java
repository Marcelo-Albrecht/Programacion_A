package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_break {
    public static void main(String[] args) {

        //La estructura break se utiliza para salir de un bucle o de un switch

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número menor que 5:");

        for (int numero = scan.nextInt(); numero < 10; numero++) {
            if (numero == 5) {
                break; //Sale del bucle vuando numero es igual a 5
            }
            System.out.println("Interación: " + numero);
        }



    }
}
