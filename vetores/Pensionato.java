package vetores;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de clientes: ");
        int n = sc.nextInt();
        Cliente[] c = new Cliente[n];
        sc.nextLine();
        for (int i=0; i < c.length; i++){
            c[i] = new Cliente();
            System.out.println("Cliente " + (i+1)+ ":");
            System.out.print("Name: ");
            c[i].setNome(sc.nextLine());
            System.out.print("Email: ");
            c[i].setEmail(sc.nextLine());
            System.out.print("Quarto: ");
            c[i].setQuarto(sc.nextInt());
            sc.nextLine();
        }
        System.out.println("Quartos ocupados:");
        for (int i=0; i < c.length; i++){
            if(c[i].getQuarto() != null){
                System.out.println((i+1)+ ": " + c[i].getNome() + ", " + c[i].getEmail());
            }
        }
    }
}
