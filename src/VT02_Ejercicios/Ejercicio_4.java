package VT02_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        //En una escuela tenemos 3 clases y queremos saber cuál es el número de pupitres que
        //necesitaremos en total. Dependerá del número de alumnos por aula. Hay que tener en
        //cuenta que caben 2 alumnos en cada pupitre.
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Ingrese la cantidad de alumnos de la primera clase:");
        int clase1 = scan.nextInt();
        System.out.println("Ingrese la cantidad de alumnos de la segunda clase:");
        int clase2 = scan.nextInt();
        System.out.println("Ingrese la cantidad de alumnos de la tercera clase:");
        int clase3 = scan.nextInt();
        //Dividimos por 2 y sumamos el resto para cada clase.
        int pupitresClase1 = (clase1 / 2) + (clase1 % 2);
        int pupitresClase2 = (clase2 / 2) + (clase2 % 2);
        int pupitresClase3 = (clase3 / 2) + (clase3 % 2);
        int totalPupitres = pupitresClase1 + pupitresClase2 + pupitresClase3;
        System.out.println("Cada clase tiene que tener " + totalPupitres + " pupitres.");



    }
}
