/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

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
            System.out.println("***********************");
            System.out.println("Data Buku Perpusatakaan");
            System.out.println("***********************");
            System.out.println();
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cek Judul Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.println("***********************");
            System.out.print("Pilihan Menu : ");
            menu = input.nextInt();
            if (menu == 1) {
                input.nextLine();
                System.out.println("-------------------");
                System.out.println("Masukkan Judul Buku");
                System.out.println("-------------------");
                String namajudul = input.nextLine();
                dll.push(namajudul);
            }
            if (menu == 2) {
                if (dll.isEmpty()) {
                    System.out.println("Linked List Masih Kosong");
                } else {
                    dll.removeTop();
                }
            }
            if (menu == 3) {
                if (dll.isEmpty()) {
                    System.out.println("Linked List Masih Kosong");

                } else {
                    System.out.println("Data Paling Atas Adalah : " + dll.peek());

                }

            }
            if (menu == 4) {
                dll.print();
            }
            System.out.println("");
            System.out.println("======================================");
            System.out.println("Apakah Anda akan kembali ke menu (y/n)");
            System.out.print("Pilih (y/n) : ");
            A = input.next().charAt(0);
            System.out.println("======================================");
            System.out.println("");
        } while (A == 'y');

    }
}
