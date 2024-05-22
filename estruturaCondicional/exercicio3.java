package estruturaCondicional;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args ) throws Exception {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b){
            if (a % b == 0){
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if (a < b){
            if (b % a == 0){
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
