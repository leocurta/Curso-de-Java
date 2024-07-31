package outrosTopicos;

import java.util.Scanner;

public class maiorEntreTres {
    public static void main(String[] args) {
        int a, b , c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c){
            System.out.printf("Maior = %d", a);
        } else if (b>c){
            System.out.printf("Maior = %d", b);
        } else {
            System.out.printf("Maior = %d", c);
        }
        sc.close();
    }
}
