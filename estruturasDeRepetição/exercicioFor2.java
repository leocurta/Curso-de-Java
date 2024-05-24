package estruturasDeRepetição;
import java.util.Scanner;

public class exercicioFor2 {
    public static void main(String[] args) {
        int x, n, contIn =0, contOut= 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i < n; i++){
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                contIn++;
            } else {
                contOut++;
            }
        }
        System.out.printf("%d in%n", contIn);
        System.out.printf("%d out%n", contOut);
        sc.close();
    }
}
