/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Asus
 */
public class main {
     List<Mahasiswa> mhs = new ArrayList<>();
    List<MataKuliah> mk = new ArrayList<>();
    List<Nilai> nli = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        main obj = new main();
        int pilih; //mendeklarasikan variabel pilih
        obj.setDataMHSdanMatkul();
        do {
        System.out.println("***********************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("***********************************************");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Keluar");
        System.out.println("***********************************************");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
            if (pilih == 1) {
                obj.menusatu();
            } else if (pilih == 2) {
                obj.menudua();
            } else if (pilih == 3) {
                obj.menutiga();
            } else if (pilih == 4) {
                obj.menuempat();
            } else {
                System.out.println("Good Bye!!!");
            }
            System.out.println("");
        } while (pilih >= 1 && pilih <= 4);
    }

    void setDataMHSdanMatkul(){
        mhs.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        mhs.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        mhs.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        mhs.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        mhs.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        mhs.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        mk.add(new MataKuliah("00001", "Internet of Things", "3"));
        mk.add(new MataKuliah("00002", "Algoritma dan Struktur Data", "2"));
        mk.add(new MataKuliah("00003", "Algoritma dan Pemrograman", "2"));
        mk.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data",
        "3"));
        mk.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman",
        "3"));
    }

    void menusatu(){
        input.nextLine();
        System.out.println("Masukkan Data ");
        System.out.print("Kode : ");
        String kode = input.next();
        System.out.print("Nilai : ");
        float nilai = input.nextFloat();
        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\tNama\t\tTelf");
        mhs.stream().forEach((mahasiswa) -> {
            System.out.println(mahasiswa.nim + "\t" + mahasiswa.nama + "\t\t" +
                    mahasiswa.tlp);
         });
        boolean ketemu = true;
        String pilihmahasiswa; int konfirmasi2 = 0;
        do {
            System.out.print("Pilih Mahasiswa by NIM : ");
            pilihmahasiswa = input.next();
            for (Mahasiswa mahasiswa : mhs) {
                if (pilihmahasiswa.equals(mahasiswa.nim)) {
                    ketemu = false;
                    konfirmasi2++;
                }
            }
            if (konfirmasi2 == 0) {
                System.out.println("Data Kode NIM Tidak Ditemukan");
            }
        } while (ketemu);

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        System.out.println("Kode\tMata Kuliah\t\t\tSKS");
        mk.stream().forEach((matakuliah) -> {
            System.out.println(matakuliah.kode+"\t" + matakuliah.matkul +
                    "\t" + matakuliah.sks);
         });
        boolean ketemu2 = true;
        String pilihmatakuliah; int konfirmasi = 0;
        do {
            System.out.print("Pilih MK by Kode : ");
            pilihmatakuliah = input.next();
            for (MataKuliah mklh : mk) {
                if (pilihmatakuliah.equals(mklh.kode)) {
                    ketemu2 = false;
                    konfirmasi++;
                }   
            }
            if (konfirmasi == 0) {
                System.out.println("Data Kode Matakuliah Tidak Ditemukan");
            }
          } while (ketemu2);
            nli.add(new Nilai(kode, nilai, pilihmatakuliah, pilihmahasiswa));
    }  

    void menudua(){
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\tNama Mahasiswa\t\tMataKuliah\t\t\tSKS\tNilai");
        nli.forEach(nilaisatuan -> {
            System.out.print(nilaisatuan.nimmhs+"\t");
            for (Mahasiswa mahasiswa : mhs) {
                if(mahasiswa.nim.equals(nilaisatuan.nimmhs)){
                    System.out.print(mahasiswa.nama+"\t\t\t");
                }
            }
            for (MataKuliah matkul : mk) {
                if (matkul.kode.equals(nilaisatuan.kodematkul)) {
                    System.out.print(matkul.matkul + "\t" +
                    matkul.sks+"\t");
                }
            }
            System.out.println(nilaisatuan.nilai);
        });
    }

    void menutiga(){
        menudua();
        System.out.print("Masukkan Data Mahasiswa[nim] : ");
        String caridata = input.next();
        int konfirmasi3 = 0;
        for (Nilai carinilai : nli) {
            if (carinilai.nimmhs.equals(caridata)) {
                System.out.print(carinilai.nimmhs+"\t");
                for (Mahasiswa mahasiswa : mhs) {
                    if(mahasiswa.nim.equals(carinilai.nimmhs)){
                         System.out.print(mahasiswa.nama+"\t");
                    }
                }
                for (MataKuliah matkul : mk) {
                    if (matkul.kode.equals(carinilai.kodematkul)) {
                        System.out.print(matkul.matkul + "\t" + matkul.sks+"\t");
                    }
                }
                System.out.println(carinilai.nilai);
                konfirmasi3++;
            }
        }
        if (konfirmasi3 == 0) {
            System.out.println("Data Dengan NIM " + caridata + " Tidak Ditemukan");
        }
    }

    void menuempat(){
        for (int i = 0; i < nli.size()-1; i++) {
            for (int j = 0; j < nli.size()-i-1; j++) {
                if (nli.get(j).nilai > nli.get(j+1).nilai){
                    float swap = nli.get(j).nilai;
                    nli.get(j).nilai = nli.get(j+1).nilai;
                    nli.get(j+1).nilai = swap;
                }
            }
        }
        menudua();
    }
}



