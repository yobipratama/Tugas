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
public class PremierLeagueService {

    PremierLeague  listPl[] = new PremierLeague [5];
    int idx;

    void tambah(PremierLeague t) {
        if (idx < listPl.length) {
            listPl[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (PremierLeague  t : listPl) {
            t.tampil();
            System.out.println("-----------------------------");
        }
    }

    void insertionSort(boolean asc) {
        for (int i = 1; i < listPl.length; i++) {
            PremierLeague temp = listPl[i];
            int j = i;

            if (asc) {
                while (j > 0 && listPl[j - 1].points > temp.points) {
                    listPl[j - 1] = listPl[j];
                    j--;
                }
            } else {

            }
            listPl[j] = temp;
        }
    }
}
