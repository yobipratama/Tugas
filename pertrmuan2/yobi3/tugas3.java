/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yobi3;

class Barang {

    String nama;
    int hargaSatuan, jumlah;
    int HargaTotal, Diskon, HargaBayar;

    void hitungHargaTotal() {
        HargaTotal = hargaSatuan * jumlah;
    }

    void hitungDiskon() {
        if (HargaTotal > 100000) {
            Diskon = 10 / 100 * hargaSatuan * jumlah;
            System.out.println("Selamat Anda mendapatkan Diskon 10%");
        } else if ((HargaTotal >= 50000) && (HargaTotal <= 100000)) {
            Diskon = 5 / 100 * hargaSatuan * jumlah;
            System.out.println("Selamat Anda mendapatkan Diskon 5%");
        } else if (HargaTotal < 50000) {
            System.out.println("Mohon maaf Anda belum mendapatkan Diskon");
        }
    }

    void hitungHargaBayar() {
        HargaBayar = HargaTotal - Diskon;
    }

    void tampil() {
        System.out.println("Barang yang Anda beli = " + nama);
        System.out.println("Harga Satuan = " + hargaSatuan);
        System.out.println("Jumlah yang Anda beli = " + jumlah);
        System.out.println("Harga Total = " + HargaTotal);
        System.out.println("Besar yang harus Anda bayar = " + HargaBayar);
    }
}

public class tugas3 {

    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.nama = "Hoodie";
        brg.hargaSatuan = 85000;
        brg.jumlah = 2;

        brg.hitungHargaTotal();
        brg.hitungDiskon();
        brg.hitungHargaBayar();
        brg.tampil();
    }

}
