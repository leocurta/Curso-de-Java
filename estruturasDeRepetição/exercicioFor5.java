package estruturasDeRepetição;
import java.util.Scanner;           


public class exercicioFor5 {
    public static void main(String[] args) {
        int n, fat = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        if (n == 0){
            System.out.println("1");
        } else{
            for (int i=1; i<=n; i++){
                fat *= i;
            }
        }
        System.out.println(fat);
        sc.close();
    }    
}
