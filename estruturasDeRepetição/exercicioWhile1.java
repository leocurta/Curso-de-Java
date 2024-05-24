package estruturasDeRepetição;
import java.util.Scanner;

public class exercicioWhile1 {
    public static void main(String[] args) {
        int senha;
        Scanner sc = new Scanner(System.in);

        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
