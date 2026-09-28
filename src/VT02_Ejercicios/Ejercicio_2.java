package VT02_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        //Descubriendo el área de una pizza a partir del diámetro
        System.out.println("Ingrese el diametro de la pizza: ");
        int diametro = scan.nextInt();
        double raio = diametro / 2.0;
        double pi =  3.1416;
        double area = pi * (raio * raio);
        System.out.printf("El resultado del área de la pizza es: %.2f%n", area );

    }
}
