package estruturaCondicional;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {
        int cod, quant;
        double total;
        Scanner sc = new Scanner(System.in);
        cod = sc.nextInt();
        quant = sc.nextInt();

        if (cod == 1){
            total = quant * 4.00;
            System.out.printf("Total: R$ %.2f%n", total);

        } else if (cod == 2){
            total = quant * 4.50;
            System.out.printf("Total: R$ %.2f%n", total);

        } else if (cod == 3){
            total = quant * 5.00;
            System.out.printf("Total: R$ %.2f%n", total);

        } else if (cod == 4){
            total = quant * 2.00;
            System.out.printf("Total: R$ %.2f%n", total);

        } else if (cod == 5){
            total = quant * 1.50;
            System.out.printf("Total: R$ %.2f%n", total);

        } else {
            System.out.println("Codigo invalido");
        }
        sc.close();
    }
}
