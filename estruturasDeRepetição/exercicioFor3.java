package estruturasDeRepetição;
import java.util.Scanner;
import java.util.Locale;

public class exercicioFor3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        int n;
        double x1, x2, x3, media =0.0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i =0; i<n; i++){
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            media = ((x1*2)+(x2*3)+(x3*5))/10;
            System.out.printf("%.1f%n", media); 
        }
        sc.close();
    }
}
