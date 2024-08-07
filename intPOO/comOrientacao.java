package intPOO;

import java.util.Scanner;
import intPOO.entities.Triangulo;
import java.util.Locale;

public class comOrientacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double p;
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        p = (x.a + x.b +x.c) / 2.0;
        x.area = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
       
        System.out.println("Entre com as medidas do triangulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        p = (y.a + y.b +y.c) / 2.0;
        y.area = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("A area do triangulo x é: %.4f%n", x.area);
        System.out.printf("A area do triangulo y é: %.4f%n", y.area);
        sc.close();
    }
}
