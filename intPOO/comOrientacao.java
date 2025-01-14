package intPOO;

import java.util.Scanner;
import intPOO.entities.Triangulo;
import java.util.Locale;

public class comOrientacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double areaX, areaY;
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        areaX = x.area();
       
        System.out.println("Entre com as medidas do triangulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        areaY = y.area();

        System.out.printf("A area do triangulo x é: %.4f%n", areaX);
        System.out.printf("A area do triangulo y é: %.4f%n", areaY);
        if (areaX == areaY){
            System.out.println("Ambas as areas sao iguais");
        } else if (areaX > areaY){
            System.out.println("O triangulo X e o maior");
        } else {
            System.out.println("O triangulo Y e o maior");
        }
        sc.close();
    }
}
