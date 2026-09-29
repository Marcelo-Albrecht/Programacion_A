package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_while {
    public static void main(String[] args) {

        //La estructura while ejecuta un bloque de código mientras una condición
        //sea verdadera

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número menor que 5:");

        int numero = scan.nextInt();

        while (numero < 5){
            System.out.println("Interación: " + numero);
            numero++;
        }

    }
}
