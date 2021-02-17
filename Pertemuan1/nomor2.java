import java.util.Scanner;
public class nomor2 {
    public static void main(String[] args) {
        int uang = 1000000;
        double bunga = 0.02;
        int saldo = 1500000;
        
        int selisih = saldo - uang;
        int bungaBulan = (int) (uang + bunga);
        int bulan = selisih / bungaBulan;
        System.out.println("Uang = Rp. 1.000.000,-");
        System.out.println("Bunga = 20% perbulan");
        System.out.println("Saldo akhir = Rp.1.500.000,-");
        
        System.out.println("==================================================================");
        System.out.println("Pada bulan ke-" + bulan + "untuk mencapai saldo Rp. 1.500.000,-");
        System.out.println("==================================================================");
    }
    
}
