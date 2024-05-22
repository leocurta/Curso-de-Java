package estruturaSequencial;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        int A, B, som;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        som = A + B;
        sc.close();
        System.out.printf("SOMA = " + som);
        
    }
}