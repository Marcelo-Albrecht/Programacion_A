package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_if_else_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número:");
        int numero = scan.nextInt();
        if (numero > 10) {
            // Si ejecuta el primer bloque cuya condición sea verdadera,
            // si no, se ejecuta un bloque else final.
            System.out.println("El número es mayor que 10");

        }else if (numero > 5){
            System.out.println("El número es mayor que 5 pero menor o igual a 10");
        }else {
            System.out.println("El número es menor o igual que 5");
        }
    }
}
