package tema_2;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_return {
    public static void main(String[] args) {

        //La estructura return se utiliza para salir de un método y, opcionalmente
        //devolver un valor al método que lo llamó

        int resultado = sumar(10, 5);
        System.out.println("La suma es: " + resultado);

    }
    public static int sumar(int a, int b){
        return a + b; //Devuelve la suma de numero1 y numero2
    }
}
