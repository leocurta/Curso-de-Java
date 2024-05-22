package estruturaSequencial;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) throws Exception {
        int numeroFuncionario, horas;
        double valorPorHora, salario;

        Scanner sc = new Scanner(System.in);

        numeroFuncionario = sc.nextInt();
        horas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        salario = valorPorHora * horas;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + salario);

        sc.close();
    }
}
