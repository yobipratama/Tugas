/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

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
        char A;

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Pilihan Menu : ");
            menu = input.nextInt();
            if (menu == 1) {
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.println("Nomor Antrian:");
                int antrian = input.nextInt();
                input.nextLine();
                System.out.println("Nama Penerima:");
                String nama = input.nextLine();
                dll.Enqueue(antrian, nama);
            }
            if (menu == 2) {
                dll.Dequeue();
                System.out.println("++++++++++++++++++++++++");
                System.out.println("Daftar Pengantri Vaksin");
                System.out.println("++++++++++++++++++++++++");
                dll.print();
                System.out.println("Sisa Antrian : " + dll.size);
            }
            if (menu == 3) {
                System.out.println("++++++++++++++++++++++++");
                System.out.println("Daftar Pengantri Vaksin");
                System.out.println("++++++++++++++++++++++++");
                System.out.println("|No.\t|Nama\t|");
                dll.print();
                System.out.println("Sisa Antrian : " + dll.size);

            }
            System.out.println("");
            System.out.println("Apakah Anda akan kembali ke menu (y/n) ?");
            System.out.print("Pilih (y/n) : ");
            A = input.next().charAt(0);

        } while (A == 'y');

    }
}
