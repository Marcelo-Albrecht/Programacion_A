package VT06_Ejercicios;

import java.util.Scanner;

public class HarrisonFor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el número de millones que tiene Harrison:");
        final long CANTIDAD_SALTO=1000000;
        long milliones=scan.nextInt();

        for (long millon=CANTIDAD_SALTO;millon<=milliones;millon+=CANTIDAD_SALTO){
            System.out.println(millon);
        }

        scan.close();

    }
}
