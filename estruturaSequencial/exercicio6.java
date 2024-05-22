package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        double A, B, C, areaTri, areaCir, areaTra, areaQ, areaR, pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTri = A * C/2;
        areaCir = Math.pow(C, 2) * pi;
        areaTra = (A + B) * C / 2;
        areaQ = Math.pow(B, 2);
        areaR = A * B;

        System.out.printf("TRIANGULO = %.3f%n", areaTri);
        System.out.printf("CIRCULO = %.3f%n", areaCir);
        System.out.printf("TRAPEZIO = %.3f%n", areaTra);
        System.out.printf("QUADRADO = %.3f%n", areaQ);
        System.out.printf("RETANGULO = %.3f%n", areaR);

        sc.close();
    }
}
