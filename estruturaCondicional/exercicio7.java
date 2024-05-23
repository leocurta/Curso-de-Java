package estruturaCondicional;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) throws Exception {
        double x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y ==0){
            System.out.println("Origem");
        } else if (x > 0){
            if (y > 0){
                System.out.println("Q1");
            } else if (y < 0){
                System.out.println("Q4");
            }
        } else if (x < 0){
            if (y > 0){
                System.out.println("Q2");
            } else if (y < 0){
                System.out.println("Q3");
            }
        }
        sc.close();
    }
}
