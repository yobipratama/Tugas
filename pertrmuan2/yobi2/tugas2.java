/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yobi2;

class toko {

    int id, hari, harga, bayar;
    String nama, game;

    void penyewaan() {
        bayar = harga * hari;

        System.out.println("Nomor id : " + id);
        System.out.println("Nama anda : " + nama);
        System.out.println("Nama game : " + game);
        System.out.println("Harga perhari " + hari);
        System.out.println("Berapa lama anda menyewa :" + hari);
        System.out.println("Total yang harus dibayar :" + bayar);
    }

}

public class tugas2 {

    public static void main(String[] args) {
        toko kita = new toko();
        kita.id = 666;
        kita.harga = 10000;
        kita.nama = "Ahmad";
        kita.game = "cyber punk";
        kita.hari = 7;
        kita.penyewaan();
        
        

    }

}
