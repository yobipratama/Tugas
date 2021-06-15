/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Asus
 */
public class BukuMain {
    public static void main(String[] args) {
        Stack<Buku> buku = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("************************");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("************************");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("************************");
        int pilih;
        do {
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1 :
                    System.out.print("ISBN     : ");
                    String isbn = sc.nextLine();
                    System.out.print("Judul    : ");
                    String judul = sc.nextLine();
                    System.out.print("Terbit   : ");
                    String terbit = sc.nextLine();
                    System.out.print("Penerbit : ");
                    String penerbit = sc.nextLine();
                    Buku b = new Buku();
                    buku.push(b = new Buku(isbn, judul, terbit, penerbit));
                    System.out.println("");
                    break;
                case 2 :
                    System.out.println("Buku pada urutan teratas telah diambil");
                    while(!buku.empty()){
                        System.out.printf("%s ", buku.pop());
                    }
                    System.out.println("");
                    break;
                case 3 :
                    System.out.print("Buku{" + "isbn=" + (buku.get(buku.size() -
                    1).isbn) + ", " + "judul=" + (buku.get(buku.size() - 1).judul) +
                    ", " + "Terbit=" + (buku.get(buku.size() - 1).terbit) + ", "
                    + "Penerbit=" + (buku.get(buku.size() - 1).penerbit) +
                    '}');
                    System.out.println("");
                    break;
                case 4 :
                    buku.stream().forEach(bk -> {
                    System.out.println("Buku{" + "isbn=" + bk.isbn + ", " +
                    "judul=" + bk.judul+ ", " + "terbit=" + bk.terbit + ", " + "penerbit="
                            + bk.penerbit + '}');
                    });
                    System.out.println("");
                    break;
                }
        } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}

