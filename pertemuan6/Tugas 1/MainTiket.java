/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshet5No1;

/**
 *
 * @author Asus
 */
public class MainTiket {

    public static void main(String[] args) {
        TiketService ts = new TiketService();
        Tiket t1 = new Tiket("CITILINK", 100000, "MEDAN", "LAMPUNG");
        Tiket t2 = new Tiket("GARUDA AIR", 950000, "SURABAYA", "LOMBOK");
        Tiket t3 = new Tiket("WINGS AIR", 1200000, "BALI", "JAKARTA");
        Tiket t4 = new Tiket("BATIK AIR", 1500000, "MAKASAR", "BALI");
        Tiket t5 = new Tiket("AIR ASIA", 1200000, "LOMBOK", "BANTEN");
        ts.Tambah(t1);
        ts.Tambah(t2);
        ts.Tambah(t3);
        ts.Tambah(t4);
        ts.Tambah(t5);
        System.out.println("\tPENGURUTAN MASKAPAI DENGAN BUBLESORT");
        ts.BubleSort();
        ts.TampilAll();
        System.out.println("\tPENGURUTAN MASKAPAI DENGAN SELECTIONSORT");
        ts.SelectionShort();
        ts.TampilAll();

    }

}
