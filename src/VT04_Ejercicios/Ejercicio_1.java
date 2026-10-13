package VT04_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        //Hemos abierto una tienda y como promoción de bienvenida aplicaremos un 10% de
        //descuento a los clientes que realicen una compra igua l o superior a 100 €
        System.out.println("Ingrese el valor de la compra: ");
        double valorCompra = scan.nextDouble();

        if (valorCompra >= 100){
            valorCompra = valorCompra - (valorCompra * 0.1);
        }

        System.out.println("El valor a pagar es:" + valorCompra);

    }
}
