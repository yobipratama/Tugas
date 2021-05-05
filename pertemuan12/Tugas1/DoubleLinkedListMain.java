package Tugas1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */


import java.util.Scanner;

public class DoubleLinkedListMain {
    private static char A;

    public static void main(String[] args) throws Exception {
       DoubleLinkedList dll = new DoubleLinkedList();
        Scanner input = new Scanner(System.in);
        int menu, inputdata, index;
        do {
            System.out.println("==================================================");
            System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LIST");

            System.out.println("==================================================");
            System.out.println("1. Tambah Head");
            System.out.println("2. Tambah Tail");
            System.out.println("3. Tambah Data");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari");
            System.out.println("9. Urut Data");
            System.out.println("10. Keluar");
            System.out.println("==================================================");
            System.out.print("Masukkan Pilihan Menu : ");
            menu = input.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan Data Posisi Head : ");
                inputdata = input.nextInt();
                dll.addFirst(inputdata);
            }
            if (menu == 2) {
                System.out.print("Masukkan Data Posisi Tail : ");
                inputdata = input.nextInt();
                dll.addLast(inputdata);
            }
            if (menu == 3) {
                System.out.println("Masukkan Data : ");
                System.out.print("Data Node : ");
                inputdata = input.nextInt();
                System.out.print("Alamat Pointer : ");
                index = input.nextInt();
                dll.add(inputdata, index);
            }
            if (menu == 4) {
                dll.removeFirst();

            }
            if (menu == 5) {
                dll.removeLast();

            }
            if (menu == 6) {
                System.out.print("Masukkan indeks yang akan dihapus : ");
                int indeks = input.nextInt();
                dll.remove(indeks);
            }
            if (menu == 7) {
                System.out.println("Cetak Data");
                dll.print();
            }
            if (menu == 8) {
                System.out.println("Cari Data : ");
                System.out.print("Masukkan nilai yang dicari: ");
                int cari = input.nextInt();
                if (cari != 0) {
                    dll.searchData(cari);
                }

            }
            if (menu == 9) {
                dll.sortList();
                System.out.println("Data berhasil diurutkan secara descending!");
            }
            System.out.println("");
            System.out.println("Apakah Anda akan kembali ke menu (y/n) ?");
            System.out.print("Pilih (y/n) : ");
            char A = input.next().charAt(0);
            System.out.println("");
        }
        while (A == 'y');


    }

}

