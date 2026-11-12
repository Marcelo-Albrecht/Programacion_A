package tema_4.Recursividad;

public class Fibonacci {
    public static int calcularFibonacci(int n){
        //Condiciones base
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        //Llamada recursiva
        return calcularFibonacci(n-1) + calcularFibonacci(n-2);
    }
    public static void main(String[] args){
        int numero=6;
        int resultado=calcularFibonacci(numero);
        System.out.println("Fibonacci de "+numero+" es: "+resultado);
    }
}
