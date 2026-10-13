package VT04_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        //Haz un programa que reciba un entero y nos diga si es par o impar.
        System.out.println("Ingrese el valor de la compra: ");
        int numeroEntero = scan.nextInt();

        if (numeroEntero%2 == 0){
            System.out.println("El valor es par");
        }else {
            System.out.println("El valor es impar");

        }




    }
}
