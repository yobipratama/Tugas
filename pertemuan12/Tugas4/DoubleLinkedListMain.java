/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class DoubleLinkedListMain {

    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner input = new Scanner(System.in);

        int menu;
        String nim, nama;
        double ipk;
        char A = 0;
        do {
            System.out.println("================================");
            System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari NIM");
            System.out.println("9. Urut Data IPK-DESC");
            System.out.println("10. Keluar");

            System.out.println("==================================================");
            System.out.print("Masukkan Pilihan Menu : ");

            menu = input.nextInt();
            if (menu == 1) {

                System.out.println("Masukkan Data Mahasiswa Posisi Awal : ");
                System.out.print("NIM : ");
                nim = input.next();
                input.nextLine();
                System.out.print("Nama : ");
                nama = input.nextLine();
                System.out.print("IPK : ");
                ipk = input.nextDouble();
                input.nextLine();
                dll.addFirst(nim, nama, ipk);
                if (menu == 2) {

                    System.out.println("Masukkan Data Posisi Akhir : ");
                    System.out.print("NIM : ");
                    nim = input.next();
                    input.nextLine();
                    System.out.print("Nama : ");
                    nama = input.nextLine();
                    System.out.print("IPK : ");
                    ipk = input.nextDouble();
                    input.nextLine();
                    dll.addLast(nim, nama, ipk);
                }
                if (menu == 3) {

                    System.out.println("Masukkan Data Mahasiswa : ");
                    System.out.println("Data Node : ");
                    System.out.print("NIM : ");
                    nim = input.next(); //menginputkan data NIM
                    input.nextLine();
                    System.out.print("Nama : ");
                    nama = input.nextLine(); //menginputkan data Nama
                    System.out.print("IPK : ");
                    ipk = input.nextDouble(); //menginputkan data IPK
                    input.nextLine();
                    System.out.print("Data Mahasiswa ini akan dimasukkan di urutan ke-");
                    int index = input.nextInt();
                    dll.add(nim, nama, ipk, index);

                }
                if (menu == 4) {
                    dll.removeFirst();
                }
                if (menu == 5) {
                    dll.removeLast();
                }
                if (menu == 6) {

                    System.out.print("Masukkan indeks data mahasiswa yang akan dihapus : ");
                    int indeks = input.nextInt();

                    dll.remove(indeks);
                }
                if (menu == 7) {
                    System.out.println("Cetak Data");
                    dll.print();
                    System.out.println("Semua data berhasil dicetak");
                }
                if (menu == 8) {
                    System.out.println("Cari Data : ");
                    System.out.print("Masukkan NIM yang dicari: ");
                    nim = input.next();
                    dll.searchData(nim);
                }
                if (menu == 9) {
                    System.out.println("Cetak Data");
                    dll.sortList();
                    dll.printSort();
                    System.out.println("Data berhasil diurutkan secaradescending!");

                }
                System.out.println("");
                System.out.println("Apakah Anda akan kembali ke menu (y/n) ?");
                System.out.print("Pilih (y/n) : ");
                A = input.next().charAt(0);
                System.out.println("");
            }
            while (A == 'y');
        }
    }
}

