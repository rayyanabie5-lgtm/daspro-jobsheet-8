import java.util.Scanner;
public class Tugas2Job8 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n1 = 3;
        System.out.println("Pola persegi untuk n = " + n1 + ":");
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1; j++) {
                if (i == 1 || i == n1 || j == 1 || j == n1) {
                    System.out.print(n1 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();        
        int n2 = 5;
        System.out.println("Pola persegi untuk n = " + n2 + ":");
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2; j++) {
                if (i == 1 || i == n2 || j == 1 || j == n2) {
                    System.out.print(n2 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
    
    

