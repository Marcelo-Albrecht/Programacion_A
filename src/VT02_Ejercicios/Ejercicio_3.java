package VT02_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        //Haz un programa que añada 1 segundo a un número de segundos determinado.
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        int segundos = scan.nextInt();
        int resultado = (segundos + 1) % 60;
        System.out.println(resultado);
    }
}
