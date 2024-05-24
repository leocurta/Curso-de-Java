package estruturasDeRepetição;
import java.util.Scanner;

public class exercicioFor1 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for ( int i=1; i<=x; i = i+2){
            System.out.println(i);
        }
        sc.close();
    }    
}
