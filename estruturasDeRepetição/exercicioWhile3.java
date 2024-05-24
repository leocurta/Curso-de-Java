package estruturasDeRepetição;
import java.util.Scanner;

public class exercicioWhile3 {
    public static void main(String[] args) {
        int op, contA = 0, contG = 0, contD = 0;
        Scanner sc = new Scanner(System.in);
        do{
            op = sc.nextInt();
            if (op == 1){
                contA++;
            } else if (op == 2){
                contG++;
            } else if (op == 3){
                contD++;
            }
        } while (op != 0);
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", contA);
        System.out.printf("Gasolina: %d%n", contG);
        System.out.printf("Diesel: %d%n", contD);
        sc.close();
    }
}
