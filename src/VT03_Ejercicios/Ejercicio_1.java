package VT03_Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        final double diasTrabajo = 30;
        //Declaro un scanner para poder leer datos de teclado
        Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Ingrese el precio del PC: ");
        double precioPC = scan.nextInt();
        System.out.println("Ingrese su sueldo mensual: ");
        double sueldoMensual = scan.nextInt();
       //Calcular el sueldo mensual a diário
        double sueldoDiario = sueldoMensual/diasTrabajo;

        //Calcula cuantos dias de necesita trabajar para comprar la Pc
        double diasComprarPc = precioPC/sueldoDiario;
        System.out.println("Tiene que ahorrar " + Math.round(diasComprarPc) + " dias");

    }
}
