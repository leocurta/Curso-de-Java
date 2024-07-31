package outrosTopicos;
import java.util.Scanner;

public class funcoesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String og = "abcde FGHIJ klmn ABC abc DEFG    ";
        System.out.println(og);

        String s01 = og.toLowerCase();
        System.out.println(s01 + "-");

        String s02 = og.toUpperCase();
        System.out.println(s02 + "-");

        String s03 = og.trim();
        System.out.println(s03);

        String s04 = og.substring(2);
        System.out.println(s04);

        
        sc.close();
    }
}
