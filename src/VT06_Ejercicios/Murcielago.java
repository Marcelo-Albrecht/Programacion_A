package VT06_Ejercicios;

import java.util.Scanner;
import java.util.HashSet;

public class Murcielago {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra=scan.nextLine();

        HashSet<Character> vogaisEncontradas = new HashSet<>();

        for (int i=0;i<palabra.length();i++){
            if (palabra.charAt(i)=='a' || palabra.charAt(i)=='e' || palabra.charAt(i)=='i' || palabra.charAt(i)=='o' || palabra.charAt(i)=='u'){
                vogaisEncontradas.add(palabra.charAt(i));
            }
        }
        if (vogaisEncontradas.size() == 5) {
            System.out.println("TODAS");
        } else {
            System.out.println("FALTAN");
        }


        scan.close();

    }
}
