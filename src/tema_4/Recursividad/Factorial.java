package tema_4.Recursividad;

public class Factorial {
    public static int calcularFactorial(int n){
        //Condicíon base
        if (n==0){
            return 1;
        }
        //Llamada recursiva
        return n*calcularFactorial(n-1);
    }public static void main(String[] args){
        int numero=5;
        int resultado=calcularFactorial(numero);
        System.out.println("Factorial de "+numero+" es: "+resultado);
    }
}
