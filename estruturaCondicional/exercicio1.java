package estruturaCondicional;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        sc.close();
    }
}