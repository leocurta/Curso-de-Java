package intPOO;

import java.util.Scanner;

public class semOrientacao {
    public static void main(String[] args) {
    double aX, aY, p1, p2, l1, l2, l3, L1, L2, L3;;
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com as medidas do triangulo X:");
    l1 = sc.nextDouble();
    l2 = sc.nextDouble();
    l3 = sc.nextDouble();

    p1 = (l1 + l2 + l3)/2.0;

    System.out.println("Entre com as medidas do triangulo Y:");
    L1 = sc.nextDouble();
    L2 = sc.nextDouble();
    L3 = sc.nextDouble();

    p2 = (L1 + L2 + L3)/2.0;

    aX = Math.sqrt(p1 * (p1 - l1) * (p1 - l2) * (p1 - l3));
    System.out.printf("Área do triangulo X: %.4f%n", aX);

    aY = Math.sqrt(p2 * (p2 - L1) * (p2 - L2) * (p2 - L3));
    System.out.printf("Área do triangulo Y: %.4f%n", aY);

    if (aX > aY){
        System.out.println("O maior é o triangulo X");
    } else {
        System.out.println("O maior é o triangulo Y");
    }
    sc.close();
    }
    
}
