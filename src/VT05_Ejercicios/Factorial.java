import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número positivo:");
        int n = scan.nextInt();

        long factorial = 1;
        /*for(int i = 2;i<=n;i++){
            factorial = factorial * i;
        }*/
        for(int i=n;i>1;i--){
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}