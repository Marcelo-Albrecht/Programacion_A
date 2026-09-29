package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Recursividad_fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número:");

        int n = scan.nextInt();
     int resultado = fibonacci(n);
     System.out.println("El término " + n + " de la sucesión de Fibonacci es: " + resultado);

    }
    public static int fibonacci(int n){
        if (n <= 1){
            return n; //Condicion base
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); //Llamada recursiva
        }
    }

}
