package complementares;
import java.util.Scanner;           


public class operacoes {
    public static void main(String[] args) {
        int x, y, op, resultado;
        do{ 
            System.err.println("Escolha a opcao:");
            System.err.println("(1) Soma");
            System.err.println("(2) Subtracao");
            System.err.println("(3) Multiplicacao");
            System.err.println("(4) Divisão");

            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            if (op == 1){   
                resultado = x + y;
                System.out.println(resultado);
            } else if (op == 2) {
                resultado = x - y;
                System.out.println(resultado);
            } else if (op == 3) {
                resultado = x * y;
                System.out.println(resultado);
            } else if (op == 4) {
                resultado = x/ y;
                System.out.println(resultado);
            }   
    } while (x != 0 && y != 0);
    }    
}
