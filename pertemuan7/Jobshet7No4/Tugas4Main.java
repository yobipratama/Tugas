/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshet7No4;

/**
 *
 * @author Asus
 */
public class Tugas4Main {

    public static void main(String args[]) {
        int arr[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};

        Tugas4 tg = new Tugas4(arr);

        System.out.println("-----------------------------------------------------");
        System.out.println("Data sebelum diurutkan");
        tg.tampilAll();
        System.out.println("-----------------------------------------------------");
        System.out.println("Data setelah diurutkan secara descending");
        int max = tg.insertionSort();
        tg.tampilAll();
        System.out.println("-----------------------------------------------------");
        System.out.println("Data yeng merupakan nilai terbesar adalah \t: " + max);
        int jmlMax = tg.findBinarySearch(max, 0,
                arr.length - 1);
        System.out.println("-----------------------------------------------------");
        System.out.println("Nilai terbesar yaitu " + max + " ada sebanyak \t\t: " + jmlMax);
        System.out.println("-----------------------------------------------------");
        tg.tampilLokasi(max, jmlMax);
        System.out.println("-----------------------------------------------------");
    }
}
