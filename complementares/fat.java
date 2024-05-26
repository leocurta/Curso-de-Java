package complementares;
import java.util.Scanner;

public class fat {
    public static void main(String[] args) {
        int n, fat = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.printf("%d! =", n);
        for(int i=n; i>= 2; i--){
            fat *= i;
            System.out.printf(" %d X", i);
        }
        System.out.print(" 1 = ");
        System.err.println(fat);
        sc.close();
    }
}
