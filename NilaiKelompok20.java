import java.util.Scanner;
public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j, nilai;
        float totalNilai, rataNilai;
        
        
        for (i = 1; i <= 6; i++) {
            System.out.println("\nKelompok " + i);
            totalNilai = 0; 
            
            
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai ke-" + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            
            
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai Kelompok " + i + " = " + rataNilai);
        }
    }
}
