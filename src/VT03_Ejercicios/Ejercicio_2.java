package VT03_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce la nota del examen: ");
        double examen = scan.nextInt();
        System.out.println("Introduce la nota de practica: ");
        double practica = scan.nextInt();
        System.out.println("Introduce la nota de participacion: ");
        double participacion = scan.nextInt();
       //Calcula la nota media, con decimales, sabiendo que el examen
        //vale un 60%, las prácticas un 30% y la participación 10%
        double media = (examen * 0.6) + (practica * 0.3) + (participacion * 0.1);

        System.out.println("La media es " + media);

    }
}
