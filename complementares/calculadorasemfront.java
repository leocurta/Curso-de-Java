package complementares;

import java.util.Scanner;
import complementares.entities.Calculadora;

public class calculadorasemfront {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();
        double x, y, resultado =0;
        int op;

        Scanner sc = new Scanner(System.in);
        

        do{
        System.out.println("Selecione a operacao: ");
        System.out.println("(1) Soma");
        System.out.println("(2) Subtracao");
        System.out.println("(3) Multiplicacao");
        System.out.println("(4) Divisao");
        System.out.println(" ");

        op = sc.nextInt();
        switch (op) {
        case 1:
            System.out.println("Digite o primeiro valor:");
            x = sc.nextDouble();
            System.out.println("Digite o segundo valor:");
            y = sc.nextDouble();
            resultado = calc.soma(x, y);
            break;
        case 2:
            System.out.println("Digite o primeiro valor:");
            x = sc.nextDouble();
            System.out.println("Digite o segundo valor:");
            y = sc.nextDouble();
            resultado = calc.subtracao(x, y);
            break;
        case 3:
            System.out.println("Digite o primeiro valor:");
            x = sc.nextDouble();
            System.out.println("Digite o segundo valor:");
            y = sc.nextDouble();
            resultado = calc.multiplicacao(x, y);
            break;
        case 4:
            System.out.println("Digite o primeiro valor:");
            x = sc.nextDouble();
            System.out.println("Digite o segundo valor:");
            y = sc.nextDouble();
            resultado = calc.divisao(x, y);
            break;
        default:
            System.out.println("Operacao invalida");
        }
        System.out.println("Resultado : " + resultado);
        } while (op != 0);
        sc.close();
    }
}
