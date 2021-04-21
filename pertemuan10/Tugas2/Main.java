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

public class Main {

    public static void menu() {
        System.out.println("Masukkan Operasi yang anda inginkan : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian terakhir");
        System.out.println("5. cek posisi antrian : ");
        System.out.println("6. cek data pada posisi tertentu : ");
        System.out.println("7. cek semua antrian : ");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();

        Queue antrian = new Queue(n);

        int pilih;
        do {
            menu();
            System.out.print("Masukkan pilihan : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("==============================================");
                    System.out.print("Masukkan nim : ");
                    String nim = sc.next();
                    System.out.print("Masukkan nama : ");
                    String nama = sc.next();
                    System.out.print("Masukkan absen : ");
                    int absen = sc.nextInt();
                    System.out.print("Masukkan ipk : ");
                    double ipk = sc.nextDouble();
                    Mahasiswa dataMasuk = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antrian.Enqueue(dataMasuk);
                    break;
                case 2:
                    System.out.println("==============================================");
                    Mahasiswa data = antrian.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && !"".equals(data.absen) && !"".equals(data.ipk)) {
                        System.out.println("Data yang dikeluarkan : " + data.nim + " " + data.nama + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    System.out.println("==============================================");
                    antrian.peek();
                    break;
                case 4:
                    System.out.println("==============================================");
                    antrian.peekrear();
                    break;
                case 5:
                    System.out.println("==============================================");
                    System.out.print("Masukkan nim yang dicari : ");
                    String dc = sc.nextLine();
                    antrian.peekPosition(dc);
                    break;
                case 6:
                    System.out.println("==============================================");
                    System.out.print("Masukkan indeks yang dicari : ");
                    int posisi = sc.nextInt();
                    antrian.printMahasiswa(posisi);
                    break;
                case 7:
                    System.out.println("==============================================");
                    antrian.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
