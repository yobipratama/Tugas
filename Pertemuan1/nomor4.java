
import java.util.Scanner;

public class nomor4 {

    public static Scanner sc = new Scanner(System.in);

    static void segitiga() {
        System.out.println("==================================================================");
        System.out.println("            PROGRAM MENGHITUNG LUAS SEGITIGA           ");
        System.out.println("==================================================================");
        System.out.println("Masukkan bilangan 1 sebagai alas\t: ");
        int bil1 = sc.nextInt();
        System.out.println("Masukkan bilangan 2 sebagai tinggi\t ");
        int bil2 = sc.nextInt();
        int luasSegi = bil1 * bil2 / 2;
        System.out.println("Luas segitiga tersebut adalah\t\t: " + luasSegi);
    }

    static void persegiPanjang() {
        System.out.println("==================================================================");
        System.out.println("            PROGRAM MENGHITUNG LUAS PERSEGI PANJANG           ");
        System.out.println("==================================================================");
        System.out.println("Masukkan bilangan 1 sebagai panjang\t: ");
        int bil3 = sc.nextInt();
        System.out.println("Masukkan bilangan 2 sebagai panjang\t: ");
        int bil4 = sc.nextInt();
        int luasP = bil4;
        System.out.println("Luas persegi panjang tersebut adalah\t: " + luasP);

    }

    static void lingkaran() {
        System.out.println("==================================================================");
        System.out.println("            PROGRAM MENGHITUNG LUAS LINGKARAN           ");
        System.out.println("==================================================================");
        System.out.println("Masukkan bilangan sebagai jari-jari\t: ");
        int bil5 = sc.nextInt();
        double luasL = 3.14 * bil5;
        System.out.println("Luas lingkaran tersebut adalah\t\t: " + luasL);
    }

    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("            PROGRAM MENGHITUNG LUAS BANGUN DATAR           ");
        System.out.println("==================================================================");
        char kembali = 0;
        do {

            System.out.println("Menu utama program perhintungan luas bangun datar : ");
            System.out.println("1.Menghitung bangun datar segitiga");
            System.out.println("2.Menghitung bangun datar persegi panjang");
            System.out.println("3.Menghitung bangun datar lingkaran");
            System.out.println("4.Keluar");
            System.out.println("Masukkan menu yang anda pilih dengan dengan angka (1-5) : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    segitiga();
                    break;
                case 2:
                    persegiPanjang();
                    break;
                case 3:
                    lingkaran();
                    break;
                case 4:
                    System.out.println("Terimakasih suda menggunakan program perhitungan luas bangun datar");
                    break;
            }
            System.out.print("Apakah anda ingin kembali ke menu utama? (Y/T) : ");
            kembali = sc.next().charAt(0);

        } while (kembali != 'T');
        System.out.println("Terimakasih atas partisipasi anda! ");
        System.out.println("Kami tunggu anda menggunakan program perhitungan luas bangun datar ini kembali");

    }

}
