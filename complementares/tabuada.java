package complementares;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        int n, n1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i<= 10; i++){
            n1 = i * n;
            System.out.printf("%d x %d = %d%n", i, n, n1);
        }
        sc.close();
    }
    
}
