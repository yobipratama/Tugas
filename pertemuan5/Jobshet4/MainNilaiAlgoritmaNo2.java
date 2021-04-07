/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshet4;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class MainNilaiAlgoritmaNo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = input.nextInt();
        NilaiAlgoritmaNo2 mhs[] = new NilaiAlgoritmaNo2[jumlah];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new NilaiAlgoritmaNo2();
            input.nextLine();
            System.out.println("Mahasiswa Ke-" + (i + 1));
            System.out.print("Nama Mahasiswa : ");
            mhs[i].namaMhs = input.nextLine();
            System.out.print("Nilai Tugas Algoritma : ");
            mhs[i].nilaiTugas = input.nextInt();
            System.out.print("Nilai Kuis Algoritma : ");
            mhs[i].nilaiKuis = input.nextInt();
            System.out.print("Nilai UTS Algoritma : ");
            mhs[i].nilaiUTS = input.nextInt();
            System.out.print("Nilai UAS Algoritma : ");
            mhs[i].nilaiUAS = input.nextInt();
            System.out.println("");

        }
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Total Nilai Mahasiswa ke-" + (i + 1) + ": " + mhs[i].hitungTotalNilai());

        }
    }

}
