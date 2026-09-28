package VT02_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        //El usuario escribe 4 enteros y se imprime el valor de sumar el primero con el segundo,
        //multiplicado por el módulo del tercero con el cuarto. ( a+b )*(c%d )
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Ingrese el primer número: ");
        int primer = scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int segundo = scan.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int tercer = scan.nextInt();
        System.out.println("Ingrese el cuarto número: ");
        int cuarto = scan.nextInt();
        /*prime el valor de sumar el primero con el segundo,
        multiplicado por el módulo del tercero con el cuarto. ( a+b )*(c%d)
         */
        System.out.println("El resultado es: ");
        int resultado = (primer + segundo) * (tercer % cuarto);
        System.out.println(resultado);
    }
}
