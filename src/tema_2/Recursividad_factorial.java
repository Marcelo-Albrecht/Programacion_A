package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Recursividad_factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número:");

        int numero = scan.nextInt();
     int resultado = factorial(numero);
     System.out.println("El factorial de " + numero + " es: " + resultado);

    }
    public static int factorial(int n){
        if (n == 0){
            return 1; //Condicion base
        } else {
            return n * factorial(n - 1); //Llamada recursiva
        }
    }

}
