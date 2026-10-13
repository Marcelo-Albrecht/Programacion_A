package VT04_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        //Pide por teclado un número de 1 al 7 y muestra el día de la semana correspondiente.
        // Si el número no está entre 1 y 7, muestra "Día no válido".
        //• Modificación: En los días 6 y 7 tiene que mostrar el mensaje "Fin de semana".
        System.out.println("Ingrese el dia de la semana: ");
        int dia = scan.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Fin de Semana");
                break;
            case 7:
                System.out.println("Fin de Semana");
                break;
            default:
                System.out.println("Dia Incorrecto");

        }



    }
}
