package outrosTopicos;

import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {
        double x, resultado;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();

        resultado = Math.sqrt(x);

        System.err.println(resultado);
        sc.close();
    }
    
}
