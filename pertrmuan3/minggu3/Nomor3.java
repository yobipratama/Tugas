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

class Tanahh {

    int panjang, lebar;

    int luas() {
        return panjang * lebar;
    }
}

public class Nomor3 {

    public static void main(String[] args) {
        Scanner buana = new Scanner(System.in);
        int n;
        System.out.print("Jumlah tanah: ");
        n = buana.nextInt();

        Tanahh[] tanahh = new Tanahh[n];
        int[] luasTanah = new int[n];

        for (int i = 0; i < tanahh.length; i++) {
            tanahh[i] = new Tanahh();
            System.out.print("Tanah " + (i + 1));
            System.out.println("");
            System.out.println("");
            System.out.print("Panjang\t: ");
            tanahh[i].panjang = buana.nextInt();
            System.out.print("Lebar\t: ");
            tanahh[i].lebar = buana.nextInt();
            luasTanah[i] = tanahh[i].luas();
        }
        System.out.println("");
        for (int i = 0; i < tanahh.length; i++) {
            System.out.println("Luas Tanah: " + (i + 1) + ": " + luasTanah[i]);
        }
        System.out.println("");
        int indexBesar = luasTanah[0];
        int index = 1;
        for (int i = 0; i < luasTanah.length; i++) {
            if (luasTanah[i] > indexBesar) {
                indexBesar = luasTanah[i];
                index = i + 1;

            }
            System.out.println("Tanah terluas = tanah " + index + "(" + indexBesar + ")");

        }
    }
}
