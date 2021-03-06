/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

class mahasiswaa {

    String nama, nim, jk;
    double ipk;
    int pembagi;
    int total;

    double rata() {

        double rerata = total / pembagi;
        System.out.println("");
        System.out.println("ipk rata rata seluruh mahasiswa : ");
        return rerata;
    }
}

public class Nomor5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Jumlah mahasiswa : ");
        n = sc.nextInt();
        mahasiswaa[] mhs = new mahasiswaa[n];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new mahasiswaa();
            System.out.println("");
            System.out.println("Masukkan data mahasiswa ke - " + ((i + i)));
            System.out.print("Masukkan nama \t: ");
            mhs[i].nama = sc.nextLine();
            sc.nextLine();
            System.out.print("Masukkan nim \t: ");
            mhs[i].nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin \t: ");
            mhs[i].jk = sc.nextLine();
            System.out.print("Masukkan ipk \t\t: ");
            mhs[i].ipk = sc.nextDouble();

        }
        System.out.println("");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("");
            System.out.println("Data mahasiswa ke : " + (i + 1));
            System.out.println("Nama \t\t: " + mhs[i].nama);
            System.out.println("nim \t\t : " + mhs[i].nim);
            System.out.println("Jenis kelamin \t : " + mhs[i].jk);
            System.out.println("Masukkan ipk \t : " + mhs[i].ipk);
        }
        mahasiswaa rataIPK = new mahasiswaa();
        rataIPK.total = 0;
        rataIPK.pembagi = mhs.length;
        for (int i = 0; i < mhs.length; i++) {
            rataIPK.total += mhs[i].ipk;

        }
        System.out.println(rataIPK.rata());

    }

}
