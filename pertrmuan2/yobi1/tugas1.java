/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yobi1;

class Lingkaran {

    double phi, r;
    double luas, keliling;

    void luasLingkaran() {
        luas = phi * r * r;
    }

    void kelilingLingkaran() {
        keliling = 2 * phi * r;
        System.out.println("Luas lingkaran : " + luas);
        System.out.println("Keliling lingkaran :" + keliling);
    }

}

public class tugas1 {

    public static void main(String[] args) {
        Lingkaran objek1 = new Lingkaran();
        objek1.phi = 3.14;
        objek1.r = 15;
        objek1.luasLingkaran();
        objek1.kelilingLingkaran();

    }

}
