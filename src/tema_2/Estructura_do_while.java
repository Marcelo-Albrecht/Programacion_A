package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_do_while {
    public static void main(String[] args) {

        //La estructura do-while es similar ao while, pero garantiza que el bloque se ejecute
        //ao menos una vezantes de evaluar la condición

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número menor que 5:");

        int numero = scan.nextInt();

        do {
            System.out.println("Interación:" + numero);
            numero++;

        } while (numero < 5);



    }
}
