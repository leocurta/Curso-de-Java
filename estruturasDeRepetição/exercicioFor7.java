package estruturasDeRepetição;
import java.util.Scanner;

public class exercicioFor7 {
    public static void main(String[] args) {
        int n, quad, cub, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++){
            quad =(int) Math.pow(i, 2);
            cub = (int) Math.pow(i,3);

            System.out.printf("%d ", i);
            System.out.printf("%d ", quad);
            System.out.println(cub);
        }
        sc.close();
    }
}
