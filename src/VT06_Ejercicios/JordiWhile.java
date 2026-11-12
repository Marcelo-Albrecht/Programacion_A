import java.util.Scanner;

public class JordiWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int STRIKE = -1;
        final int CHANNEL_CLOSED = 3;
        int numeroVideos = 0;
        int strikes = 0;
        while(strikes<CHANNEL_CLOSED){
            System.out.println("Introduce número de viewers:");
            int viewers = scan.nextInt();
            if(viewers != STRIKE){
                numeroVideos++;
            }
            else{
                strikes++;
            }
        }
        System.out.println("Jordi While ha subido " + numeroVideos + "videos.");
        scan.close();
    }
}
