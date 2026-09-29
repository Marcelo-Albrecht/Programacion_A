package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_continue {
    public static void main(String[] args) {

        //La estructura continue se utiliza para omitir la interación actual de un bucle
        // y pasar a la seguiente iteración

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un múmero menor que 10:");

        for (int numero = scan.nextInt(); numero < 10; numero++) {
            if (numero % 2 == 0) {
                continue; //Omite la iteración si numero es par
            }
            System.out.println("Iteración impar: " + numero);
        }



    }
}
