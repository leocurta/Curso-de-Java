package vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("QUANTOS NUMEROS VOCE VAI DIGITAR?");
        n = sc.nextInt();
        int[] vet = new int[n];
        for (int i = 0; i< n; i++){
            System.out.printf("Digite um numero:");
            vet[i] = sc.nextInt();
            }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++ ){
            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }


    }
}
