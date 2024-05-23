package estruturaCondicional;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) throws Exception{
        double salario, imp;
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();

        if (salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imp = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f%n", imp);
        } else if (salario <= 4500.00) {
            imp = (salario - 3000) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imp);

        } else {
            imp = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imp);

        } 
        sc.close();
    }
}
