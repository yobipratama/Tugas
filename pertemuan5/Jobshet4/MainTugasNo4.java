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
import java.util.Scanner;

public class MainTugasNo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyak Suara : ");
        int jumlah = input.nextInt();

        TugasNo4 al = new TugasNo4(jumlah);
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama / Suara ke-" + (i + 1) + " = ");
            al.kandidat[i] = input.nextLine();

        }
        int hasil = al.ModusArray(al.kandidat, 0, jumlah, 0);
        System.out.println("Mayoritas Jumlah Suara yaitu : " + al.kandidat[hasil]);


    }
}
