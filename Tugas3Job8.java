import java.util.Scanner;
public class Tugas3Job8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahCabang;
        int totalPelanggan = 0;
        int totalItem = 0;
        
        System.out.print("Jumlah cabang kafe: ");
        jumlahCabang = sc.nextInt();
        System.out.println("input penjualan per cabang = ");
        for (int i=1; i<=jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + "---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            int totalItemCabang = 0;
            for (int j=1; j<=jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }
            System.out.println("Cabang " + i + ":" );
            System.out.println("- Pelanggan: " + jumlahPelanggan + "orang" );
            System.out.println("- Item terjual: " + totalItemCabang );
            totalPelanggan += jumlahPelanggan;
            totalItem += totalItemCabang;
        }
        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("- Pelanggan: " + totalPelanggan + "orang" );
        System.out.println("- Item terjual: " + totalItem + "item" );
    }   
}
