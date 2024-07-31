package outrosTopicos;
import java.util.Scanner;

public class sextoBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  oiiiiiiiiiiiii */
        int mascara = 32;
        int n = sc.nextInt(); // oiiii

        if((n & mascara) != 0){
            System.out.println("6º bit e verdadeiro");
        } else {
            System.out.println("6º bit e falso");
        }
    }
}
