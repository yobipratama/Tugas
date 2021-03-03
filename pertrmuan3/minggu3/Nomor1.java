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
class Kubus {

    int sisi;

    public Kubus(int s) {
        sisi = s;
    }

    Kubus() {
    }

    public int hitungLuasprmkkubus() {
        return 6 * sisi * sisi;
    }

    public int hitungVolumekubus() {
        return sisi * sisi * sisi;
    }
}

class Tabung {

    int jari2, tinggi;

    public Tabung(int r, int t) {
        jari2 = r;
        tinggi = t;
    }

    Tabung() {
    }

    public double hitungLuasPrmktabung() {
        return 2 * 3.14 * jari2 * (jari2 + tinggi);
    }

    public double hitungVolumetabung() {
        return 3.14 * jari2 * jari2 * tinggi;
    }
}

class Bola {

    int phi, jarijari;

    public Bola(int r) {
        jarijari = r;
    }

    Bola() {
    }

    public double hitungLuasprmkbola() {
        return 4 * 3.14 * jarijari * jarijari;
    }

    public double hitungVolumebola() {
        return 4 / 3 * 3.14 * jarijari * jarijari * jarijari;
    }
}

public class Nomor1 {

    public static void main(String[] args) {
        System.out.println("Progam Menghitung Luas Permukaan Dan Volume Pada Bangun Ruang");
        System.out.println("1. Kubus");
        System.out.println("2. Tabung");
        System.out.println("3. Bola");
        System.out.println("");
        System.out.println("");
        Scanner buana = new Scanner(System.in);
        Kubus[] kbsArray = new Kubus[2];
        Tabung[] tbgArray = new Tabung[2];
        Bola[] blArray = new Bola[2];
        for (int i = 0; i < 1; i++) {
            kbsArray[i] = new Kubus();
            System.out.println("1. Kubus");
            System.out.print("Masukkan sisi: ");
            kbsArray[i].sisi = buana.nextInt();
            tbgArray[i] = new Tabung();
            System.out.println("");
            System.out.println("2. Tabung");
            System.out.print("Masukkan jari-jari: ");
            tbgArray[i].jari2 = buana.nextInt();
            System.out.print("Masukkan tinggi: ");
            tbgArray[i].tinggi = buana.nextInt();
            blArray[i] = new Bola();
            System.out.println("");
            System.out.println("3. Bola");
            System.out.print("Masukkan jari-jari: ");
            blArray[i].jarijari = buana.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("");
            System.out.println("Luas Permukaan Kubus: " + kbsArray[i].hitungLuasprmkkubus());
            System.out.println("Volume Kubus: " + kbsArray[i].hitungVolumekubus());
            System.out.println("Luas Permukaan Tabung: " + tbgArray[i].hitungLuasPrmktabung());
            System.out.println("Volume Tabung: " + tbgArray[i].hitungVolumetabung());
            System.out.println("Luas Permukaan Bola: " + blArray[i].hitungLuasprmkbola());
            System.out.println("Volume Bola: " + blArray[i].hitungVolumebola());
            System.out.println("");

        }
    }

}


