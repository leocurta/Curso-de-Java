package complementares;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws Exception{
        int op;
        double area;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("--------------------------");
            System.out.println("Selecione a opcao: ");
            System.out.println("(1) Calcular area de um quadrado: ");
            System.out.println("(2) Calcular area de um triangulo: ");
            System.out.println("(3) Calcular área de um circulo: ");
            System.out.println("(0) Para sair do programa: ");
            System.out.println("--------------------------------------");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    int l;
                    System.out.println("\nDigite o lado do quadrado:");
                    l = sc.nextInt();
                    area = l * l;
                    System.out.printf("A area do quadrado e: %.1f%n", area);
                    break;
                case 2: 
                int b, h;
                    System.out.println("\nDigite a base e altura do triangulo: ");
                    b = sc.nextInt();
                    h = sc.nextInt();
                    area = (b*h)/2;
                    System.out.printf("A area do triangulo e: %.2f%n", area);
                    break;
                case 3:
                    int r;
                    double pi = 3.14159;
                    System.out.println("\nDigite o raio do circulo: ");
                    r = sc.nextInt();
                    area = Math.pow(r, 2) * pi;
                    System.out.printf("A area do circulo e: %.2f%n", area);
                    break;
                default:
                    System.out.println("Opcao invalida! ");
                    break;       
            }
        } while(true);
    }
}
