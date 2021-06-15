/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Asus
 */
class Mahasiswa {
     String nim, nama, tlp;
    int absen;
    double ipk;
    
    Mahasiswa(String nim, String nama, String tlp){
        this.nama = nama;
        this.nim = nim;
        this.tlp = tlp;
    }
    
    @Override
    public String toString(){
            return ""+ nim +"       "+ nama +"     "+ tlp;
    }
}
