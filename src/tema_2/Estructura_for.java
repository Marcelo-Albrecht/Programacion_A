package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_for {
    public static void main(String[] args) {

        //La estructura for ejecuta un bloque de código un número específico de veces

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce el número 0:");

        for (int numero = scan.nextInt(); numero < 5; numero++){
            System.out.println("Interación: " + numero);
        }

    }
}
