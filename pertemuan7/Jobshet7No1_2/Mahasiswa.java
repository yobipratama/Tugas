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
public class Mahasiswa {

    String nama;
    int nim, umur;
    double ipk;

    public Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("NIM \t: " + nim);
        System.out.println("Nama \t: " + nama);
        System.out.println("Umur \t: " + umur);
        System.out.println("IPK \t: " + ipk);

    }
}
