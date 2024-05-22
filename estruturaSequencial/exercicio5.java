package estruturaSequencial;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {
        int p1, nP1, p2, nP2;
        double vP1, vP2, total;

        Scanner sc = new Scanner(System.in);

        p1 = sc.nextInt();
        nP1 = sc.nextInt();
        vP1 = sc.nextDouble();

        p2 = sc.nextInt();
        nP2 = sc.nextInt();
        vP2 = sc.nextDouble();

        total = nP1 * vP1 + nP2 * vP2;

        System.out.printf("VALOR A PAGAR = %.2f%n", total);

        
        sc.close();
    }
}
