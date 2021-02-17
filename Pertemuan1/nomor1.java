
import java.util.Scanner;

public class nomor1 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================================");
        System.out.println("                    PROGRAM LAUNDRY BAJU                             ");
        System.out.println("==================================================================");
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();

        System.out.print("Berapa Kg cucian anda : ");
        int Kg = sc.nextInt();
        System.out.println("==================================================================");
        int total = (Kg * 4500);

        System.out.println("Biaya cucian anda : " + total);

        if (Kg > 10) {
            int total2 = (total * 5 / 100);
            System.out.println("Selamat anda mendapatkan diskon 5%");
            System.out.println("Diskon : " + total2);
            int total3 = (total - total2);
            System.out.println("Harga bayar : " + total3);
        } else {

        }

    }
}