package VT03_Ejercicios;

import jdk.jshell.EvalException;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un valor em € para descomponer: ");
        double valorEuro = scan.nextDouble();
       //Dada una cantidad de euros, descompón la cantidad en
        // monedas de 2 €, 1 €, 0.5 €, 0.2 €, 0.1 €, 0.05 €, 0.02 € y 0.01
        int centavos = (int) Math.round(valorEuro * 100);
        int moneda2 = centavos / 200;
        centavos = centavos % 200;
        System.out.println("Monedas de 2€ " + moneda2);
        int moneda1 = centavos / 100;
        centavos = centavos % 100;
        System.out.println("Monedas de 1€ " + moneda1);
        int moneda50 = centavos / 50;
        centavos = centavos % 50;
        System.out.println("Monedas de 0.50€ " + moneda50);
        int moneda20 = centavos / 20;
        centavos = centavos % 20;
        System.out.println("Monedas de 0.20€ " + moneda20);
        int moneda10 = centavos / 10;
        centavos = centavos % 10;
        System.out.println("Monedas de 0.10€ " + moneda10);
        int moneda05 = centavos / 5;
        centavos = centavos % 5;
        System.out.println("Monedas de 0.05€ " + moneda05);
        int moneda02 = centavos / 2;
        centavos = centavos % 2;
        System.out.println("Monedas de 0.02€ " + moneda02);
        int moneda01 = centavos / 1;
        centavos = centavos % 1;
        System.out.println("Monedas de 0.01€ " + moneda01);

    }
}
