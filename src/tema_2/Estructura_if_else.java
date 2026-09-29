package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número mayor que 5:");
        int numero = scan.nextInt();
        if (numero > 5) {
            // Si es verdadera, se ejecuta el bloque y si es falsa, se ejecuta el bloque alternativo
            System.out.println("El número es mayor que 5");

        }else {
            System.out.println("El número es menor o igual que 5");
        }
    }
}
