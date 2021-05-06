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
        //membuat objek dari class DoubleLinkedList
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner input = new Scanner(System.in);

        int menu; //mendeklarasikan variabel
        String nim, nama, jurusan, prodi;
        double ipk;
        char A;
        do { //membuat perulangan daftar menu menggunakan do-while
            System.out.println("================================");
            System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("================================");
            System.out.println("1. Tambah data Mahasiswa");
            System.out.println("2. Tambah data Mahasiswa posisi akhir");
            System.out.println("3. Tambah data Mahasiswa posisi awal");
            System.out.println("4. Hapus data Mahasiswa");
            System.out.println("5. Hapus data Mahasiswa posisi awal");
            System.out.println("6. Hapus data Mahasiswa posisi akhir");
            System.out.println("7. Cetak data Mahasiswa");
            System.out.println("8. Temukan data Mahasiswa urutan pertama");
            System.out.println("9. Cari data Mahasiswa (melalui NIM)");
            System.out.println("10. Urut data Mahasiswa (melalui IPK)");
            System.out.println("11. Keluar");
            System.out.println("==================================================");
            System.out.print("Masukkan Pilihan Menu : ");

            menu = input.nextInt();
            if (menu == 1) { //membuat menu untuk memasukkan data pada posisi awal
                System.out.println("Masukkan Data Mahasiswa : ");
                System.out.print("NIM : ");
                nim = input.next(); //menginputkan data NIM
                input.nextLine();
                System.out.print("Nama : ");
                nama = input.nextLine(); //menginputkan data Nama
                System.out.print("Jurusan : ");
                jurusan = input.nextLine();
                System.out.print("Prodi : ");
                prodi = input.nextLine();
                System.out.print("IPK : ");
                ipk = input.nextDouble(); //menginputkan data IPK
                input.nextLine();
                System.out.print("Data Mahasiswa ini akan dimasukkan di urutan ke-");
                int index = input.nextInt(); //menginputkan indeks
                dll.add(nim, nama, jurusan, prodi, ipk, index); //memanggil method add yg memiliki parameter
            }
            if (menu == 2) { //membuat menu untuk memasukkan data pada posisi akhir
                System.out.println("Masukkan Data Posisi Akhir : ");
                System.out.print("NIM : "); //menginputkan data NIM
                nim = input.next();
                input.nextLine();
                System.out.print("Nama : "); //menginputkan data Nama
                nama = input.nextLine();
                System.out.print("Jurusan : ");
                jurusan = input.nextLine();
                System.out.print("Prodi : ");
                prodi = input.nextLine();
                System.out.print("IPK : "); //menginputkan data IPK
                ipk = input.nextDouble();
                input.nextLine();
                dll.addLast(nim, nama, jurusan, prodi, ipk); //memanggil method addLast
            }
            if (menu == 3) { //membuat menu untuk memasukkan data pada posisi tertentu
                System.out.println("Masukkan Data Mahasiswa Posisi Awal : ");
                System.out.print("NIM : "); //menginputkan data NIM
                nim = input.next();
                input.nextLine();
                System.out.print("Nama : "); //menginputkan data Nama
                nama = input.nextLine();
                System.out.print("Jurusan : ");
                jurusan = input.nextLine();
                System.out.print("Prodi : ");
                prodi = input.nextLine();
                System.out.print("IPK : "); //menginputkan data IPK
                ipk = input.nextDouble();
                input.nextLine();
                dll.addFirst(nim, nama, jurusan, prodi, ipk); //memanggil method addFirst
            }
            if (menu == 4) {
                System.out.print("Masukkan indeks data mahasiswa yang akan dihapus : ");
                int indeks = input.nextInt(); //menginputkan indeks yg akan dihapus
                dll.remove(indeks); //memanggil method remove dg parameter indeks
            }
            if (menu == 5) {
                dll.removeFirst(); //memanggil method removeFirst
            }
            if (menu == 6) {
                dll.removeLast(); //memanggil method removeLast
            } if (menu == 7) { //membuat menu untuk mencetak data
                System.out.println("Cetak Data");
                dll.print(); //memanggil method print
                System.out.println("Semua data berhasil dicetak");
            } if (menu == 8) { //membuat menu untuk mencari data urutan pertama
                dll.getFirst();
            } if (menu == 9) { //membuat menu untuk mencari data berdasarkan NIM
                System.out.println("Cari Data : ");
                System.out.print("Masukkan NIM yang dicari: ");
                nim = input.next(); //menginputkan NIM yg dicari
                dll.searchData(nim); //memanggil method searchData
            } if (menu == 10) { //membuat menu untuk mengurutkan data
                System.out.println("Cetak Data");
                dll.sortList(); //memanggil method sortList
                dll.printSort(); //memanggil method printSort
                System.out.println("Data berhasil diurutkan secara descending!");
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

