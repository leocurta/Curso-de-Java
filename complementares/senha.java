package complementares;
import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        String user;
        int senha;
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o usuario: ");
            user = sc.nextLine();
            if (user.equals("edmilson")){
                System.out.println("Digite a senha: ");
                senha = sc.nextInt();
                if (senha == 123456){
                    System.out.println("Acesso validado!");
                } else {
                    System.out.println("Usuario e senha nao conferem");
                }
            } else if (user.equals("campos")){
                System.out.println("Digite a senha: ");
                senha = sc.nextInt();
                if (senha == 654321){
                    System.out.println("Acesso validado!");
                } else {
                    System.out.println("Usuario e senha nao conferem");
                }
            } else {
                senha = sc.nextInt();
                System.out.println("Usuario e senha nao conferem");
            }
        sc.close();
    }
}  
