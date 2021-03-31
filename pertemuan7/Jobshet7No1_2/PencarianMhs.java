/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshet7No1_2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class PencarianMhs {

    int pjgArr;
    Mahasiswa listMhs[] = new Mahasiswa[100];
    int idx = 0;

    //method tambah
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else if (idx > pjgArr) {
            System.out.println("Data sudah penuh!!");
        }
    }

    //method tampil
    void tampil() {
        for (int i = 0; i < pjgArr; i++) {
            listMhs[i].tampil();
            System.out.println("---------------------");
        }
    }

    //method sequential searching
    public int findSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    //method insertion short
    public void insertionSort() {
        for (int i = 1; i < pjgArr; i++) {
            Mahasiswa tmp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].nim < tmp.nim) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }

    //method binary searching
    public int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listMhs[mid].nim == cari) {
                return (mid);
            } else if (listMhs[mid].nim < cari) {
                int mid1 = 0;
                return findBinarySearch(cari, left, mid1);
            } else {
                return findBinarySearch(cari, mid + 1,
                        right);
            }
        }
        return -1;
    }

    //method tampil posisi
    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks   " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    //method tampil data
    void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t: " + x);
            System.out.println(
                    "Nama \t: " + listMhs[pos].nama);
            System.out.println("Umur \t: " + listMhs[pos].umur);
            System.out.println("IPK \t: " + listMhs[pos].ipk);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");

        }
    }
}
