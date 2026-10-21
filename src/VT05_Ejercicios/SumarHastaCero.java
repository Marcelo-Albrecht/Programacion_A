import java.util.Scanner;

public class SumarHastaCero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int cantidad = 0;
        int numero = 0;

        do{
            System.out.println("Introduce un número (0 para terminar):");
            numero = scan.nextInt();
            suma += numero;
            if(numero!=0){
                cantidad++;
            }
        }while(numero!=0);


        /*while(numero!=0){
            suma += numero;
            cantidad++;
            System.out.println("Introduce un número (0 para terminar):");
            numero = scan.nextInt();
        }*/

        System.out.println("Suma total: " + suma);
        System.out.println("Números introducidos: " + cantidad);
    }
}
