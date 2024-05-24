package estruturasDeRepetição;
import java.util.Scanner;

public class exercicioFor4 {
    public static void main(String[] args) {
        int n;
        double x1, x2, div;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i<n; i++){
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();

            if(x2 == 0){
                System.out.println("divisao impossiel");
            } else {
                div = x1 / x2;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}