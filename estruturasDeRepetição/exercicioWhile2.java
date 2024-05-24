package estruturasDeRepetição;
import java.util.Scanner;

public class exercicioWhile2 {
    public static void main(String[] args) {
        int x, y;   
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0 ){
            if (x > 0){
                if ( y > 0){
                    System.out.println("primeiro");
                } else {
                    System.out.println("quarto");
                }
            } else  {
                if (y > 0){
                    System.out.println("segundo");
                } else {
                    System.out.println("terceiro");
                }
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
