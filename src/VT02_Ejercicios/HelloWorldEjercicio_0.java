package VT02_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class HelloWorldEjercicio_0 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce tu nombre");
        //Declaro una variable de tipo String y le asigno el valor escrito por teclado
        String nombre = scan.nextLine();
        System.out.println("Introduce dos números");
        //Creo variable de tipo entero y leo un entero por teclado
        int primerNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();
        System.out.println("Introduce un número con decimales");
        double numeroDecimal = scan.nextDouble();
        //Imprimo un mensaje por pantalla
        System.out.println("Hello " + nombre + "!");
        System.out.println("La suma es " + (primerNumero + segundoNumero));
        System.out.println("El número decimal es " + numeroDecimal);
        //Número PI: Math.PI
    }
}
