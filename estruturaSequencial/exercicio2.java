package estruturaSequencial;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        int r;
        double pi = 3.14159, area;

        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        

        area = Math.pow(r, 2) * pi;

         System.out.printf("A = %.4f%n", area);
         sc.close();
    }
}
