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
public class TugasNo4 {

    public int jumlah;
    public String kandidat[];

    TugasNo4(int jumlah) {
        this.jumlah = jumlah;
        this.kandidat = new String[jumlah];

    }

    public int ModusArray(String[] nama, int awal, int length, int hasil) {
        int mid = length / 2;
        int akhirArrayKiri = mid - 1;
        int akhirArrayKanan = length - 1;
        int al = rekursifDC(nama, awal, hasil, akhirArrayKanan, akhirArrayKiri, mid);
        return al;
    }

    public int rekursifDC(String[] nama, int awal, int hasil, int akhirArrayKanan, int akhirArrayKiri, int mid) {
        if (akhirArrayKanan == (akhirArrayKiri + 1) && akhirArrayKiri == (awal + 1)) {
            return hasil;
        } else {
            if (awal != akhirArrayKiri) {
                if (nama[awal].equalsIgnoreCase(nama[akhirArrayKiri])) {
                    return hasil = awal;
                } else {
                    return rekursifDC(nama, awal, hasil, akhirArrayKanan, (akhirArrayKiri - 1), mid);

                }

            } else {
                if (nama[mid].equalsIgnoreCase(nama[akhirArrayKanan])) {
                    return hasil = mid;

                } else {
                    return rekursifDC(nama, mid, hasil, (akhirArrayKanan - 1), akhirArrayKiri, mid);

                }

            }

        }

    }
}
