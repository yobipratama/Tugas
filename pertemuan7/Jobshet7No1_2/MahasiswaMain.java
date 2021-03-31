/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshet7No1_2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class MahasiswaMain {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();

        System.out.println("-----------------------------------------------------");
        System.out.print("Masukkan jumlah mahasiswa : ");
        data.pjgArr = s.nextInt();

        System.out.println("Masukkan data mahasiswa :");
        for (int i = 0; i < data.pjgArr; i++) {
            System.out.println("------------------");
            System.out.print("NIM \t: ");
            int nim = s.nextInt();
            System.out.print("Nama \t: ");
            String nama = s1.nextLine();
            System.out.print("Umur \t: ");
            int umur = s.nextInt();
            System.out.print("Ipk \t: ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur,
                    ipk);
            data.tambah(m);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa setelah dilakukan sorting :");
        data.insertionSort();
        data.tampil();

        System.out.println("_____________________________________________________");
        System.out.println("_____________________________________________________");
        System.out.println("Pencarian Data :");
        System.out.println("Masukkan NIM mahasiswa yang dicari :");
        System.out.print("NIM : ");
        int cari = s.nextInt();

        System.out.println("Menggunakan sequential search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("Menggunakan binary search");
        posisi = data.findBinarySearch(cari, 0,
                data.pjgArr - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
