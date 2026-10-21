package VT05_Ejercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class AdvinaElNumero {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        //El programa genera un número aleatorio entre 1 y 100.
        // El usuario lo intenta adivinar y se le
        //indica “mayor” o “menor” tras cada intento. Al acertar, muestra el número de intentos
        //empleados
        Random random = new Random();
        int secreto = random.nextInt(100)+1;
        int intentos = 0;
        System.out.println("Advina el numero de 1 al 100:");
        int numero = scan.nextInt();

        for (intentos=0;numero!=secreto;intentos++){
            if (numero<secreto){
                System.out.println("Número menor,intenta con otro número :");
                numero = scan.nextInt();
            }else{
                System.out.println("Número mayor, intenta con otro número");
                numero = scan.nextInt();
            }


        }
        System.out.println("Correcto, es el número " + secreto + "!");
        System.out.println("Lo intentaste " + intentos + " veces");




    }
}
