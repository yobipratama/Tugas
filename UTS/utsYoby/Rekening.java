/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsYoby;

/**
 *
 * @author Asus
 */
public class Rekening {

    String noRekening, nama, namaIbu, phone, email;

    public Rekening(String no, String na, String ib, String p, String e) {
        noRekening = no;
        nama = na;
        namaIbu = ib;
        phone = p;
        email = e;

    }

    void tampil() {
        System.out.println("NoRekening \t: " + noRekening);
        System.out.println("Nama \t: " + nama);
        System.out.println("Nama Ibu \t: " + namaIbu);
        System.out.println("Phone \t: " + phone);
         System.out.println("Email \t: " + email);


    }

}
