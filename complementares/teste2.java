package complementares;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        int x, som =0;
        Scanner sc = new Scanner(System.in);
        do{
            x = sc.nextInt();
            som += x;
        } while (x != 0);
        System.out.println(som);
        sc.close();
    }
}
