package estruturaCondicional;
import java.util.Scanner;   

public class exercicio4 {
    public static void main(String[] args) throws Exception {
        int h1, h2, dif;
        Scanner sc = new Scanner(System.in);
        h1 = sc.nextInt();
        h2 = sc.nextInt();

        dif = 24 - h1 + h2;

        System.out.printf("O JOGO DUROU %d HORAS(S)", dif);
        sc.close();
    }
}
