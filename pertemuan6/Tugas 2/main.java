/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet5;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PremierLeagueService list = new PremierLeagueService();
        PremierLeague m1 = new PremierLeague("Liverpool", 29, 45, 82);
        PremierLeague m2 = new PremierLeague("Manchaster city", 27, 39, 57);
        PremierLeague m3 = new PremierLeague("Chelsea", 29, 9, 48);
        PremierLeague m4 = new PremierLeague("Arsenal", 28, 4, 40);
        PremierLeague m5 = new PremierLeague("Tottenham hotspur", 29, 7, 41);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data team sebelum sorting  ");
        list.tampil();

        

        System.out.println("Data team setelah sorting asc berdasarkan ipk");
        boolean asc = true;
        list.insertionSort(asc);
        list.tampil();
    }
}


