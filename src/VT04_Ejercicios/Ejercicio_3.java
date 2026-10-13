package VT04_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        //Se nos da una nota entera y tenemos que mostrar la calificación equivalente:
        //o Menor que 5: Suspenso.
        //o De 5 a menos de 7: Aprobado.
        //o De 7 a menos de 9: Notable.
        //o De 9 a 10: Sobresaliente.
        //o Cualquier otro valor: Nota no válida.
        System.out.println("Ingrese el valor de la compra: ");
        int nota = scan.nextInt();

        if (nota<5){
            System.out.println("Suspenso");
        }else if (nota<=7){
            System.out.println("Aprobado");
        }else if (nota<=9) {
            System.out.println("Notable");
        } else if (nota<=10) {
            System.out.println("Sobresaliente");
        }else
            System.out.println("Nota no válida");



    }
}
